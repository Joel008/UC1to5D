package com.example.asus.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by asus on 2018/5/6.
 */

public class FourActivity extends Activity {
    private int currentColor=0;
    final int [] colors=new int[]{
            R.color.color1,
            R.color.color2,
            R.color.color3,
            R.color.color4,
            R.color.color5,
    };
    final int[] names=new int[]{
            R.id.textView2,
            R.id.textView3,
            R.id.textView4,
            R.id.textView5,
            R.id.textView6,
    };
    TextView[] views = new TextView[names.length];
    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg)
        {
            if (msg.what ==0x123)
            {
                for(int i=0;i<names.length;i++)
                {
                    views[i].setBackgroundResource(colors[(i+currentColor)%names.length]);
                }
                currentColor++;
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uc3);
        for (int i = 0;i<names.length;i++)
        {
            views[i]=(TextView)findViewById(names[i]);
        }
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0x123);
            }

        },0,200);
    }
}
