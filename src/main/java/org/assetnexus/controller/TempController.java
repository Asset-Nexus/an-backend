package org.assetnexus.controller;

import org.assetnexus.common.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TempController {

    @GetMapping("/get")
    public Result<String> test(){
        return Result.newSuccess("ok");
    }
}
