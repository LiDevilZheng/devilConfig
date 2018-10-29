package com.devil.controller;

import com.devil.domain.RestCode;
import com.devil.domain.RestResponse;
import com.devil.entity.Activity;
import com.devil.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ActivityController {
    @Autowired
    private ActivityService activityService;
    @GetMapping("/getActivityById")
    public RestResponse<List> getActivityById(int id){
        List<Activity> li=activityService.getActivityById(id);
        if(li.size()>0){
            return RestResponse.success(li);
        }else{
            return RestResponse.error(RestCode.USER_NOT_EXIST);
        }
    }
    @PostMapping(value = "/addActivity",produces = "application/json;charset=utf-8")
    public RestResponse<Integer> addActivity(@RequestBody Activity activity){
        int result=activityService.addActivity(activity);
        if(result>0){
            return RestResponse.success(result);
        }else{
            return RestResponse.error(RestCode.USER_NOT_EXIST);
        }
    }
    @GetMapping("/findByActivityId")
    public Object findByActivityId(int id){
        return activityService.findByActivityId(id);
    }
    @PutMapping(value = "/updateActivity",produces = "application/json;charset=utf-8")
    public RestResponse<Integer> updateActivity(@RequestBody Activity activity){
        int result=activityService.updateActivity(activity);
        if(result>0){
            return RestResponse.success(result);
        }else{
            return RestResponse.error(RestCode.USER_NOT_EXIST);
        }
    }
    @DeleteMapping("/delActivity")
    public RestResponse<Integer> delActivity(int id){
        int result=activityService.delActivity(id);
        if(result>0){
            return RestResponse.success(result);
        }else{
            return RestResponse.error(RestCode.USER_NOT_EXIST);
        }
    }
}
