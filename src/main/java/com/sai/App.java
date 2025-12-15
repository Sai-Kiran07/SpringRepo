package com.sai;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Test test = (Test)context.getBean("test");
    	Test test1 = (Test)context.getBean("test");

        CycleTest ctest = (CycleTest)context.getBean("ctest");
        CycleTest ctest1 = (CycleTest)context.getBean("ctest1");

        System.out.println(test == test1); //singleton beans (true)
        System.out.println(ctest == ctest1); //prototype beans (false)

        System.out.println(test.getMark());
        System.out.println(ctest.getCmark());
        System.out.println(ctest.getCmark());
        
        test.display();
    }
}
