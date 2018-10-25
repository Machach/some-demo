package com.example.xiaomi.intent_demo;

/**
 * Created by xiaomi on 18-8-15.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    private TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText("在AndroidManifest.xml文件中本Activity的category配置了android.intent.category.DEFAULT，同时给action配置了com.ywz.ywz，这个名字也是后面隐式调用时action的值");
    }

}