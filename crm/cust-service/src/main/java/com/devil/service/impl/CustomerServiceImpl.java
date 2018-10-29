package com.devil.service.impl;

import com.devil.dto.CustomerParams;
import com.devil.entity.Customer;
import com.devil.mapper.CustomerMapper;
import com.devil.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    public CustomerMapper getCustomerMapper() {
        return customerMapper;
    }

    public void setCustomerMapper(CustomerMapper customerMapper) {
        this.customerMapper = customerMapper;
    }

    @Override
    public void findByParams(CustomerParams params) {
        int count=customerMapper.getCount(params);
        params.setCount(count);
        params.setPageCount(count%params.getPageSize()==0?(count/params.getPageSize()):(count/params.getPageSize()+1));
        if(params.getPageNo()>=params.getPageCount()){
            params.setPageNo(params.getPageCount());
        }
        params.setList(customerMapper.getAll(params));
    }

    @Override
    public Customer findById(int id) {
        return customerMapper.findById(id);
    }

    @Override
    public int updateStatus(int id,int status) {
        return customerMapper.updateStatus(id,status);
    }

    @Override
    public int updateCustomer(Customer customer) {
        return customerMapper.updateCustomer(customer);
    }
}
