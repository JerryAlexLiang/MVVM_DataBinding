package com.example.databinding_demo02;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.databinding_demo02.databinding.ActivityAliasBinding;

public class AliasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_alias);

        setTitle(R.string.function_one);
        //使用DataBindingUtil.setContentView代替了setContentView
        ActivityAliasBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_alias);

        //创建JavaBean对象，与 variable 进行数据绑定
        UserBean man = new UserBean("马天宇", 28);
        binding.setMan(man);

        UserBean woman = new UserBean("李兰迪", 18);
        binding.setWoman(woman);
    }
}
