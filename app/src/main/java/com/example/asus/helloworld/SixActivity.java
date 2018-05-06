package com.example.asus.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.GridLayout;

/**
 * Created by asus on 2018/5/6.
 */

public class SixActivity extends AppCompatActivity {
    GridLayout gridLayout;
    //定义一个15个按钮的文本
    String []chars=new String[]{
            "1","2","3","*",
            "4","5","6","/",
            "7","8","9","-",
            ".","0","=","+",
    };
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uc5);
        gridLayout=findViewById(R.id.root);
        for(int i=0;i<chars.length;i++){
            Button bn=new Button(this);
            bn.setText(chars[i]);
            bn.setTextSize(40);
            bn.setPadding(5,35,5,35);
       /*   GridLayout.Spec rowSpec=GridLayout.spec(i/2);
          GridLayout.Spec columnSpec=GridLayout.spec(i%2);
          GridLayout.LayoutParams params=new GridLayout.LayoutParams(rowSpec,columnSpec);
          //设置该组件占满父容器
          params.setGravity(Gravity.FILL);
          gridLayout.addView(bn,params);*/
            gridLayout.addView(bn);
        }
    }
}
