package com.devil.service;

import com.devil.dto.NewProduct;
import com.devil.dto.ProductParams;

import java.util.List;
public interface ProductService {
    public List<NewProduct> getAllProduct(int order_id);

    public void findByParams(ProductParams params);
}
