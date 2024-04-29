package org.assetnexus.service;

import org.assetnexus.request.NftAuthorizeRequest;
import org.assetnexus.request.NftCreateRequest;
import org.assetnexus.request.NftListRequest;
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

    void issue(Long id);

    void authorize(NftAuthorizeRequest request) throws Exception;
}
