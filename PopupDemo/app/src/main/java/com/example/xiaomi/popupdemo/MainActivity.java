package com.example.xiaomi.popupdemo;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int counter;
    Button mAddOne,mSubOne;
    TextView mTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("onCreate-----------");

        counter = 0;

        mAddOne=(Button)findViewById(R.id.bAddOne);
        mSubOne=(Button)findViewById(R.id.bSubOne);
        mTotal=(TextView)findViewById(R.id.tvTotal);

// 添加按钮单机响应函数
        mAddOne.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View v){
                counter++;
                mTotal.setText("总数为："+counter);
            }
        });

        mSubOne.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                counter--;
                mTotal.setText("总数为：" +counter);

            }
        });
    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu){
//
//        getManuInflater().inflate(R.menu.main,menu);
//        return true;
//    }
//
//    @Override
//
//    public boolean onOptionsItemselected(MenuItem item){
//
//        int id =item.getItemId();
//        if(id==R.id.action_settings){
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }

}


