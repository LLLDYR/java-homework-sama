package com.homework03.test;
import com.homework03.entity.Course;

public class CourseTest {
    public static void main(String[] args) {
        testNewStudent();
    }
    public static void testNewStudent() {
        Course javaProgrammming;
        //Course ACC= new Course();
        javaProgrammming = new Course(2018001,"Java程序设计",true);
        System.out.println("课程名称：" + javaProgrammming.getName());
        System.out.println("课程编号：" + javaProgrammming.getNumber());
        System.out.println("是否为必修课：" + javaProgrammming.isRequired());
        javaProgrammming.setName("web开发技术");
        javaProgrammming.setRequired(false);
        System.out.println("课程名称：" + javaProgrammming.getName());
        System.out.println("课程编号：" + javaProgrammming.getNumber());
        System.out.println("是否为必修课：" + javaProgrammming.isRequired());
    }
}
