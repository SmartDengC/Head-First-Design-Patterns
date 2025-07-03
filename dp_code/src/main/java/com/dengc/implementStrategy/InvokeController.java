package com.dengc.implementStrategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 调用
 *
 * @author HaHaDeng
 * @since 2025/7/3 00:20
 */

@RestController
public class InvokeController {

    // 定义map
    private Map<UserType, CustomerService> customerServiceMap;

    @Autowired
    private DefaultCustomerService defaultCustomerService;

    /**
     * 主要的调用方法
     */
    @GetMapping("/customer/{recharge}")
    public String invokeMethod(@PathVariable(value = "recharge") int recharge){
        UserType userType = UserType.typeOf(recharge);
        CustomerService customerService = customerServiceMap.getOrDefault(userType, defaultCustomerService);
        return customerService.findCustomer();
    }

    @GetMapping("/test/{recharge}")
    public String testMethod(@PathVariable(value = "recharge") Integer recharge){
        return recharge.toString();
    }

    @Autowired
    public void setCustomerServiceMap(List<CustomerService> customerServiceList) {
        this.customerServiceMap = customerServiceList.stream()
                .filter(customerService -> customerService.getClass().isAnnotationPresent(SupportUserType.class))
                .collect(Collectors.toMap(this::findUserTypeFromService, Function.identity()));
        if(this.customerServiceMap.size() != UserType.values().length){
            throw new RuntimeException("请检查是否所有的用户类型都已经被处理");
        }
    }

    private UserType findUserTypeFromService(CustomerService customerService){
        SupportUserType annotation = customerService.getClass().getAnnotation(SupportUserType.class);
        return annotation.value();
    }


}
