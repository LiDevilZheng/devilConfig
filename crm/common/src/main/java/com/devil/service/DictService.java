package com.devil.service;

import com.devil.dto.DictParams;
import com.devil.entity.Dict;

import java.util.List;

public interface DictService {
    public List<Dict> getAllItem(String type);


    public void findByParams(DictParams params);

    public int delDict(int id);

    public Dict findById(int id);

    public int updateDict(Dict dict);

    public int addDict(Dict dict);
}
