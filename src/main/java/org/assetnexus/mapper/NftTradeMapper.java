package org.assetnexus.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.assetnexus.request.NftAuthorizeRequest;
import org.assetnexus.request.NftBuyRequest;
import org.assetnexus.request.NftCreateRequest;
import org.assetnexus.response.NftBoughtListResponse;

import java.util.HashMap;
import java.util.List;

/**
 * @author xiaomi
 * @since 2024/4/28 16:22
 */
@Mapper
public interface NftTradeMapper {
    void buy(@Param("request") NftBuyRequest request);

    List<NftBoughtListResponse> selectBoughtList(@Param("addr") String addr);


    void updateIssueFlag(@Param("tokenId") String tokenId);
}
