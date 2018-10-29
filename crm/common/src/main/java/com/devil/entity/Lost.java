package com.devil.entity;

import java.io.Serializable;
import java.util.Date;

public class Lost implements Serializable {
    private Integer id;
    private String no;
    private String cust_name;
    private Integer manager_id;
    private String manager_name;
    private Date order_date;
    private Date lost_date;
    private String delay;
    private String reason;
    private String memo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public Integer getManager_id() {
        return manager_id;
    }

    public void setManager_id(Integer manager_id) {
        this.manager_id = manager_id;
    }

    public String getManager_name() {
        return manager_name;
    }

    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public Date getLost_date() {
        return lost_date;
    }

    public void setLost_date(Date lost_date) {
        this.lost_date = lost_date;
    }

    public String getDelay() {
        return delay;
    }

    public void setDelay(String delay) {
        this.delay = delay;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Lost() {
    }

    public Lost(Integer id, String no, String cust_name, Integer manager_id, String manager_name, Date order_date, Date lost_date, String delay, String reason, String memo) {
        this.id = id;
        this.no = no;
        this.cust_name = cust_name;
        this.manager_id = manager_id;
        this.manager_name = manager_name;
        this.order_date = order_date;
        this.lost_date = lost_date;
        this.delay = delay;
        this.reason = reason;
        this.memo = memo;
    }
}
