package com.example.databinding_demo02;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.databinding_demo02.databinding.ActivityConverterBinding;

import java.util.Date;

public class ConverterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_converter);

        setTitle(R.string.function_two);
        ActivityConverterBinding binding = DataBindingUtil.setContentView(
                this,R.layout.activity_converter);

        binding.setTime(new Date());
    }
}
