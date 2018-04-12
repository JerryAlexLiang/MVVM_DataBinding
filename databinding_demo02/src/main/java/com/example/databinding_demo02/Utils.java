package com.example.databinding_demo02;

import android.annotation.SuppressLint;
import android.databinding.BindingConversion;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 创建日期：2018/4/12 on 下午11:32
 * 描述:
 * 作者:yangliang
 */
public class Utils {
    /**
     * DataBinding布局属性之转换器
     * 时间转换
     * @param date
     * @return
     */
    @BindingConversion
    public static String convertDate(Date date){
        @SuppressLint("SimpleDateFormat") SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

}
