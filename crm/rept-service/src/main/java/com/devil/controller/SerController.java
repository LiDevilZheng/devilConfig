package com.devil.controller;

import com.devil.service.SerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SerController {
    @Autowired
    private SerService serService;
    @GetMapping("/getAllSer")
    public Object getAllSer(String yea){
        return serService.getAllSer(yea);
    }
}
