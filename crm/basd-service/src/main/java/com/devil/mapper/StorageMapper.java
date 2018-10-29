package com.devil.mapper;

import com.devil.dto.StorageParams;
import com.devil.entity.Storage;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StorageMapper {
    @Select("<script>select count(s.id) from `storage` s INNER JOIN product p ON s.prod_id=p.id where 1=1 " +
            "<if test='products!=null'>and CONCAT(p.name,'-',p.type,'-',p.batch) like concat('%',#{products},'%')</if>" +
            "<if test='warehouse!=null'>and warehouse like concat('%',#{warehouse},'%')</if></script>")
    public int getCount(StorageParams params);
    @Select("<script>SELECT CONCAT(p.name,'-',p.type,'-',p.batch) AS products,s.* FROM `storage` s INNER JOIN product p ON s.prod_id=p.id where 1=1" +
            "<if test='products!=null'>and CONCAT(p.name,'-',p.type,'-',p.batch) like concat('%',#{products},'%')</if>" +
            "<if test='warehouse!=null'>and warehouse like concat('%',#{warehouse},'%')</if>" +
            "limit #{from},#{offset}</script>")
    public List<Storage> getAll(StorageParams params);
}
