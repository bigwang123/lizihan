package com.cblue.service.impl;

import com.cblue.service.AccountService;

import java.util.*;

public class AccountServiceImpl3 implements AccountService {

    private String [] myStrs;
    private List<String> myList;
    private Set<String> mySet;
    private Map<String,String> myMap;

    public AccountServiceImpl3 setMyStrs(String[] myStrs) {
        this.myStrs = myStrs;
        return this;
    }

    public AccountServiceImpl3 setMyList(List<String> myList) {
        this.myList = myList;
        return this;
    }

    public AccountServiceImpl3 setMySet(Set<String> mySet) {
        this.mySet = mySet;
        return this;
    }

    public AccountServiceImpl3 setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
        return this;
    }

    public AccountServiceImpl3 setMyProps(Properties myProps) {
        this.myProps = myProps;
        return this;
    }

    private Properties myProps;


    public void saveAccount() {
        System.out.println(Arrays.toString(myStrs));
        System.out.println(myList);
        System.out.println(mySet);
        System.out.println(myMap);
        System.out.println(myProps);

    }
}
