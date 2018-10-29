package com.devil.mapper;

import com.devil.entity.LinkMan;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface LinkManMapper {
    @Select("select * from linkman where cust_no=#{cust_no}")
    public List<LinkMan> getLinkMan(@Param("cust_no") String cust_no);

    @Insert("insert into linkman(cust_no,cust_name,`name`,sex,postion,tel,mobile,memo) values " +
            "(#{cust_no},#{cust_name},#{name},#{sex},#{postion},#{tel},#{mobile},#{memo})")
    public int addLinkMan(LinkMan linkMan);

    @Select("select * from linkman where id=#{id}")
    public LinkMan findById(@Param("id")int id);

    @Update("update linkman set sex=#{sex},postion=#{postion},tel=#{tel},mobile=#{mobile},memo=#{memo} where id=#{id}")
    public int updateLinkMan(LinkMan linkMan);

    @Delete("delete from linkman where id=#{id}")
    public int delLinkMan(@Param("id")int id);
}
