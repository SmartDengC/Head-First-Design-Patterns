package com.dengc.implementStrategy;

import org.springframework.stereotype.Component;

/**
 * 默认用户
 *
 * @author HaHaDeng
 * @since 2025/7/3 00:21
 */
@Component
public class DefaultCustomerService implements CustomerService{
    @Override
    public String findCustomer() {
        return "找不到客服";
    }
}
