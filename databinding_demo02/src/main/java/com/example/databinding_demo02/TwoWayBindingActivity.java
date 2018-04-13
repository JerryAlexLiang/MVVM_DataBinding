package com.example.databinding_demo02;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.databinding_demo02.databinding.ActivityTwoWayBindingBinding;

/**
 * 创建日期：2018/4/14 on 上午1:31
 * 描述: DataBinding双向数据绑定
 * 从MVVM模式的角度来说，双向绑定就是Model和View通过ViewModel进行双向动态更新。
 * 之前是当Model实体类发生变化，UI会动态更新。反过来，就是如果UI发生变化，相应的实体类动态更新。
 * 前提：UI要结合动态更新机制
 * 作者: liangyang
 */
public class TwoWayBindingActivity extends AppCompatActivity {

    private ObUserBean obUserBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_two_way_binding);

        ActivityTwoWayBindingBinding binding = DataBindingUtil.setContentView(
                this, R.layout.activity_two_way_binding);

        setTitle(R.string.function_six);

        //初始化数据
        obUserBean = new ObUserBean("马天宇", 29);
        //绑定数据
        binding.setObuserbean(obUserBean);

        System.out.println("=====>   " + obUserBean.getName());

        //点击监听事件
        binding.btnResetBinding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //重置数据
                obUserBean.setName("马天宇");
            }
        });
    }
}
