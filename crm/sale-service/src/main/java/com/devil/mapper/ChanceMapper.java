package com.devil.mapper;

import com.devil.dto.ChanceParams;
import com.devil.entity.Chance;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ChanceMapper {
    @Select("<script>select * from chance where 1=1 " +
            "<if test='cust_name!=null'>and cust_name like concat('%',#{cust_name},'%')</if>" +
            "<if test='title!=null'>and title like concat('%',#{title},'%')</if>" +
            "<if test='linkman!=null'>and linkman like concat('%',#{linkman},'%')</if>" +
            "limit #{from},#{offset}</script>")
    public List<Chance> getAll(ChanceParams params);

    @Select("<script>select count(id) from chance where 1=1 " +
            "<if test='cust_name!=null'>and cust_name like concat('%',#{cust_name},'%')</if>" +
            "<if test='title!=null'>and title like concat('%',#{title},'%')</if>" +
            "<if test='linkman!=null'>and linkman like concat('%',#{linkman},'%')</if></script>")
    public int getCount(ChanceParams params);

    @Insert("INSERT INTO `chance` (source,cust_name,title,rate,linkman,tel,`desc`,create_id,create_by,create_date,`status`)"+
            "VALUES (#{source},#{cust_name},#{title},#{rate},#{linkman},#{tel},#{desc},#{create_id},#{create_by},#{create_date},#{status})")
    public int addChance(Chance chance);

    @Select("select * from chance where id=#{id}")
    public Chance findById(@Param("id") int id);

    @Update("UPDATE chance SET source=#{source},cust_name=#{cust_name},rate=#{rate},title=#{title}," +
            "linkman=#{linkman},tel=#{tel},`desc`=#{desc} WHERE id=#{id}")
    public int updateChance(Chance chance);

    //@Update("update chance set due_id=#{due_id},due_to=#{due_to},due_date=#{due_date},status=#{status} where id=#{id}")
    @Update("<script>update chance <trim prefix='set' suffixOverrides=','>" +
            "<if test='due_id!=null'>due_id=#{due_id},</if>" +
            "<if test='due_to!=null'>due_to=#{due_to},</if>" +
            "<if test='due_date!=null'>due_date=#{due_date},</if>" +
            "<if test='status!=null'>status=#{status},</if> </trim>" +
            "where id=#{id}</script>")
    public int updateDueTo(Chance chance);

    @Delete("delete from chance where id=#{id}")
    public int delChance(@Param("id") int id);


}
