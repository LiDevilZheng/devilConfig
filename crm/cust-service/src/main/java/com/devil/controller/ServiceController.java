package com.devil.controller;

import com.devil.domain.RestCode;
import com.devil.domain.RestResponse;
import com.devil.dto.ServiceParams;
import com.devil.entity.Service;
import com.devil.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class ServiceController {
    @Autowired
    private ServiceService serviceService;
    @GetMapping("/findServices")
    public Object findServcies(ServiceParams params){
        serviceService.findByParams(params);
        return params;
    }
    @PutMapping(value = "/updateService",produces = "application/json;charset=utf-8")
    public RestResponse<Integer> updateService(@RequestBody Service service){
        service.setDue_date(new Date());
        int result=serviceService.updateService(service);
        if(result>0){
            return RestResponse.success(result);
        }else{
            return RestResponse.error(RestCode.UNKNOWN_ERROR);
        }
    }
    @DeleteMapping("/delService")
    public RestResponse<Integer> delService(int id){
        int result=serviceService.delService(id);
        if(result>0){
            return RestResponse.success(result);
        }else{
            return RestResponse.error(RestCode.UNKNOWN_ERROR);
        }
    }
    @PostMapping("/addService")
    public RestResponse<Integer> delService(Service service){
        int result=serviceService.addService(service);
        if(result>0){
            return RestResponse.success(result);
        }else{
            return RestResponse.error(RestCode.UNKNOWN_ERROR);
        }
    }
}
