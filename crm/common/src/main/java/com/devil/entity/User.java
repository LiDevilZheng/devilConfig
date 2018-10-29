package com.devil.entity;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;
    private String name;
    private String password;
    private Integer role_id;
    private Integer flag;
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
    public User(){

    }
    public User(Integer id, String name, String password, Integer role_id, Integer flag, String token) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.role_id = role_id;
        this.flag = flag;
        this.token = token;
    }
}
