package com.devil.mapper;

import com.devil.dto.LostParams;
import com.devil.entity.Lost;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface LostMapper {
    @Select("<script>select count(id) from lost where 1=1" +
            "<if test='cust_name!=null'>and cust_name like concat('%',#{cust_name},'%')</if>" +
            "<if test='manager_name!=null'>and manager_name like concat('%',#{manager_name},'%')</if>" +
            "<if test='memo!=null'>and memo like concat('%',#{memo},'%')</if></script>")
    public int getCount(LostParams params);

    @Select("<script>select * from lost where 1=1"+
            "<if test='cust_name!=null'>and cust_name like concat('%',#{cust_name},'%')</if>"+
            "<if test='manager_name!=null'>and manager_name like concat('%',#{manager_name},'%')</if>"+
            "<if test='memo!=null'>and memo like concat('%',#{memo},'%')</if>" +
            "limit #{from},#{offset}</script>")
    public List<Lost> getAllLost(LostParams params);

    @Select("select * from lost where id=#{id}")
    public Lost findById(@Param("id") int id);

    @Update("<script>update lost " +
            "<trim prefix='set' suffixOverrides=','>" +
            "<if test='reason!=null'>reason=#{reason},</if>"+
            "<if test='delay!=null'>delay=#{delay},</if></trim>"+
            "where id=#{id}</script>")
    public int updateLost(Lost lost);
}
