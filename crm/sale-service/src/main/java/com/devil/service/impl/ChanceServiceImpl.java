package com.devil.service.impl;

import com.devil.dto.ChanceParams;
import com.devil.entity.Chance;
import com.devil.mapper.ChanceMapper;
import com.devil.service.ChanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChanceServiceImpl implements ChanceService {

    @Autowired
    private ChanceMapper chanceMapper;

    public ChanceMapper getChanceMapper() { return chanceMapper; }

    public void setChanceMapper(ChanceMapper chanceMapper) { this.chanceMapper = chanceMapper; }

    @Override
    public List<Chance> findAll() {
        return null;
    }

    @Override
    public void fingByParams(ChanceParams params) {
        int count=chanceMapper.getCount(params);
        params.setCount(count);
        params.setPageCount(count%params.getPageSize()==0?(count/params.getPageSize()):(count/params.getPageSize()+1));
        if(params.getPageNo()>=params.getPageCount()){
            params.setPageNo(params.getPageCount());
        }
        params.setLi(chanceMapper.getAll(params));
    }
    @Override
    public int addChance(Chance chance) {
        return chanceMapper.addChance(chance);
    }

    @Override
    public Chance findById(int id) {
        return chanceMapper.findById(id);
    }

    @Override
    public int updateChance(Chance chance) {
        return chanceMapper.updateChance(chance);
    }

    @Override
    public int updateDueTo(Chance chance) {
        return chanceMapper.updateDueTo(chance);
    }

    @Override
    public int delChance(int id) {
        return chanceMapper.delChance(id);
    }
}
