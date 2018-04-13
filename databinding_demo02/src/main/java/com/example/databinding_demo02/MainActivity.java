package com.example.databinding_demo02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_one)
    Button btnOne;
    @BindView(R.id.btn_two)
    Button btnTwo;
    @BindView(R.id.btn_three)
    Button btnThree;
    @BindView(R.id.btn_four)
    Button btnFour;
    @BindView(R.id.btn_five)
    Button btnFive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_one, R.id.btn_two, R.id.btn_three, R.id.btn_four, R.id.btn_five})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
                //布局属性import用法与别名
                startActivity(new Intent(this, AliasActivity.class));
                break;

            case R.id.btn_two:
                startActivity(new Intent(this, ConverterActivity.class));
                break;

            case R.id.btn_three:
                startActivity(new Intent(this, ObservableUpdateActivity.class));
                break;

            case R.id.btn_four:
                startActivity(new Intent(this, ObservableFieldUpdateActivity.class));
                break;

            case R.id.btn_five:
                startActivity(new Intent(this, ObservableCollectionsActivity.class));
                break;
        }
    }

}
