package com.course.testng;

import org.testng.annotations.Test;
//异常测试
public class ExpectedException {
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSucess(){
        System.out.println("这是我的 一个异常测试");
        throw new RuntimeException();


    }


}
