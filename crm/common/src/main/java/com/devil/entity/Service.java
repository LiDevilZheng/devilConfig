package com.devil.entity;

import java.io.Serializable;
import java.util.Date;

public class Service implements Serializable {
    private Integer id;
    private String type;
    private String title;
    private String no;
    private String cust_name;
    private String status;
    private String request;
    private Integer create_id;
    private String create_by;
    private Date create_date;
    private Integer due_id;
    private String due_to;
    private Date due_date;
    private String deal;
    private Integer deal_id;
    private String deal_by;
    private Date deal_date;
    private String result;
    private Integer satisfy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
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

    public String getDeal() {
        return deal;
    }

    public void setDeal(String deal) {
        this.deal = deal;
    }

    public Integer getDeal_id() {
        return deal_id;
    }

    public void setDeal_id(Integer deal_id) {
        this.deal_id = deal_id;
    }

    public String getDeal_by() {
        return deal_by;
    }

    public void setDeal_by(String deal_by) {
        this.deal_by = deal_by;
    }

    public Date getDeal_date() {
        return deal_date;
    }

    public void setDeal_date(Date deal_date) {
        this.deal_date = deal_date;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Integer getSatisfy() {
        return satisfy;
    }

    public void setSatisfy(Integer satisfy) {
        this.satisfy = satisfy;
    }

    public Service() {
    }

    public Service(Integer id, String type, String title, String no, String cust_name, String status, String request, Integer create_id, String create_by, Date create_date, Integer due_id, String due_to, Date due_date, String deal, Integer deal_id, String deal_by, Date deal_date, String result, Integer satisfy) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.no = no;
        this.cust_name = cust_name;
        this.status = status;
        this.request = request;
        this.create_id = create_id;
        this.create_by = create_by;
        this.create_date = create_date;
        this.due_id = due_id;
        this.due_to = due_to;
        this.due_date = due_date;
        this.deal = deal;
        this.deal_id = deal_id;
        this.deal_by = deal_by;
        this.deal_date = deal_date;
        this.result = result;
        this.satisfy = satisfy;
    }
}
