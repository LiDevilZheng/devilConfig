package com.devil.service.impl;

import com.devil.dto.LostParams;
import com.devil.entity.Lost;
import com.devil.mapper.LostMapper;
import com.devil.service.LostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LostServiceImpl implements LostService {
    @Autowired
    private LostMapper lostMapper;
    @Override
    public void findByParams(LostParams params) {
        int count=lostMapper.getCount(params);
        params.setCount(count);
        params.setPageCount(count%params.getPageSize()==0?(count/params.getPageSize()):(count/params.getPageSize()+1));
        if(params.getPageNo()>=params.getPageCount()){
            params.setPageNo(params.getPageCount());
        }
        params.setList(lostMapper.getAllLost(params));
    }

    @Override
    public Lost findById(int id) {
        return lostMapper.findById(id);
    }

    @Override
    public int updateLostReason(Lost lost) {
        return lostMapper.updateLost(lost);
    }
}
