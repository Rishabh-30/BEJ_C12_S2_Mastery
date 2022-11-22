package org.niit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie bhool = context.getBean("m1", Movie.class);
        Movie student = context.getBean("m2", Movie.class);
        Movie rocketry = context.getBean("m3", Movie.class);

        System.out.println("bhool = " + bhool);
        System.out.println();
        System.out.println("student = " + student);
        System.out.println();
        System.out.println("rocketry = " + rocketry);

    }
}
