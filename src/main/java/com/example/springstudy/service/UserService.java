package com.example.springstudy.service;

import com.example.springstudy.mapper.UserMapper;
import com.example.springstudy.model.UserDetailReq;
import com.example.springstudy.model.UserDetailRes;
import com.example.springstudy.model.UserLoginReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import static com.example.springstudy.utils.BasedUtil.generatedInvestUserId;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

    private final UserMapper userMapper;

    // 유저 리스트 조회
    public UserDetailRes selectUserList() {
        UserDetailRes userDetailRes = new UserDetailRes();

        userDetailRes.setUserList(userMapper.selectUserList());

        return userDetailRes;
    }

    // 회원가입
    public void insertJoinUser(UserDetailReq userDetailReq) throws Exception {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        int duplicatedUserCount = userMapper.selectByUserNameDuplicated(userDetailReq.getUserName());

        if (duplicatedUserCount > 0) {
            throw new Exception("이미 가입한 유저입니다.");
        } else {
            userDetailReq.setUserId(generatedInvestUserId(8));
            userDetailReq.setUserPassword(passwordEncoder.encode(userDetailReq.getUserPassword()));
            userMapper.insertJoinUser(userDetailReq);
        }
    }

    @Override
    public UserLoginReq loadUserByUsername(String username) throws UsernameNotFoundException {
        UserLoginReq userLoginReq = userMapper.getUserAccount(username);
        log.info(userLoginReq.getUserEmail());
        if (userLoginReq == null) {
            throw new UsernameNotFoundException("User not authorized.");
        }
        return userLoginReq;
    }
}
