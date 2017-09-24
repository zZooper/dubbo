package com.zZooper.listener;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by Administrator on 2017/9/23.
 */
public class DubboProviderInitListenner implements ServletContextListener{
    private static Logger log = Logger.getLogger(DubboProviderInitListenner.class);

    public void contextInitialized(ServletContextEvent sce) {
        log.info("dubbo_privider初始化开始");
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo-provider.xml"});
            context.start();
//            System.in.read();

            log.info("dubbo_privider初始化结束");
        }catch (Exception e){
            log.error("dubbo_privider初始化异常:",e);
        }
    }

    public void contextDestroyed(ServletContextEvent sce) {

    }
}
