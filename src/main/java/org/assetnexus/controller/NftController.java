package org.assetnexus.controller;

import lombok.extern.slf4j.Slf4j;
import org.assetnexus.request.NftListRequest;
import org.assetnexus.response.NftListResponse;
import org.assetnexus.service.NftService;
import org.assetnexus.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaomi
 * @since 2024/4/25 12:39
 */
@Slf4j
@RestController
@RequestMapping("/nft")
public class NftController {
    @Autowired
    private NftService nftService;

    @GetMapping("/list")
    public ResponseVO<NftListResponse> list(NftListRequest listRequest){
        return ResponseVO.newSuccess(nftService.list());
    }


}
