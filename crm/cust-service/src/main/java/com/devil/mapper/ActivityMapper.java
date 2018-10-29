package com.devil.mapper;

import com.devil.entity.Activity;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ActivityMapper {
    @Select("SELECT a.* FROM customer c LEFT JOIN activity a ON c.no=a.no WHERE c.id=#{id}")
    public List<Activity> getActivityById(@Param("id") int id);

    @Insert("INSERT INTO activity (`no`,`name`,`date`,place,title,`desc`,memo) VALUES " +
            "(#{no},#{name},#{date},#{place},#{title},#{desc},#{memo})")
    public int addActivity(Activity activity);
    @Select("select * from activity where id=#{id}")
    public Activity findByActivityId(@Param("id") int id);
    @Update("UPDATE activity SET `date`=#{date},place=#{place},title=#{title},`desc`=#{desc},memo=#{memo} where id=#{id}")
    public int updateActivity(Activity activity);
    @Delete("delete from activity where id=#{id}")
    public int delActivity(@Param("id")int id);
}
