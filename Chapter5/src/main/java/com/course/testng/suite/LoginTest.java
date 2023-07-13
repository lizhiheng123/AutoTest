package com.course.testng.suite;

import org.testng.annotations.Test;

//测试套件之前需要运行的方法，共有的东西
public class LoginTest {

    @Test
    public void PayTest(){
        System.out.println("支付宝支付成功");
    }
}
