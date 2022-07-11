package com.example.springstudy.mapper;

import com.example.springstudy.model.UserDetailReq;
import com.example.springstudy.model.UserDetailRes;
import com.example.springstudy.model.UserLoginReq;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {
    List<UserDetailRes.InnerUserList> selectUserList();

    void insertJoinUser(UserDetailReq userDetailReq);

    Integer selectByUserNameDuplicated(@Param("userName") String userName);

    UserLoginReq getUserAccount(String userEmail);
}
