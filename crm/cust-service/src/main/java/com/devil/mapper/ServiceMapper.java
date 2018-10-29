package com.devil.mapper;

import com.devil.dto.ServiceParams;
import com.devil.entity.Service;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ServiceMapper {
    @Select("<script>select count(id) from service where 1=1" +
            "<if test='cust_name!=null'>and cust_name like concat('%',#{cust_name},'%')</if>" +
            "<if test='type!=null'>and type=#{type}</if>" +
            "<if test='title!=null'>and title like concat('%',#{title},'%')</if>" +
            "<if test='status!=null'>and status=#{status}</if>" +
            "<if test='create_date1!=null&amp;&amp;create_date2!=null'>and create_date&gt;=#{create_date1} and create_date&lt;=#{create_date2}</if></script>")
    public int getCount(ServiceParams params);

    @Select("<script>select * from service where 1=1" +
            "<if test='cust_name!=null'>and cust_name like concat('%',#{cust_name},'%')</if>" +
            "<if test='title!=null'>and title like concat('%',#{title},'%')</if>" +
            "<if test='type!=null'>and type=#{type}</if>" +
            "<if test='status!=null'>and status=#{status}</if>" +
            "<if test='create_date1!=null&amp;&amp;create_date2!=null'>and create_date&gt;=#{create_date1} and create_date&lt;=#{create_date2}</if>" +
            "limit #{from},#{offset}</script>")
    public List<Service> getAll(ServiceParams params);

    @Update("update service set due_id=#{due_id},due_to=#{due_to},due_date=#{due_date} where id=#{id}")
    public int updateService(Service service);
    @Delete("delete from service where id=#{id}")
    public int delService(int id);
    @Insert("insert into service (type,title,no,cust_name,status,request,create_id,create_by,create_date," +
            "due_id,due_to,due_date,deal,deal_id,deal_by,deal_date,result,satisfy) values (#{type},#{title}," +
            "#{no},#{cust_name},#{request},#{create_id},#{create_by},#{create_date},#{due_id},#{due_to},#{due_date}," +
            "#{deal},#{deal_id},#{deal_by},#{deal_date},#{result},#{satisfy})")
    public int addService(Service service);
}
