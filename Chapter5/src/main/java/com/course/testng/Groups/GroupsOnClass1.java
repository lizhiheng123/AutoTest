package com.course.testng.Groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass1 {

    public void stu1(){
        System.out.println("GroupsOnClass1中的Stu11111运行");
    }

    public void stu2(){
        System.out.println("GroupsOnClass1中的Stu22222运行");
    }
}
