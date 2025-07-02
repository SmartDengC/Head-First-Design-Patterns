package com.dengc.implementStrategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvokeTest {

    @Test
    public void testInvoke() {
        Invoke invoke = new Invoke();
        String customer = invoke.invokeMethod(5);
        System.out.println(customer);
        assertEquals("NormalCustomerService", customer);
    }
}
