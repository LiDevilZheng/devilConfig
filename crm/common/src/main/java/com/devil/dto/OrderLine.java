package com.devil.dto;

import com.devil.entity.Orders;
import com.devil.entity.Product;

import java.io.Serializable;
import java.util.List;

public class OrderLine implements Serializable {
    private Orders orders;
    private Double totalPrice;
    private List<NewProduct> li;

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Double getTotalPrice() {
       /* for(Product p:li){
            totalPrice+=p.getSubPrice();
        }*/
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<NewProduct> getLi() {
        return li;
    }

    public void setLi(List<NewProduct> li) {
        this.li = li;
    }

    public OrderLine() {
    }

    public OrderLine(Orders orders, Double totalPrice, List<NewProduct> li) {
        this.orders = orders;
        this.totalPrice = totalPrice;
        this.li = li;
    }
}
