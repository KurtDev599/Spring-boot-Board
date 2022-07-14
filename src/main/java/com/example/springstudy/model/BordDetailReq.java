package com.example.springstudy.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

import java.util.Date;

@Getter
@Setter
@Alias("bordDetailReq")
public class BordDetailReq {
    // 게시글 일련변호
    private int bordSequence;

    // 게시글 작성자 일련번호
    private int userSequence;

    // 게시글 작성자 이름
    private String userName;

    // 게시글 제목
    private String bordTitle;

    // 게시글 내용
    private String bordContent;

    // 게시글 등록일
    private Date bordCreateDateTime;
}
