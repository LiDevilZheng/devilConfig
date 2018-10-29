package com.devil.mapper;

import com.devil.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from user where name=#{name} and password=#{password} and flag=1")
    public User login(@Param("name") String name, @Param("password") String password);

    @Select("select * from user where role_id=3 and flag=1")
    public List<User> getAllAccountManager();
}
