package com.devil.service.impl;

import com.devil.entity.User;
import com.devil.mapper.UserMapper;
import com.devil.service.UserService;
import com.devil.util.JWTHelper;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private StringRedisTemplate redisTemplate;

    @Override
    public User auth(String username, String password) {
        User user=userMapper.login(username,password);
        if(user!=null){
            String token=JWTHelper.genToken(ImmutableMap.of("name",user.getName()));
            redisTemplate.opsForValue().set(username,token);
            redisTemplate.expire(username,30, TimeUnit.MINUTES);
            user.setToken(token);
        }
        return user;
    }

    @Override
    public String getNameByToken(String token) {
        if(Strings.isNullOrEmpty(token)){
            return null;
        }
        //解析token,反序列化
        Map<String,String> map=JWTHelper.verifyToken(token);
        String name=map.get("name");
        Long expired= redisTemplate.getExpire(name);
        if(expired>0L){
            redisTemplate.opsForValue().set(name,token);
            redisTemplate.expire(name,30,TimeUnit.MINUTES);
            return name;
        }
        return null;
    }

    @Override
    public List<User> getAllAccountManager() {
        return userMapper.getAllAccountManager();
    }
}
