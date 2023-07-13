package com.course.testng;

import org.testng.annotations.*;

public class BasicCAnntation {
    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testcase1(){
        System.out.println("这是测试用例1");

    }
    @Test
    public void testcase2(){
        System.out.println("这是测试用例2");

    }

    @BeforeMethod
    public void befforeMethord(){
        System.out.println("BefforeMethord这是在测试方法之前运行的");
    }

    @AfterMethod
    public void afterMethord(){
        System.out.println("AfterMethord这是在测试方法之前运行的");
    }

    @BeforeClass
    public void Beforeclass(){
        System.out.println("Beforeclass是在类执行之前运行的");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("AfterClass是在类执行之后运行的");
    }

    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BeforeSuite测试套件");

    }

    @AfterSuite
    public void  AfterSuite(){

        System.out.println("AfterSuite测试套件");


    }



}
