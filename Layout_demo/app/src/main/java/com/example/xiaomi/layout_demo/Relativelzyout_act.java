package com.example.xiaomi.layout_demo;

import android.content.Intent;
import android.icu.util.BuddhistCalendar;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by xiaomi on 18-8-23.
 */

public class Relativelzyout_act extends AppCompatActivity implements View.OnClickListener{

    private Button act2_back;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relativelayout);

        act2_back=(Button)findViewById(R.id.act2_back);

        act2_back.setOnClickListener(this);

    }

    @Override

    public void onClick(View v){
        switch (v.getId()){
            case R.id.act2_back:
                Intent intent = new Intent();
                intent.setClass(Relativelzyout_act.this,MainActivity.class);
                startActivity(intent);
                break;
        }

    }
}
