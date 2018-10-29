package com.devil.service;

import com.devil.dto.LostParams;
import com.devil.entity.Lost;

public interface LostService {
    public void findByParams(LostParams params);

    public Lost findById(int id);

    public int updateLostReason(Lost lost);

}
