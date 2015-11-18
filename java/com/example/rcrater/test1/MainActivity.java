package com.example.rcrater.test1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by rcrater on 9/16/15.
 */
public class MainActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout1 = new LinearLayout(this);
        Button b1 = new Button(this);
        b1.setText("Hi");
        layout1.addView(b1);
        setContentView(layout1);
    }
}
