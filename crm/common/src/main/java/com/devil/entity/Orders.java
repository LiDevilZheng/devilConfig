package com.devil.entity;

import java.io.Serializable;
import java.util.Date;

public class Orders implements Serializable {
    private Integer id;
    private String customer;
    private Date date;
    private String addr;
    private Integer status;
    private String no;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Orders(){

    }
    public Orders(Integer id, String customer, Date date, String addr, Integer status, String no, String name) {
        this.id = id;
        this.customer = customer;
        this.date = date;
        this.addr = addr;
        this.status = status;
        this.no = no;
        this.name = name;
    }
}
