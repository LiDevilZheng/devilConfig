package com.devil.service;

import com.devil.dto.ChanceParams;
import com.devil.entity.Chance;

import java.util.List;

public interface ChanceService {
    public List<Chance> findAll();
    //根据条件分页查询
    public void fingByParams(ChanceParams params);

    //新建销售机会
    public int addChance(Chance chance);


    //根据id查询
    public Chance findById(int id);

    //修改
    public int updateChance(Chance chance);

    //指派销售机会
    public int updateDueTo(Chance chance);

    //根据id删除
    public int delChance(int id);
}
