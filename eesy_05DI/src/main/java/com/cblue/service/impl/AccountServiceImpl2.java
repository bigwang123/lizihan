package com.cblue.service.impl;

import com.cblue.service.AccountService;

public class AccountServiceImpl2 implements AccountService {
    //经常变化的数据，并不适用与注入的方式
    private String name ;

    private Integer age ;

    private String birthday ;

    public AccountServiceImpl2 setName(String name) {
        this.name = name;
        return this;
    }

    public AccountServiceImpl2 setAge(Integer age) {
        this.age = age;
        return this;
    }

    public AccountServiceImpl2 setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public void saveAccount() {

        System.out.println("service中的saveAccount执行了"+name+","+age+","+birthday);
    }
}
