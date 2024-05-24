package org.assetnexus.service;

import org.assetnexus.request.*;
import org.assetnexus.response.NftBoughtListResponse;
import org.assetnexus.response.NftDetailResponse;
import org.assetnexus.response.NftListResponse;

import java.util.List;

/**
 * @author xiaomi
 * @since 2024/4/25 12:32
 */
public interface NftService {
    List<NftListResponse> list(NftListRequest request);

    NftDetailResponse detail(Long id);

    void create(NftCreateRequest request);

    int issue(NftIssueRequest param);

    void authorize(NftAuthorizeRequest request) throws Exception;

    void buy(NftBuyRequest request);


    List<NftBoughtListResponse> boughtList(String addr);
}
