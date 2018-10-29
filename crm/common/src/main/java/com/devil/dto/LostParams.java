package com.devil.dto;

import com.devil.entity.Lost;

import java.io.Serializable;
import java.util.List;

public class LostParams extends PageBean<Lost> implements Serializable {
    private String cust_name;
    private String manager_name;
    private String memo;

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getManager_name() {
        return manager_name;
    }

    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public LostParams(){

    }
    public LostParams(String cust_name, String mananger_name, String memo) {
        this.cust_name = cust_name;
        this.manager_name = mananger_name;
        this.memo = memo;
    }

    public LostParams(Integer pageNo, Integer pageSize, Integer from, Integer offset, Integer count, Integer pageCount, List<Lost> list, String cust_name, String manager_name, String memo) {
        super(pageNo, pageSize, from, offset, count, pageCount, list);
        this.cust_name = cust_name;
        this.manager_name = manager_name;
        this.memo = memo;
    }
}
