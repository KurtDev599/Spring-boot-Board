package com.example.springstudy.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class UserDetailRes {
    // user list
    private List<UserDetailRes.InnerUserList> userList;

    @Getter
    @Setter
    public static class InnerUserList {

        // user 일련번호
        private int userSequence;

        // user ID
        private String userId;

        // user password
        @JsonIgnore
        private String userPassword;

        // user 이름
        private String userName;

        // user email
        private String userEmail;

        // user 가입 날자
        private Date userCreateDate;
    }
}
