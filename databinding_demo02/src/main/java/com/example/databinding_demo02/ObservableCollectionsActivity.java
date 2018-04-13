package com.example.databinding_demo02;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.databinding_demo02.databinding.ActivityObservableCollectionsBinding;

/**
 * 创建日期：2018/4/13 on 下午10:55
 * 描述: DataBinding的动态更新->way3：使用Observable容器
 * 如果有多个UserBean类型的数据需要动态更新：
 * Observable容器包含ObservableArrayList和ObservableArrayMap
 * 这时无须创建符合动态更新机制的Model实体类，是需要在代码中应用ObservableArrayList或ObservableArrayMap即可。
 * 作者: liangyang
 */
public class ObservableCollectionsActivity extends AppCompatActivity {

    private ObservableArrayList<UserBean> list;
    private UserBean userBean1;
    private UserBean userBean2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_observable_collections);

        ActivityObservableCollectionsBinding binding = DataBindingUtil.setContentView(
                this, R.layout.activity_observable_collections);

        setTitle(R.string.function_five);

        list = new ObservableArrayList<>();
        userBean1 = new UserBean("马天宇", 29);
        userBean2 = new UserBean("李钟硕", 28);

        list.add(userBean1);
        list.add(userBean2);

        binding.setList(list);

        binding.btnChangeList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userBean1.setName("马天宇icon");
                userBean2.setName("李钟硕icon");

                list.add(userBean1);
                list.add(userBean2);
            }
        });

    }
}
