package com.devil.dto;

import com.devil.entity.Dict;

import java.io.Serializable;
import java.util.List;

public class DictParams extends PageBean<Dict> implements Serializable {
    private String type;
    private String item;
    private String value;

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

    public DictParams(){

    }
    public DictParams(String type, String item, String value) {
        this.type = type;
        this.item = item;
        this.value = value;
    }

    public DictParams(Integer pageNo, Integer pageSize, Integer from, Integer offset, Integer count, Integer pageCount, List<Dict> list, String type, String item, String value) {
        super(pageNo, pageSize, from, offset, count, pageCount, list);
        this.type = type;
        this.item = item;
        this.value = value;
    }
}
