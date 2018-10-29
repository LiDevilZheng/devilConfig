package com.devil.service;

import com.devil.dto.CustomerParams;
import com.devil.entity.Customer;

public interface CustomerService {
    //根据条件分页查询
    public void findByParams(CustomerParams params);

    public Customer findById(int id);

    public int updateStatus(int id,int status);

    public int updateCustomer(Customer customer);

}
