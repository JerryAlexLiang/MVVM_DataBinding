package com.example.databinding_demo01;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.databinding_demo01.databinding.ActivityMainBinding;

/**
 * 创建日期：2018/4/12 on 下午4:53
 * 描述: 4、MainActivity
 * 这个activity很简洁，没有了没有了控件的初始化的findViewById或者ButterKnife的那一堆注解，
 * 也没有了TextView的setText()。
 * （1）、这里用DataBindingUtil.setContentView代替了setContentView，
 * （2）、然后创建一个 UserBean 对象，通过 binding.setUser(userBean) 与 variable 进行绑定。
 * 注意：这个ActivityMainBinding 是如何生成的呢？他是继承ViewDataBinding，这个类的生成是有规则的，
 * 它是根据对应的布局文件的名字生成的，比如：activity_main-->ActivityMainBinding 、fragment-->FragmentBinding
 * 即：第一个单词首字母大写，第二个单词首字母大写，最后都会拼上Binding就是生成的Binding类。
 * 作者: liangyang
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        //使用DataBindingUtil.setContentView代替了setContentView
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //创建JavaBean对象，与 variable 进行数据绑定
        UserBean userBean = new UserBean("马天宇", 29);
        binding.setUser(userBean);

    }
}
