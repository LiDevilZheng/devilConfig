package com.devil.entity;

import java.io.Serializable;
import java.util.Date;

public class Activity implements Serializable {
    private Integer id;
    private String no;
    private String name;
    private Date date;
    private String place;
    private String title;
    private String desc;
    private String memo;

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Activity(Integer id, String no, String name, Date date, String place, String title, String desc, String memo) {
        this.id = id;
        this.no = no;
        this.name = name;
        this.date = date;
        this.place = place;
        this.title = title;
        this.desc = desc;
        this.memo = memo;
    }

    public Activity() {
    }
}
