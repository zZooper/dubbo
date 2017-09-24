package com.zZooper.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/9/23.
 */
public class DubboCunsumer  {
    private static ClassPathXmlApplicationContext context;

    static {
        context = new ClassPathXmlApplicationContext(new String[]{"dubbo-consumer.xml"});
        context.start();
    }

    public static Object getBean(String beanName){
        return context.getBean(beanName);
    }
}
