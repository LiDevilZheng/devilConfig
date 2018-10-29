package com.devil.controller;

import com.devil.domain.RestCode;
import com.devil.domain.RestResponse;
import com.devil.dto.OrdersParams;
import com.devil.entity.Orders;
import com.devil.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrdersController {
    @Autowired
    private OrdersService ordersService;
    @GetMapping("/getOrdersById")
    public RestResponse<List> getOrdersById(int id){
        List<Orders> li=ordersService.getOrdersById(id);
        if(li.size()>0){
            return RestResponse.success(li);
        }else{
            return RestResponse.error(RestCode.UNKNOWN_ERROR);
        }
    }
    @GetMapping(value="/getOrders",produces = "application/json;charset=utf-8")
    public RestResponse<OrdersParams> getOrders(OrdersParams params){
        ordersService.findByPage(params);
        if(params.getList().size()>0){
            return RestResponse.success(params);
        }else{
            return RestResponse.error(RestCode.UNKNOWN_ERROR);
        }
    }
}
