package com.devil.service.impl;


import com.devil.dto.StorageParams;
import com.devil.mapper.StorageMapper;
import com.devil.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StorageServiceImpl implements StorageService {
    @Autowired
    private StorageMapper storageMapper;
    @Override
    public void findByParams(StorageParams params) {
        int count=storageMapper.getCount(params);
        params.setCount(count);
        params.setPageCount(count%params.getPageSize()==0?(count/params.getPageSize()):(count/params.getPageSize()+1));
        if(params.getPageNo()>=params.getPageCount()){
            params.setPageNo(params.getPageCount());
        }
        params.setList(storageMapper.getAll(params));
    }
}
