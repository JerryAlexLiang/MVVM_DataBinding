package com.example.databinding_demo02;

import android.databinding.ObservableField;

/**
 * 创建日期：2018/4/13 on 下午5:50
 * 描述:DataBinding的动态更新->way2：使用系统提供的引用数据类型和基本数据类型通用的ObservableField
 * 它们都继承自BaseObservable类
 * 这个方法其实比继承BaseObservable类要方便一些
 * 作者:yangliang
 */
public class ObFiledUserBean {

    public ObservableField<String> name = new ObservableField<>();

    public ObservableField<Integer> age = new ObservableField<>();

    public ObFiledUserBean(String name, int age) {
        this.name.set(name);
        this.age.set(age);
    }

    public ObservableField<String> getName() {
        return name;
    }

    public void setName(ObservableField<String> name) {
        this.name = name;
    }

    public ObservableField<Integer> getAge() {
        return age;
    }

    public void setAge(ObservableField<Integer> age) {
        this.age = age;
    }
}
