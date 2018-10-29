package com.devil.controller;

import com.devil.dto.ProductParams;
import com.devil.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping(value="/getAllProducts",produces = "application/json;charset=utf-8")
    public Object getAllProducts(ProductParams params){
        productService.findByParams(params);
        return params;
    }
}
