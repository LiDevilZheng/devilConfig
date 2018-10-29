package com.devil.service.impl;

import com.devil.entity.Plan;
import com.devil.mapper.PlanMapper;
import com.devil.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {
    @Autowired
    private PlanMapper planMapper;

    public PlanMapper getPlanMapper() {
        return planMapper;
    }

    public void setPlanMapper(PlanMapper planMapper) {
        this.planMapper = planMapper;
    }

    @Override
    public int addPlan(Plan plan) {
        return planMapper.addPlan(plan);
    }

    @Override
    public List<Plan> findAllPlan(int chc_id) {
        return planMapper.findAllPlan(chc_id);
    }

    public int delPlan(int id){
        return planMapper.delPlan(id);
    }

    @Override
    public int updatePlan(Plan plan) {
        return planMapper.updatePlan(plan);
    }

    @Override
    public int updatePlanResult(Plan plan) {
        return planMapper.updatePlanResult(plan);
    }
}
