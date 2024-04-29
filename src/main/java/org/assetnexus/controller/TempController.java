package org.assetnexus.controller;

import lombok.extern.slf4j.Slf4j;
import org.assetnexus.vo.ResponseVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/test")
public class TempController {

    @GetMapping("/get")
    public ResponseVO<String> test() throws Exception {
        return ResponseVO.newSuccess("ok");
    }
}
