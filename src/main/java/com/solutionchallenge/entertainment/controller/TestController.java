package com.solutionchallenge.entertainment.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("testuser")
@RequiredArgsConstructor
public class TestController {
    @PostMapping("")
    public String test(@AuthenticationPrincipal String nickName){
        return nickName;
    }
}
