package com.example.asus.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by asus on 2018/5/6.
 */

public class ThreeActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uc2);
        Button btn1 = (Button) findViewById(R.id.button2);
    }
}
