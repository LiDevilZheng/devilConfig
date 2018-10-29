package com.devil.mapper;

import com.devil.dto.DictParams;
import com.devil.entity.Dict;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface DictMapper {
    @Select("select * from dict where type=#{type}")
    public List<Dict> getAllItem(@Param("type") String type);

    @Select("<script>select count(id) from dict where 1=1" +
            "<if test='type!=null'>and type like concat('%',#{type},'%')</if>" +
            "<if test='item!=null'>and item like concat('%',#{item},'%')</if>" +
            "<if test='value!=null'>and value like concat('%',#{value},'%')</if></script>")
    public int getCount(DictParams params);
    @Select("<script>select * from dict where 1=1" +
            "<if test='type!=null'>and type like concat('%',#{type},'%')</if> "+
            "<if test='item!=null'>and item like concat('%',#{item},'%')</if>" +
            "<if test='value!=null'>and value like concat('%',#{value},'%')</if>" +
            "limit #{from},#{offset}</script>")
    public List<Dict> getAll(DictParams params);

    @Update("update dict set editable=0 where id=#{id}")
    public int delDict(@Param("id")int id);

    @Select("select * from dict where id=#{id}")
    public Dict findById(@Param("id")int id);

    @Update("update dict set `type`=#{type},item=#{item},`value`=#{value},editable=#{editable} where id=#{id}")
    public int updateDict(Dict dict);

    @Insert("insert into dict (`type`,item,`value`,editable) values (#{type},#{item},#{value},#{editable})")
    public int addDict(Dict dict);
}
