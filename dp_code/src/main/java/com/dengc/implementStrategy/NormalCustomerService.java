package com.dengc.implementStrategy;

import org.springframework.stereotype.Component;

/**
 * 普通玩家
 *
 * @author HaHaDeng
 * @since 2025/7/3 00:00
 */

@Component
@SupportUserType(UserType.Normal)
public class NormalCustomerService implements CustomerService{
    @Override
    public String findCustomer() {
        return "普通玩家";
    }
}
