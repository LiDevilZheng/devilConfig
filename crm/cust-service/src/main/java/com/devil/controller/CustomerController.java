package com.devil.controller;


import com.devil.domain.RestCode;
import com.devil.domain.RestResponse;
import com.devil.dto.CustomerParams;
import com.devil.entity.Customer;
import com.devil.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    public CustomerService getCustomerService() {
        return customerService;
    }

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping(value="/getAllCustomer",produces = "application/json;charset=utf-8")
    public Object getAllCustomer(CustomerParams params){
    //params.setName(new String(params.getName().getBytes("ISO-8859-1"), "utf-8"));
        customerService.findByParams(params);
        return params;
    }
    @GetMapping("/findByCustomerId")
    public Object findByCustomerId(int id){
        return customerService.findById(id);
    }

    @PutMapping("/updateStatus")
    public RestResponse<Integer> updateStatus(int id){
        int result=customerService.updateStatus(id,3);
        if(result>0){
            return RestResponse.success(result);
        }else{
            return RestResponse.error(RestCode.UNKNOWN_ERROR);
        }
    }
    @PutMapping(value = "/updateCustomer",produces = "application/json;charset=utf-8")
    public RestResponse<Integer> updateCustomer(@RequestBody Customer customer){
        int result=customerService.updateCustomer(customer);
        if(result>0){
            return RestResponse.success(result);
        }else{
            return RestResponse.error(RestCode.UNKNOWN_ERROR);
        }
    }
}
