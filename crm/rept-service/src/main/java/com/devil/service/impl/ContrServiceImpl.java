package com.devil.service.impl;

import com.devil.dto.ContrParams;
import com.devil.entity.Contr;
import com.devil.mapper.ContrMapper;
import com.devil.service.ContrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContrServiceImpl implements ContrService {
    @Autowired
    private ContrMapper contrMapper;
    @Override
    public List<Contr> findContrByParams(ContrParams params) {
        return contrMapper.findContrs(params);
    }
}
