package com.devil.controller;

import com.devil.domain.RestCode;
import com.devil.domain.RestResponse;
import com.devil.dto.LostParams;
import com.devil.entity.Lost;
import com.devil.service.LostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LostController {
    @Autowired
    private LostService lostService;
    @GetMapping(value="/getAllLost",produces = "application/json;charset=utf-8")
    public RestResponse<LostParams> getAllLost(LostParams params){
        lostService.findByParams(params);
        if(params.getList().size()>0){
            return RestResponse.success(params);
        }else{
            return RestResponse.error(RestCode.USER_NOT_EXIST);
        }
    }
    @GetMapping("/findById")
    public Object findById(int id){
       return lostService.findById(id);
    }

    @PutMapping("/updateLostReason")
    public RestResponse<Integer> getAllLost(@RequestBody Lost lost){
        int result=lostService.updateLostReason(lost);
        if(result>0){
            return RestResponse.success(result);
        }else{
            return RestResponse.error(RestCode.USER_NOT_EXIST);
        }
    }
}
