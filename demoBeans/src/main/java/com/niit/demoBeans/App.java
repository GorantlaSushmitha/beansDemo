package com.niit.demoBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		Object messageBeans=context.getBean("WelcomeMessageBean");
		System.out.println(((WelcomeMessge) messageBeans).getmessage());
		
		Object car = context.getBean("carDemo");
		System.out.println(((car)car).getColor());
    }
}
