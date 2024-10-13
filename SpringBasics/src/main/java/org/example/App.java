package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        //This line basically creates a container for you.
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // this gives alien object.
        Alien obj1 = (Alien) context.getBean("alien1");
        //obj1.age = 24;
        //obj1.setAge(21);
        System.out.println(obj1.getAge());
       obj1.code();

//        Alien obj2 = (Alien) context.getBean("alien1");
//        System.out.println(obj2.getAge());
       //  obj2.code();
    }
}
