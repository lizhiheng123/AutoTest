package com.course.testng.Groups;

import org.testng.annotations.Test;

@Test(groups = "Teacher")
public class GroupsOnClass3 {

    public void tercher1(){
        System.out.println("GroupsOnClass3中的tercher11111运行");
    }

    public void tercher2(){
        System.out.println("GroupsOnClass3中的tercher22222运行");
    }
}