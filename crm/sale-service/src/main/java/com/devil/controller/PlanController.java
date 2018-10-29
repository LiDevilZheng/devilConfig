package com.devil.controller;

import com.devil.domain.RestCode;
import com.devil.domain.RestResponse;
import com.devil.entity.Plan;
import com.devil.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Date;

@RestController
public class PlanController {
    @Autowired
    private PlanService planService;

    public PlanService getPlanService() {
        return planService;
    }

    public void setPlanService(PlanService planService) {
        this.planService = planService;
    }
    @PostMapping(value = "/addPlan",produces = "application/json;charset=utf-8")
    public RestResponse<Integer> addPlan(@RequestBody Plan plan){
        int result=planService.addPlan(plan);
        if(result>0){
           return RestResponse.success(result);
        }else{
            return RestResponse.error(RestCode.UNKNOWN_ERROR);
        }
    }
    @GetMapping("/findAllPlan")
    public Object findAllPlan(int chc_id){
        return planService.findAllPlan(chc_id);
    }

    @DeleteMapping("/delPlan")
    public RestResponse<Integer> delPlan(int id){
        int result=planService.delPlan(id);
        if(result>0){
            return RestResponse.success(result);
        }else{
            return RestResponse.error(RestCode.UNKNOWN_ERROR);
        }
    }
    @PutMapping(value="/updatePlan",produces = "application/json;charset=utf-8")
    public RestResponse<Integer> updatePlan(@RequestBody Plan plan){
        plan.setDate(new Date());
        int result=planService.updatePlan(plan);
        if(result>0){
            return RestResponse.success(result);
        }else{
            return RestResponse.error(RestCode.UNKNOWN_ERROR);
        }
    }

    @PutMapping(value="/updatePlanResult",produces = "application/json;charset=utf-8")
    public RestResponse<Integer> updatePlanResult(@RequestBody Plan plan){

        int r=planService.updatePlanResult(plan);
        if(r>0){
            return RestResponse.success(r);
        }else{
            return RestResponse.error(RestCode.UNKNOWN_ERROR);
        }
    }
}
