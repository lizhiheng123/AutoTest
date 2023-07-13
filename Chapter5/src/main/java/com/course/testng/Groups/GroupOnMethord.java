package com.course.testng.Groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOnMethord {
    @Test(groups = "server")
    public  void test1(){
        System.out.println("这是服务端测组的测试方法11111");

    }

    @Test(groups = "server")
    public  void test2(){
        System.out.println("这是服务端测组的测试方法22222");

    }

    @Test(groups = "client")
    public  void test3(){
        System.out.println("这是服务端测组的测试方法33333");

    }

    @Test(groups = "client")
    public  void test4(){
        System.out.println("这是服务端测组的测试方法44444");

    }

    @BeforeGroups("server")
    public void beforeGroupsOnserver(){
        System.out.println("这是服务端运行之前的方法");
    }

    @AfterGroups("server")
    public void afterGroupsOnserver(){
        System.out.println("这是服务端运行之后的方法！！！");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnclient(){
        System.out.println("这是服务端运行之前的方法");
    }

    @AfterGroups("client")
    public void afterGroupsOnclient(){
        System.out.println("这是服务端运行之后的方法！！！");
    }



}
