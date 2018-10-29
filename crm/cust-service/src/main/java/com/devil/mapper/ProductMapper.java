package com.devil.mapper;

import com.devil.dto.NewProduct;
import com.devil.dto.ProductParams;
import com.devil.entity.Product;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductMapper {
    @Select("SELECT p.name,p.type,p.batch,l.count,l.unit,l.price FROM line l INNER JOIN product p ON l.prod_id=p.id WHERE order_id=#{id}")
    public List<NewProduct> getAllProduct(@Param("id") int order_id);

    @Select("<script>select count(id) from product where 1=1" +
            "<if test='name!=null'>and name like concat('%',#{name},'%')</if>" +
            "<if test='type!=null'>and type like concat('%',#{type},'%')</if>" +
            "<if test='batch!=null'>and batch like concat('%',#{batch},'%')</if></script>")
    public int getCount(ProductParams params);

    @Select("<script>select * from product where 1=1" +
            "<if test='name!=null'>and name like concat('%',#{name},'%')</if>" +
            "<if test='type!=null'>and type like concat('%',#{type},'%')</if>" +
            "<if test='batch!=null'>and batch like concat('%',#{batch},'%')</if>" +
            "limit #{from},#{offset}</script>")
    public List<Product> getAll(ProductParams params);
}
