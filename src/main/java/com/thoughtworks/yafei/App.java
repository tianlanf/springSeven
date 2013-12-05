package com.thoughtworks.yafei;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextSpringSeven.xml");
        Student firstStudent = (Student) context.getBean("student");
        System.out.println(firstStudent);
        firstStudent.setId(100);
        Student secondStudent = (Student) context.getBean("student");
        System.out.println(secondStudent);

        firstStudent.pringMsg();
        secondStudent.pringMsg();

        Teacher firstTeacher = (Teacher) context.getBean("teacher");
        firstTeacher.setId(100);
        System.out.println(firstTeacher);
        Teacher secondTeacher = (Teacher) context.getBean("teacher");
        System.out.println(secondTeacher);

        firstTeacher.pringMsg();
        secondTeacher.pringMsg();
    }
}
