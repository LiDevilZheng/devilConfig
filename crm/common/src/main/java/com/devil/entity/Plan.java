package com.devil.entity;

import java.io.Serializable;
import java.util.Date;

public class Plan implements Serializable {
    private Integer id;
    private Integer chc_id;
    private Date date;
    private String todo;
    private String result;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getChc_id() {
        return chc_id;
    }

    public void setChc_id(Integer chc_id) {
        this.chc_id = chc_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Plan() {
    }

    public Plan(Integer id, Integer chc_id, Date date, String todo, String result) {
        this.id = id;
        this.chc_id = chc_id;
        this.date = date;
        this.todo = todo;
        this.result = result;
    }
}
