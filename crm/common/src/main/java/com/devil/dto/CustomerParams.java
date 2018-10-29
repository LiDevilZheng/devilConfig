package com.devil.dto;

import com.devil.entity.Customer;

import java.io.Serializable;
import java.util.List;

public class CustomerParams extends PageBean<Customer> implements Serializable {
    private String no;
    private String name;
    private String regin;
    private String manager_name;
    private String level_label;

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

    public String getRegin() {
        return regin;
    }

    public void setRegin(String regin) {
        this.regin = regin;
    }

    public String getManager_name() {
        return manager_name;
    }

    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }

    public String getLevel_label() {
        return level_label;
    }

    public void setLevel_label(String level_label) {
        this.level_label = level_label;
    }
    public CustomerParams(){

    }
    public CustomerParams(String no, String name, String regin, String manager_name, String level_label) {
        this.no = no;
        this.name = name;
        this.regin = regin;
        this.manager_name = manager_name;
        this.level_label = level_label;
    }

    public CustomerParams(Integer pageNo, Integer pageSize, Integer from, Integer offset, Integer count, Integer pageCount, List<Customer> list, String no, String name, String regin, String manager_name, String level_label) {
        super(pageNo, pageSize, from, offset, count, pageCount, list);
        this.no = no;
        this.name = name;
        this.regin = regin;
        this.manager_name = manager_name;
        this.level_label = level_label;
    }


}
