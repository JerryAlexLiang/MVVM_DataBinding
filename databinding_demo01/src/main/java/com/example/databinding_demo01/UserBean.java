package com.example.databinding_demo01;

/**
 * 创建日期：2018/4/12 on 下午4:42
 * 描述:2、创建一个简单的JavaBean对象
 * 作者:yangliang
 */
public class UserBean {

    //姓名
    private String name;
    //年龄
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
