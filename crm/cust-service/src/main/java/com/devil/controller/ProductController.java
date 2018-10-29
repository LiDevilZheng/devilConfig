package com.devil.controller;

import com.devil.dto.NewProduct;
import com.devil.dto.OrderLine;
import com.devil.entity.Orders;
import com.devil.service.OrdersService;
import com.devil.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private OrdersService ordersService;
    @GetMapping("/getProductLine")
    public Object getProductLine(int order_id){
        Orders orders=ordersService.findById(order_id);
        List<NewProduct> li= productService.getAllProduct(order_id);
        double totalPrice=0;
        for (NewProduct p:li){
            totalPrice+=p.getSubPrice();
        }
        OrderLine orderLine=new OrderLine(orders,totalPrice,li);
        return orderLine;
    }
    /*@GetMapping(value="/getAllProducts",produces = "application/json;charset=utf-8")
    public Object getAllProducts(ProductParams params){
        productService.findByParams(params);
        return params;
    }*/
}
