package com.devil.service;

import com.devil.entity.Plan;

import java.util.List;

public interface PlanService {
    public int addPlan(Plan plan);

    public List<Plan> findAllPlan(int chc_id);

    public int delPlan(int id);

    public int updatePlan(Plan plan);

    public int updatePlanResult(Plan plan);
}
