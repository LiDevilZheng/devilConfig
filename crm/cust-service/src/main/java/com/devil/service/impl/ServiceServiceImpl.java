package com.devil.service.impl;

import com.devil.dto.ServiceParams;
import com.devil.mapper.ServiceMapper;
import com.devil.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceServiceImpl implements ServiceService {
    @Autowired
    private ServiceMapper serviceMapper;

    @Override
    public void findByParams(ServiceParams params) {
        int count=serviceMapper.getCount(params);
        params.setCount(count);
        params.setPageCount(count%params.getPageSize()==0?(count/params.getPageSize()):(count/params.getPageSize()+1));
        if(params.getPageNo()>=params.getPageCount())
            params.setPageNo(params.getPageCount());
        params.setList(serviceMapper.getAll(params));
    }

    @Override
    public int updateService(com.devil.entity.Service service) {
        return serviceMapper.updateService(service);
    }

    @Override
    public int delService(int id) {
        return serviceMapper.delService(id);
    }

    @Override
    public int addService(com.devil.entity.Service service) {
        return serviceMapper.addService(service);
    }
}
