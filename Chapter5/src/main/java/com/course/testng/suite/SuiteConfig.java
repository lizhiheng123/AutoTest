package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig{

    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BeforeSuite运行了");
    }

    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterSuite运行了");
    }
    @AfterTest
    public  void AfterTest(){
        System.out.println("AfterTest");

    }

    @BeforeTest
    public  void BeforeTest(){
        System.out.println("BeforeTest");

    }


}
