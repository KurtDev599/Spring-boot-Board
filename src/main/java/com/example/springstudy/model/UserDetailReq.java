package com.example.springstudy.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

import java.util.Date;

@Getter
@Setter
@Alias("userDetailReq")
public class UserDetailReq {

    // user 일련번호
    private int userSequence;

    // user ID
    private String userId;

    // user 이름
    private String userName;

    // user 비밀번호
    private String userPassword;

    // user Email
    private String userEmail;

    // user 가입 날자
    private Date userCreateDate;
}
