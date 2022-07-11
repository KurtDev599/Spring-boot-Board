package com.example.springstudy.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BordModel {
    // 게시글 일련변호
    private int bordSequence;

    // 게시글 작성자 일련번호
    private int userSequence;

    // 게시글 제목
    private String bordTitle;

    // 게시글 내용
    private String bordContent;

    // 게시글 등록일
    private Date bordCreateDateTime;
}
