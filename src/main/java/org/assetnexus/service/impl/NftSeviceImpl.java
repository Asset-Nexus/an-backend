package org.assetnexus.service.impl;

import org.assetnexus.mapper.NftHeadMapper;
import org.assetnexus.mapper.NftItemMapper;
import org.assetnexus.request.NftAuthorizeRequest;
import org.assetnexus.request.NftCreateRequest;
import org.assetnexus.request.NftListRequest;
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
public class NftSeviceImpl implements NftService {

    @Autowired
    private NftHeadMapper nftHeadMapper;

    @Autowired
    private NftItemMapper nftItemMapper;

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
    public void issue(Long id) {
        nftHeadMapper.updateIssueFlagById(id);
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
}
