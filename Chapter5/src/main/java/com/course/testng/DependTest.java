package com.course.testng;

import org.testng.annotations.Test;

//依赖测试,如果1失败了，2就会被异常抛出
public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");

    }

}
