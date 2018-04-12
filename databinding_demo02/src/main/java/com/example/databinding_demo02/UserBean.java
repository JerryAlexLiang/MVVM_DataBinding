package com.example.databinding_demo02;

/**
 * 创建日期：2018/4/12 on 下午10:50
 * 描述:
 * 作者:yangliang
 */
public class UserBean {

    private String name;
    private int age;

    public UserBean(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
