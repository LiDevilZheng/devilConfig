package com.devil.mapper;

import com.devil.entity.Ser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SerMapper {
    @Select("<script>SELECT d.`id`,d.`item`,COUNT(s.`type`) AS cou,YEAR(s.`create_date`) AS yea " +
            "FROM dict d INNER JOIN service s ON d.`item`=s.`type` WHERE 1=1" +
            "<if test='yea!=null'>and YEAR(s.`create_date`)=#{yea}</if>" +
            "GROUP BY s.`type`</script>")
    public List<Ser> getAllSer(@Param("yea") String yea);
}
