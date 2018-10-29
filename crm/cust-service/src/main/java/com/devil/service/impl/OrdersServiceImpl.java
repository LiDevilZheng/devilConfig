package com.devil.service.impl;

import com.devil.dto.OrdersParams;
import com.devil.dto.PageBean;
import com.devil.entity.Orders;
import com.devil.mapper.OrdersMapper;
import com.devil.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;
    @Override
    public List<Orders> getOrdersById(int id) {
        return ordersMapper.getOrdersById(id);
    }

    @Override
    public void findByPage(OrdersParams params) {
        int count=ordersMapper.getCountById(params);
        params.setCount(count);
        params.setPageCount(count%params.getPageSize()==0?(count/params.getPageSize()):(count/params.getPageSize()+1));
        if(params.getPageNo()>=params.getPageCount()){
            params.setPageNo(params.getPageCount());
        }
        params.setList(ordersMapper.getOrders(params));
    }

    @Override
    public Orders findById(int id) {
        return ordersMapper.findById(id);
    }
}
