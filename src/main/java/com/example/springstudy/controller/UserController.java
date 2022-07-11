package com.example.springstudy.controller;

import com.example.springstudy.model.UserDetailReq;
import com.example.springstudy.model.UserDetailRes;
import com.example.springstudy.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    // 유저 리스트 조회
    @GetMapping("/user/list")
    public List<UserDetailRes> selectUserList() {
        return Collections.singletonList(userService.selectUserList());
    }

    // 회원가입
    @PostMapping("/user/join")
    public void insertJoinUser(
            @RequestBody UserDetailReq userDetailReq
            ) throws Exception {
        userService.insertJoinUser(userDetailReq);
    }

    // localhost:8080 시 login 으로 redirect
    @GetMapping
    public String root() {
        return "redirect:/login";
    }

    // 로그인 완료
    @GetMapping("user_access")
    public ModelAndView userAccess() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user_access");
        return modelAndView;
    }

    // 로그인 폼
    @GetMapping("/login")
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }

    // 로그인 실패 폼
    @GetMapping("/access_denied")
    public ModelAndView accessDenied() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("access_denied");
        return modelAndView;
    }
}
