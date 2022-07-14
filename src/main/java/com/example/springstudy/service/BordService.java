package com.example.springstudy.service;

import com.example.springstudy.mapper.BordMapper;
import com.example.springstudy.model.BordDetailReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class BordService {

    private final BordMapper bordMapper;

    public void bordRegister(BordDetailReq bordDetailReq) {
        bordMapper.registerBord(bordDetailReq);
    }
}
