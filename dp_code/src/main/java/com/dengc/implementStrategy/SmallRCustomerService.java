package com.dengc.implementStrategy;

import org.springframework.stereotype.Component;

/**
 * 小R玩家
 *
 * @author HaHaDeng
 * @since 2025/7/3 00:01
 */

@Component
@SupportUserType(UserType.SmallR)
public class SmallRCustomerService implements CustomerService{
    @Override
    public String findCustomer() {
        return "小R玩家";
    }
}
