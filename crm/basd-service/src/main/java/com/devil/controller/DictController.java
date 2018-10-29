package com.devil.controller;

import com.devil.domain.RestCode;
import com.devil.domain.RestResponse;
import com.devil.dto.DictParams;
import com.devil.entity.Dict;
import com.devil.service.DictService;
import com.sun.org.apache.xml.internal.dtm.ref.DTMChildIterNodeList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DictController {
    @Autowired
    private DictService dictService;

    public DictService getDictService() {
        return dictService;
    }

    public void setDictService(DictService dictService) {
        this.dictService = dictService;
    }
    @GetMapping("/getAllItem")
    public Object getAllItem(int type){
        System.out.println(type);
        if(type==1){
            return dictService.getAllItem("企业客户等级");
        }else if(type==2){
            return dictService.getAllItem("服务类型");
        }else{
            return dictService.getAllItem("地区");
        }
    }
    @GetMapping(value = "/getAllDict",produces = "application/json;charset=utf-8")
    public Object getAllDict(DictParams params){
        dictService.findByParams(params);
        return params;
    }
    @GetMapping("/delDict")
    public RestResponse<Integer> delDict(int id){
        int result=dictService.delDict(id);
        if(result>0){
            return RestResponse.success(result);
        }else{
            return RestResponse.error(RestCode.UNKNOWN_ERROR);
        }
    }
    @GetMapping("/findById")
    public RestResponse<Dict> findById(int id){
        Dict dict=dictService.findById(id);
        if(dict!=null){
            return RestResponse.success(dict);
        }else{
            return RestResponse.error(RestCode.USER_NOT_EXIST);
        }
    }
    @PutMapping(value = "/updateDict",produces = "application/json;charset=utf-8")
    public RestResponse<Integer> updateDict(@RequestBody Dict dict){
        int result=dictService.updateDict(dict);
        if(result>0){
            return RestResponse.success(result);
        }else{
            return RestResponse.error(RestCode.USER_NOT_EXIST);
        }
    }
    @PutMapping(value = "/addDict",produces = "application/json;charset=utf-8")
    public RestResponse<Integer> addDict(@RequestBody Dict dict){
        int result=dictService.addDict(dict);
        if(result>0){
            return RestResponse.success(result);
        }else{
            return RestResponse.error(RestCode.USER_NOT_EXIST);
        }
    }
}
