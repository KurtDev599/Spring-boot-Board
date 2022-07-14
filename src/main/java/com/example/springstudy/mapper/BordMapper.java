package com.example.springstudy.mapper;

import com.example.springstudy.model.BordDetailReq;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface BordMapper {

    void registerBord(BordDetailReq bordDetailReq);
}
