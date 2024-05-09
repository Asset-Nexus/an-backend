package org.assetnexus.controller;

import lombok.extern.slf4j.Slf4j;
import org.assetnexus.request.NftAuthorizeRequest;
import org.assetnexus.request.NftCreateRequest;
import org.assetnexus.request.NftIssueRequest;
import org.assetnexus.request.NftListRequest;
import org.assetnexus.response.NftDetailResponse;
import org.assetnexus.response.NftListResponse;
import org.assetnexus.service.NftService;
import org.assetnexus.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

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
    public ResponseVO<List<NftListResponse>> list(NftListRequest listRequest){
        return ResponseVO.newSuccess(nftService.list(listRequest));
    }

    @GetMapping("/detail/{id}")
    public ResponseVO<NftDetailResponse> detail(@PathVariable("id") Long id){
        return ResponseVO.newSuccess(nftService.detail(id));
    }

    @PostMapping("/create")
    public ResponseVO create(@RequestBody NftCreateRequest request){
        nftService.create(request);
        return ResponseVO.newSuccess();
    }

    @PostMapping("/issue")
    public ResponseVO issue(@Valid @RequestBody NftIssueRequest request){
       int effectRows= nftService.issue(request);
        return ResponseVO.newSuccess("Effect Rows : " +effectRows);
    }

    @PostMapping("/authorize")
    public ResponseVO authorize(@RequestBody NftAuthorizeRequest request) throws Exception {
        nftService.authorize(request);
        return ResponseVO.newSuccess();
    }
}
