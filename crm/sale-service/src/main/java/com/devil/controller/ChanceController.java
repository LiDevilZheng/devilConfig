package com.devil.controller;

import com.devil.domain.RestCode;
import com.devil.domain.RestResponse;
import com.devil.dto.ChanceParams;
import com.devil.entity.Chance;
import com.devil.service.ChanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Date;

@RestController
public class ChanceController {
    @Autowired
    private ChanceService chanceService;

    public ChanceService getChanceService() { return chanceService; }

    public void setChanceService(ChanceService chanceService) { this.chanceService = chanceService; }

    @GetMapping(value = "/findByParam",produces = "application/json;charset=utf-8")
    public Object findByParams(ChanceParams params){
        chanceService.fingByParams(params);
        return params;
    }

    @PostMapping(value = "/addChance",produces = "application/json;charset=utf-8")
    public RestResponse<Integer> addChance(@RequestBody Chance chance){
        chance.setStatus(1);
        chance.setCreate_date(new Date());
       int result= chanceService.addChance(chance);
       if(result>0){
           return RestResponse.success(result);
       }else{
           return RestResponse.error(RestCode.UNKNOWN_ERROR);
       }
    }

    @GetMapping("/findByChanceId")
    public RestResponse<Chance> findById(int id){
        Chance c=chanceService.findById(id);
        if(c!=null){
           return RestResponse.success(c);
        }else{
            return RestResponse.error(RestCode.USER_NOT_EXIST);
        }
    }
    @PostMapping(value = "/updateChance",produces = "application/json;charset=utf-8")
    public RestResponse<Integer> updateChance(@RequestBody Chance chance){
        int result= chanceService.updateChance(chance);
        if(result>0){
            return RestResponse.success(result);
        }else{
            return RestResponse.error(RestCode.UNKNOWN_ERROR);
        }
    }

    @PostMapping(value = "/updateDueTo",produces = "application/json;charset=utf-8")
    public RestResponse<Integer> updateDueTo(@RequestBody Chance chance){
        chance.setDue_date(new Date());
        chance.setStatus(2);
        int result=chanceService.updateDueTo(chance);
        if(result>0){
            return RestResponse.success(result);
        }else{
            return RestResponse.error(RestCode.UNKNOWN_ERROR);
        }
    }

    @DeleteMapping("/delChance")
    public RestResponse<Integer> delChance(int id){
        int result=chanceService.delChance(id);
        if(result>0){
            return RestResponse.success(result);
        }else{
            return RestResponse.error(RestCode.UNKNOWN_ERROR);
        }
    }

    @GetMapping("/updateStatus")
    public RestResponse<Integer> updateStatus(int id){
        Chance chance=new Chance();
        chance.setId(id);
        chance.setStatus(4);
        int result=chanceService.updateDueTo(chance);
        if(result>0){
            return RestResponse.success(result);
        }else{
            return RestResponse.error(RestCode.UNKNOWN_ERROR);
        }
    }
    @GetMapping("/devSuccess")
    public RestResponse<Integer> devSuccess(int id){
        Chance c=new Chance();
        c.setId(id);
        c.setStatus(3);
        int result=chanceService.updateDueTo(c);
        if(result>0){
            return RestResponse.success(result);
        }else{
            return RestResponse.error(RestCode.UNKNOWN_ERROR);
        }
    }
}
