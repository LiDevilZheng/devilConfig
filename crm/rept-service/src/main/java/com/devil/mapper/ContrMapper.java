package com.devil.mapper;

import com.devil.dto.ContrParams;
import com.devil.entity.Contr;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ContrMapper {
    @Select("<script>SELECT c.id,c.name,SUM(l.count*l.price) as money,YEAR(o.date) AS `date` FROM customer c " +
            "RIGHT JOIN orders o ON c.name=o.customer " +
            "LEFT JOIN line l ON o.id=l.order_id WHERE 1=1 " +
            "<if test='name!=null'>and name like concat('%',#{name},'%')</if>" +
            "<if test='date!=null'>and YEAR(o.date)=#{date}</if>"+
            "GROUP BY " +
            "<if test='date!=null'>YEAR(o.date)</if>" +
            "<if test='date==null'>c.id</if></script>")
    public List<Contr> findContrs(ContrParams params);
}
