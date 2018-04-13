package com.example.databinding_demo02;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * 创建日期：2018/4/13 on 下午5:19
 * 描述:DataBinding的动态更新->way1：继承Observable类
 * 在getter上使用@Bindable注解，在setter中通知更新。其中BR是在编译是生成的类，其功能与R.Java类似
 * 使用@Bindable标记过的getter方法会在BR中生成一个相应的字段。
 * 在setter中调用通知系统BR.name这个字段的数据已经发生变化并更新UI
 * 作者:yangliang
 */
public class ObUserBean extends BaseObservable {

    private String name;

    private int age;

    public ObUserBean(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }
}
