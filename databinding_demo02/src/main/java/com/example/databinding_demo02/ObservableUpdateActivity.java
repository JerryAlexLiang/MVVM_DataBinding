package com.example.databinding_demo02;

import android.database.DatabaseUtils;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.databinding_demo02.databinding.ActivityObservableUpdateBinding;

/**
 * 创建日期：2018/4/13 on 下午5:17
 * 描述: DataBinding的动态更新->way1：继承Observable类
 * 作者: liangyang
 */
public class ObservableUpdateActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityObservableUpdateBinding binding;
    private ObUserBean obUserBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_observable_update);
        binding = DataBindingUtil.setContentView(
                this, R.layout.activity_observable_update);

        setTitle(R.string.btn_update_way_one);

        obUserBean = new ObUserBean("马天宇", 29);
        binding.setObuserbean(obUserBean);

        binding.btnUpdate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_update:
                //使用继承Observable类(BaseObservable类)实现动态更新
                obUserBean.setName("马天宇iocn");
                obUserBean.setAge(30);
                break;

            default:
                break;
        }
    }
}
