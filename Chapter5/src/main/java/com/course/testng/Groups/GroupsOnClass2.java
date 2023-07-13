package com.course.testng.Groups;

import org.testng.annotations.Test;

    @Test(groups = "stu")
    public class GroupsOnClass2 {

        public void stu1(){
            System.out.println("GroupsOnClass2中的Stu11111运行");
        }

        public void stu2(){
            System.out.println("GroupsOnClass2中的Stu22222运行");
        }
    }

