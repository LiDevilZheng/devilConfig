package com.devil.service.impl;

import com.devil.dto.NewProduct;
import com.devil.dto.ProductParams;
import com.devil.entity.Product;
import com.devil.mapper.ProductMapper;
import com.devil.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public List<NewProduct> getAllProduct(int order_id) {
        List<NewProduct> li=productMapper.getAllProduct(order_id);
        for(NewProduct p:li){
            p.setSubPrice(p.getPrice()*p.getCount());
        }
        return li;
    }

    @Override
    public void findByParams(ProductParams params) {
        int count=productMapper.getCount(params);
        params.setCount(count);
        params.setPageCount(count%params.getPageSize()==0?(count/params.getPageSize()):(count/params.getPageSize()+1));
        if(params.getPageNo()>=params.getPageCount()){
            params.setPageNo(params.getPageCount());
        }
        params.setList(productMapper.getAll(params));
    }
}
