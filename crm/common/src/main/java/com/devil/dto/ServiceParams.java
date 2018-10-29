package com.devil.dto;

import com.devil.entity.Service;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ServiceParams extends PageBean<Service> implements Serializable {
    private String cust_name;
    private String title;
    private String type;
    private String status;
    private String create_date1;
    private String create_date2;
    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreate_date1() {
        return create_date1;
    }

    public void setCreate_date1(String create_date1) {
        this.create_date1 = create_date1;
    }

    public String getCreate_date2() {
        return create_date2;
    }

    public void setCreate_date2(String create_date2) {
        this.create_date2 = create_date2;
    }

    public ServiceParams(){

    }

    public ServiceParams(String cust_name, String title, String type, String status, String create_date1, String create_date2) {
        this.cust_name = cust_name;
        this.title = title;
        this.type = type;
        this.status = status;
        this.create_date1 = create_date1;
        this.create_date2 = create_date2;
    }

    public ServiceParams(Integer pageNo, Integer pageSize, Integer from, Integer offset, Integer count, Integer pageCount, List<Service> list, String cust_name, String title, String type, String status, String create_date1, String create_date2) {
        super(pageNo, pageSize, from, offset, count, pageCount, list);
        this.cust_name = cust_name;
        this.title = title;
        this.type = type;
        this.status = status;
        this.create_date1 = create_date1;
        this.create_date2 = create_date2;
    }
}
