package com.devil.controller;

import com.devil.domain.RestCode;
import com.devil.domain.RestResponse;
import com.devil.dto.ContrParams;
import com.devil.entity.Contr;
import com.devil.service.ContrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContrController {
    @Autowired
    private ContrService contrService;
    @GetMapping("/findContrByParams")
    public RestResponse<List> findContrByParams(ContrParams params) {
        List<Contr> li = contrService.findContrByParams(params);
        if (li.size() > 0) {
            return RestResponse.success(li);
        } else {
            return RestResponse.error(RestCode.USER_NOT_EXIST);
        }
    }
}
