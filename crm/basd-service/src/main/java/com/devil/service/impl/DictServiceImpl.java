package com.devil.service.impl;

import com.devil.dto.DictParams;
import com.devil.entity.Dict;
import com.devil.mapper.DictMapper;
import com.devil.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DictServiceImpl implements DictService {
    @Autowired
    private DictMapper dictMapper;

    public DictMapper getDictMapper() {
        return dictMapper;
    }

    public void setDictMapper(DictMapper dictMapper) {
        this.dictMapper = dictMapper;
    }

    @Override
    public List<Dict> getAllItem(String type) {
        return dictMapper.getAllItem(type);
    }

    @Override
    public void findByParams(DictParams params){
        int count=dictMapper.getCount(params);
        params.setCount(count);
        params.setPageCount(count%params.getPageSize()==0?(count/params.getPageSize()):(count/params.getPageSize()+1));
        if(params.getPageNo()>=params.getPageCount()){
            params.setPageNo(params.getPageCount());
        }
        params.setList(dictMapper.getAll(params));
    }

    @Override
    public int delDict(int id) {
        return dictMapper.delDict(id);
    }

    @Override
    public Dict findById(int id) {
        return dictMapper.findById(id);
    }

    @Override
    public int updateDict(Dict dict) {
        return dictMapper.updateDict(dict);
    }

    @Override
    public int addDict(Dict dict) {
        return dictMapper.addDict(dict);
    }
}
