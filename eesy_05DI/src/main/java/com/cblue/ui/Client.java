package com.cblue.ui;

import com.cblue.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    /**
     * @param args
     */
    public static void main(String[] args){
        //获取核心容器的对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //根据id获取bean对象
       // AccountService as = (AccountService) ac.getBean("accountService");
       // AccountService as = (AccountService) ac.getBean("accountService2");
        AccountService as = (AccountService) ac.getBean("accountService3");
        as.saveAccount();

    }
}
