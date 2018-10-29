package com.devil.mapper;

import com.devil.entity.Plan;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface PlanMapper {
    @Insert("insert into plan (chc_id,date,todo) values (#{chc_id},#{date},#{todo})")
    public int addPlan(Plan plan);

    @Select("select * from plan where chc_id=#{chc_id}")
    public List<Plan> findAllPlan(@Param("chc_id")int chc_id);

    @Delete("delete from plan where id=#{id}")
    public int delPlan(@Param("id") int id);

    @Update("update plan set date=#{date},todo=#{todo} where id=#{id}")
    public int updatePlan(Plan plan);

    @Update("update plan set result=#{result} where id=#{id}")
    public int updatePlanResult(Plan plan);
}
