package com.devil.entity;

import java.io.Serializable;

public class LinkMan implements Serializable {
    private Integer id;
    private String cust_no;
    private String cust_name;
    private String name;
    private String sex;
    private String postion;
    private String tel;
    private String mobile;
    private String memo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCust_no() {
        return cust_no;
    }

    public void setCust_no(String cust_no) {
        this.cust_no = cust_no;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPostion() {
        return postion;
    }

    public void setPostion(String postion) {
        this.postion = postion;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
    public LinkMan(){

    }
    public LinkMan(Integer id, String cust_no, String cust_name, String name, String sex, String postion, String tel, String mobile, String memo) {
        this.id = id;
        this.cust_no = cust_no;
        this.cust_name = cust_name;
        this.name = name;
        this.sex = sex;
        this.postion = postion;
        this.tel = tel;
        this.mobile = mobile;
        this.memo = memo;
    }
}
