package com.example.xiaomi.layout_demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by xiaomi on 18-8-23.
 */


public class Tablelayout_act extends AppCompatActivity implements View.OnClickListener{

    private Button act3_back;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tablelayout);
        act3_back=(Button)findViewById(R.id.act3_back);

        act3_back.setOnClickListener(this);

    }

    @Override

    public void onClick(View v){
        switch (v.getId()){

            case R.id.act3_back:
                Intent intent = new Intent();
                intent.setClass(Tablelayout_act.this,MainActivity.class);
                startActivity(intent);
                break;

        }

    }
}
