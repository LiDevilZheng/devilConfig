package com.devil.entity;

import java.io.Serializable;
import java.util.Date;

public class Chance implements Serializable {
    private Integer id;
    private String source;
    private String cust_name;
    private String title;
    private Integer rate;
    private String linkman;
    private String tel;
    private String desc;
    private Integer create_id;
    private String create_by;
    private Date create_date;
    private Integer due_id;
    private String due_to;
    private Date due_date;
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

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

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getCreate_id() {
        return create_id;
    }

    public void setCreate_id(Integer create_id) {
        this.create_id = create_id;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Integer getDue_id() {
        return due_id;
    }

    public void setDue_id(Integer due_id) {
        this.due_id = due_id;
    }

    public String getDue_to() {
        return due_to;
    }

    public void setDue_to(String due_to) {
        this.due_to = due_to;
    }

    public Date getDue_date() {
        return due_date;
    }

    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    public Chance(){

    }
    public Chance(Integer id, String source, String cust_name, String title, Integer rate,
                  String linkman, String tel, String desc, Integer create_id, String create_by,
                  Date create_date, Integer due_id, String due_to, Date due_date, Integer status) {
        this.id = id;
        this.source = source;
        this.cust_name = cust_name;
        this.title = title;
        this.rate = rate;
        this.linkman = linkman;
        this.tel = tel;
        this.desc = desc;
        this.create_id = create_id;
        this.create_by = create_by;
        this.create_date = create_date;
        this.due_id = due_id;
        this.due_to = due_to;
        this.due_date = due_date;
        this.status = status;
    }
}
