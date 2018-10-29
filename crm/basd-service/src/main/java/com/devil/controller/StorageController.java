package com.devil.controller;

import com.devil.dto.StorageParams;
import com.devil.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StorageController {
    @Autowired
    private StorageService storageService;
    @GetMapping("/getAllStorages")
    public Object getAllStorages(StorageParams params){
        storageService.findByParams(params);
        return params;
    }
}
