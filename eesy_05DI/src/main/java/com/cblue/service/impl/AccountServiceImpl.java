package com.cblue.service.impl;

import com.cblue.service.AccountService;

public class AccountServiceImpl implements AccountService {
    //经常变化的数据，并不适用与注入的方式
    private String name ;

    private Integer age ;

    private String birthday ;

    public AccountServiceImpl(String name, Integer age, String birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public void saveAccount() {

        System.out.println("service中的saveAccount执行了"+name+","+age+","+birthday);
    }
}
