package com.devil.dto;

import com.devil.entity.Orders;

import java.io.Serializable;
import java.util.List;

public class OrdersParams extends PageBean<Orders> implements Serializable {
    private Integer id;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public OrdersParams(){

    }
    public OrdersParams(Integer id) {
        this.id = id;
    }

    public OrdersParams(Integer pageNo, Integer pageSize, Integer from, Integer offset, Integer count, Integer pageCount, List<Orders> list, Integer id) {
        super(pageNo, pageSize, from, offset, count, pageCount, list);
        this.id = id;
    }
}
