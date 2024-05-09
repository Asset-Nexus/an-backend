package org.assetnexus.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import org.assetnexus.request.NftCreateRequest;
import org.assetnexus.request.NftIssueRequest;
import org.assetnexus.request.NftListRequest;
import org.assetnexus.response.NftDetailResponse;
import org.assetnexus.response.NftListResponse;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author xiaomi
 * @since 2024/4/28 12:43
 */
@Mapper
@Repository
public interface NftHeadMapper {

    List<NftListResponse> list(@Param("request") NftListRequest request);

    NftDetailResponse detail(@Param("id") Long id);

    void insert(@Param("request") NftCreateRequest request);

    int updateIssueFlagById(@Param("param") NftIssueRequest param);

}
