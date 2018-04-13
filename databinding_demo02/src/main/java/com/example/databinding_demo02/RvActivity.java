package com.example.databinding_demo02;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;

import com.example.databinding_demo02.databinding.ActivityRvBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建日期：2018/4/14 on 上午2:06
 * 描述: DataBinding结合RecyclerView的使用
 * 作者: liangyang
 */
public class RvActivity extends AppCompatActivity {

    private ActivityRvBinding binding;
    private List<UserBean> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_rv);

        //通过RecyclerView的id，在Activity中使用DataBinding来使用RecyclerView控件
        binding = DataBindingUtil.setContentView(this, R.layout.activity_rv);

        //初始化RecyclerView
        initRecyclerView();
        //初始化数据源
        initData();
    }

    private void initData() {
        UserBean userBean1 = new UserBean("马天宇01", 29);
        UserBean userBean2 = new UserBean("马天宇02", 28);
        UserBean userBean3 = new UserBean("马天宇03", 27);
        UserBean userBean4 = new UserBean("马天宇04", 29);
        UserBean userBean5 = new UserBean("马天宇05", 25);
        UserBean userBean6 = new UserBean("马天宇06", 29);
        UserBean userBean7 = new UserBean("马天宇07", 23);
        UserBean userBean8 = new UserBean("马天宇08", 29);
        UserBean userBean9 = new UserBean("马天宇09", 22);
        UserBean userBean10 = new UserBean("马天宇10", 21);
        UserBean userBean11 = new UserBean("马天宇11", 19);
        UserBean userBean12 = new UserBean("马天宇12", 29);
        UserBean userBean13 = new UserBean("马天宇13", 26);
        UserBean userBean14 = new UserBean("马天宇14", 27);
        UserBean userBean15 = new UserBean("马天宇15", 29);
        UserBean userBean16 = new UserBean("马天宇16", 23);
        UserBean userBean17 = new UserBean("马天宇17", 22);
        UserBean userBean18 = new UserBean("马天宇18", 29);
        UserBean userBean19 = new UserBean("马天宇19", 21);
        UserBean userBean20 = new UserBean("马天宇20", 20);
        UserBean userBean21 = new UserBean("马天宇21", 28);
        UserBean userBean22 = new UserBean("马天宇22", 22);
        UserBean userBean23 = new UserBean("马天宇23", 21);
        UserBean userBean24 = new UserBean("马天宇24", 25);
        UserBean userBean25 = new UserBean("马天宇25", 22);

        list.add(userBean1);
        list.add(userBean2);
        list.add(userBean3);
        list.add(userBean4);
        list.add(userBean5);
        list.add(userBean6);
        list.add(userBean7);
        list.add(userBean8);
        list.add(userBean9);
        list.add(userBean10);
        list.add(userBean11);
        list.add(userBean12);
        list.add(userBean13);
        list.add(userBean14);
        list.add(userBean15);
        list.add(userBean16);
        list.add(userBean17);
        list.add(userBean18);
        list.add(userBean19);
        list.add(userBean20);
        list.add(userBean21);
        list.add(userBean22);
        list.add(userBean23);
        list.add(userBean24);
        list.add(userBean25);
    }

    private void initRecyclerView() {
        //设置RecyclerView的布局
        LinearLayoutManager manager = new LinearLayoutManager(RvActivity.this);
        binding.recycler.setLayoutManager(manager);
//        //添加Android自带的分割线
//        binding.recycler.addItemDecoration(new DividerItemDecoration(
//                this, DividerItemDecoration.VERTICAL));

        //添加自定义分割线
        DividerItemDecoration divider = new DividerItemDecoration(
                this, DividerItemDecoration.VERTICAL);
        divider.setDrawable(ContextCompat.getDrawable(this,R.drawable.rv_divirer));
        binding.recycler.addItemDecoration(divider);

        //初始化、绑定适配器
        RvAdapter adapter = new RvAdapter(list, RvActivity.this);
        binding.recycler.setAdapter(adapter);
    }
}
