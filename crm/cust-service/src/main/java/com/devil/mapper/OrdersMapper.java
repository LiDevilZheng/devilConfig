package com.devil.mapper;

import com.devil.dto.OrdersParams;
import com.devil.entity.Orders;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrdersMapper {
    @Select("SELECT c.no,c.name,o.* FROM customer c LEFT JOIN orders o ON c.name=o.customer WHERE c.id=#{id}")
    public List<Orders> getOrdersById(@Param("id")int id);

    @Select("SELECT COUNT(o.id) FROM customer c LEFT JOIN orders o ON c.name=o.customer WHERE c.id=1")
    public int getCountById(OrdersParams params);

    @Select("SELECT c.no,c.name,o.* FROM customer c LEFT JOIN orders o ON c.name=o.customer WHERE c.id=#{id} LIMIT #{from},#{offset}")
    public List<Orders> getOrders(OrdersParams params);

    @Select("select * from orders where id=#{id}")
    public Orders findById(@Param("id")int id);
}
