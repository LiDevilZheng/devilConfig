package com.devil.service;

import com.devil.dto.ServiceParams;
import com.devil.entity.Service;

public interface ServiceService {
    public void findByParams(ServiceParams params);

    public int updateService(Service service);

    public int delService(int id);

    public int addService(Service service);
}
