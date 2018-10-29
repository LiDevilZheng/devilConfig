package com.devil.controller;

import com.devil.domain.RestCode;
import com.devil.domain.RestResponse;
import com.devil.entity.User;
import com.devil.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value="/login",produces = "application/json;charset=utf-8")
    public RestResponse<User> auth(@RequestBody User user){//接收JSON
        User u=userService.auth(user.getName(),user.getPassword());
        if(u==null){
            return RestResponse.error(RestCode.USER_USERNAME_PASSWORD_ERROR);
        }else{
            return RestResponse.success(u);
        }
    }

    @GetMapping(value = "/name")
    public RestResponse<String> getNameByToken(String token){
        String uname=userService.getNameByToken(token);
        if(uname!=null){
            return RestResponse.success(uname);
        }else{
            return RestResponse.error(RestCode.TOKEN_INVALID);
        }
    }

    @GetMapping(value = "/accountManager")
    public Object getAllAccountManager(){
        List<User> li=userService.getAllAccountManager();
        return li;
    }
}
