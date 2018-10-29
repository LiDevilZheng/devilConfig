package com.devil.entity;

import java.io.Serializable;

public class Dict implements Serializable {
    private Integer id;
    private String type;
    private String item;
    private String value;
    private Integer editable;

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

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getEditable() {
        return editable;
    }

    public void setEditable(Integer editable) {
        this.editable = editable;
    }
    public Dict(){

    }
    public Dict(Integer id, String type, String item, String value, Integer editable) {
        this.id = id;
        this.type = type;
        this.item = item;
        this.value = value;
        this.editable = editable;
    }
}
