package com.devil.mapper;

import com.devil.dto.CustomerParams;
import com.devil.entity.Customer;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface CustomerMapper {
    @Select("<script>select * from customer where 1=1" +
            "<if test='no!=null'>and no like concat('%',#{no},'%')</if>" +
            "<if test='name!=null'>and name like concat('%',#{name},'%')</if>" +
            "<if test='regin!=null'>and regin like concat('%',#{regin},'%')</if>" +
            "<if test='manager_name!=null'>and manager_name like concat('%',#{manager_name},'%')</if>" +
            "<if test='level_label!=null'>and level_label like concat('%',#{level_label},'%')</if>" +
            "order by id asc limit #{from},#{offset}</script>")
    public List<Customer> getAll(CustomerParams params);

    @Select("<script>select count(no) from customer where 1=1" +
            "<if test='no!=null'>and no like concat('%',#{no},'%')</if>"+
            "<if test='name!=null'>and name like concat('%',#{name},'%')</if>"+
            "<if test='regin!=null'>and regin like concat('%',#{regin},'%')</if>"+
            "<if test='manager_name!=null'>and manager_name like concat('%',#{manager_name},'%')</if>"+
            "<if test='level_label!=null'>and level_label like concat('%',#{level_label},'%')</if></script>")
    public int getCount(CustomerParams params);

    @Select("select * from customer where id=#{id}")
    public Customer findById(@Param("id")int id);

    @Update("update customer set status=#{status} where id=#{id}")
    public int updateStatus(@Param("id") int id,@Param("status") int status);

    @Update("update customer set `name`=#{name},regin=#{regin},manager_id=#{manager_id},manager_name=#{manager_name}," +
            "level=#{level},level_label=#{level_label},satisfy=#{satisfy},credit=#{credit},addr=#{addr},zip=#{zip}," +
            "tel=#{tel},fax=#{fax},website=#{website},licence=#{licence},chieftain=#{chieftain},bankroll=#{bankroll}," +
            "turnover=#{turnover},bank=#{bank},account=#{account},tax=#{tax},national=#{national} where id=#{id}")
    public int updateCustomer(Customer customer);
}
