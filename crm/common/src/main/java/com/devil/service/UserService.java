package com.devil.service;

import com.devil.entity.User;

import java.util.List;

public interface UserService {
    public User auth(String username, String password);

    public String getNameByToken(String token);

    //查询所有的客户经理
    public List<User> getAllAccountManager();
}
