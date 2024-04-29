package org.assetnexus.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.assetnexus.request.NftAuthorizeRequest;
import org.assetnexus.request.NftCreateRequest;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;

/**
 * @author xiaomi
 * @since 2024/4/28 16:22
 */
@Mapper
public interface NftItemMapper {

    void insert(@Param("request") NftCreateRequest request);

    HashMap<String,String> queryAuthorizeAddressById(@Param("id")Long id);

    void updateAuthorizeInfo(@Param("request") NftAuthorizeRequest request);
}
