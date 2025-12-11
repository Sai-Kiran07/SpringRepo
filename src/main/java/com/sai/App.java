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
    	test.test();
    }
}
