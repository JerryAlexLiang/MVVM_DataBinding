package com.example.databinding_demo02;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.databinding_demo02.databinding.ActivityObservableFieldUpdateBinding;

/**
 * 创建日期：2018/4/13 on 下午5:48
 * 描述: DataBinding的动态更新->way2：使用系统提供的引用数据类型和基本数据类型通用的ObservableField，
 * 它们都继承自BaseObservable
 * 这个方法其实比继承BaseObservable类要方便一些
 * 作者: liangyang
 */
public class ObservableFieldUpdateActivity extends AppCompatActivity {

    private ObFiledUserBean obFiledUserBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_observable_field_update);

        ActivityObservableFieldUpdateBinding binding = DataBindingUtil.setContentView(
                this, R.layout.activity_observable_field_update);

        setTitle(R.string.btn_update_way_two);

        obFiledUserBean = new ObFiledUserBean("马天宇", 29);
        binding.setObfuser(obFiledUserBean);

        binding.btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obFiledUserBean.name.set("马天宇iocn");
                obFiledUserBean.age.set(30);
            }
        });

    }
}
