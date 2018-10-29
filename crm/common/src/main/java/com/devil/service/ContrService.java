package com.devil.service;

import com.devil.dto.ContrParams;
import com.devil.entity.Contr;

import java.util.List;

public interface ContrService {
    public List<Contr> findContrByParams(ContrParams params);
}
