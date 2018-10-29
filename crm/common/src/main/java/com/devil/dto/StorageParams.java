package com.devil.dto;

import com.devil.entity.Storage;

import java.io.Serializable;
import java.util.List;

public class StorageParams extends PageBean<Storage> implements Serializable {
    private String products;
    private String warehouse;

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }
    public StorageParams(){

    }
    public StorageParams(String products, String warehouse) {
        this.products = products;
        this.warehouse = warehouse;
    }

    public StorageParams(Integer pageNo, Integer pageSize, Integer from, Integer offset, Integer count, Integer pageCount, List<Storage> list, String products, String warehouse) {
        super(pageNo, pageSize, from, offset, count, pageCount, list);
        this.products = products;
        this.warehouse = warehouse;
    }
}
