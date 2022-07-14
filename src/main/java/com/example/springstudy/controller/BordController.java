package com.example.springstudy.controller;

import com.example.springstudy.model.BordDetailReq;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BordController {

    // 글 등록
    @PostMapping("/bord/register")
    public void registerBord(
            @RequestBody BordDetailReq bordDetailReq
            ) {

    }
}
