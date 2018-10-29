package com.devil.controller;

import com.devil.domain.RestCode;
import com.devil.domain.RestResponse;
import com.devil.entity.LinkMan;
import com.devil.service.LinkManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LinkManController {
    @Autowired
    private LinkManService linkManService;
    @GetMapping("/getLinkMan")
    public RestResponse<List> getLinkMan(String cust_no){
        List<LinkMan> li= linkManService.getLinkMan(cust_no);
        if(li.size()>0){
            return RestResponse.success(li);
        }else{
            return RestResponse.error(RestCode.USER_NOT_EXIST);
        }
    }
    @PostMapping(value = "/addLinkMan",produces = "application/json;charset=utf-8")
    public RestResponse<Integer> addLinkMan(@RequestBody LinkMan linkMan){
        int result= linkManService.addLinkMan(linkMan);
        if(result>0){
            return RestResponse.success(result);
        }else{
            return RestResponse.error(RestCode.USER_NOT_EXIST);
        }
    }
    @GetMapping("/findByLinkManId")
    public Object findByLinkManId(int id){
        return linkManService.findById(id);
    }
    @PutMapping(value = "/updateLinkMan",produces = "application/json;charset=utf-8")
    public RestResponse<Integer> updateLinkMan(@RequestBody LinkMan linkMan){
        int result= linkManService.updateLinkMan(linkMan);
        if(result>0){
            return RestResponse.success(result);
        }else{
            return RestResponse.error(RestCode.USER_NOT_EXIST);
        }
    }
}
