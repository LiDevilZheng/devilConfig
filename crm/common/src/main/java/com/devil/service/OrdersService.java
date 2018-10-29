package com.devil.service;

import com.devil.dto.OrdersParams;
import com.devil.entity.Orders;

import java.util.List;

public interface OrdersService {
    public List<Orders> getOrdersById(int id);

    public void findByPage(OrdersParams params);

    public Orders findById(int id);
}
