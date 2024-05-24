package org.assetnexus.service.impl;

import com.alibaba.fastjson2.JSON;
import lombok.extern.slf4j.Slf4j;
import org.assetnexus.mapper.NftHeadMapper;
import org.assetnexus.mapper.NftItemMapper;
import org.assetnexus.mapper.NftTradeMapper;
import org.assetnexus.request.*;
import org.assetnexus.response.NftBoughtListResponse;
import org.assetnexus.response.NftDetailResponse;
import org.assetnexus.response.NftListResponse;
import org.assetnexus.service.NftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

/**
 * @author xiaomi
 * @since 2024/4/25 12:33
 */
@Service
@Slf4j
public class NftSeviceImpl implements NftService {

    @Autowired
    private NftHeadMapper nftHeadMapper;

    @Autowired
    private NftItemMapper nftItemMapper;

    @Autowired
    private NftTradeMapper nftTradeMapper;

    @Override
    public List<NftListResponse> list(NftListRequest request) {
        return nftHeadMapper.list(request);
    }

    @Override
    public NftDetailResponse detail(Long id) {
        return nftHeadMapper.detail(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void create(NftCreateRequest request) {
        nftHeadMapper.insert(request);
        nftItemMapper.insert(request);
    }

    @Override
    public int issue(NftIssueRequest param) {
       int effectRows= nftHeadMapper.updateIssueFlagById(param);
       log.info("issue方法,参数信息：{},影响的行数：{}", JSON.toJSONString(param),effectRows);
       return effectRows;
    }

    @Override
    public void authorize(NftAuthorizeRequest request) throws Exception {
        //判断授权地址与数据库中是否一致
        HashMap<String, String> authorizeAddress = nftItemMapper.queryAuthorizeAddressById(request.getId());
        if (!authorizeAddress.getOrDefault("from_address", "").equals(request.getFromAddress())) {
            throw new Exception("授权地址不正确！");
        }
        request.setToAddress(String.join(",", authorizeAddress.getOrDefault("from_address", ""), request.getToAddress()));
        nftItemMapper.updateAuthorizeInfo(request);
    }

    @Override
    public void buy(NftBuyRequest request) {

        nftTradeMapper.buy(request);

    }

    @Override
    public List<NftBoughtListResponse> boughtList(String addr) {
        return nftTradeMapper.selectBoughtList(addr);
    }
}
