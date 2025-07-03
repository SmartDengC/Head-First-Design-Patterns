package com.dengc.implementStrategy;



class InvokeTest {

    public void testInvoke() {
        InvokeController invoke = new InvokeController();
        String customer = invoke.invokeMethod(5);
        System.out.println(customer);
    }

    public void test(){
        StringBuilder s = new StringBuilder();
        s.append("1");
    }
}
