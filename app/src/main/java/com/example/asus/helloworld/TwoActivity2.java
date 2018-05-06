package com.example.asus.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by asus on 2018/5/6.
 */

public class TwoActivity2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uc12);
        Button btn1 = (Button) findViewById(R.id.button5);
        Button btn2 = (Button) findViewById(R.id.button9);
        Button btn3 = (Button) findViewById(R.id.button10);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TwoActivity2.this, TwoActivity1.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TwoActivity2.this, TwoActivity2.class);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TwoActivity2.this, TwoActivity3.class);
                startActivity(intent);
            }
        });
    }
}
