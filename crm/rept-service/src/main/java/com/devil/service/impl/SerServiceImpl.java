package com.devil.service.impl;

import com.devil.entity.Ser;
import com.devil.mapper.SerMapper;
import com.devil.service.SerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerServiceImpl implements SerService {
    @Autowired
    private SerMapper serMapper;
    @Override
    public List<Ser> getAllSer(String yea) {
        return serMapper.getAllSer(yea);
    }
}
