package com.example.xiaomi.layout_demo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.nfc.Tag;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button1:
                Intent intent1=new Intent();
                intent1.setClass(MainActivity.this,Linearlayout_act.class);
                startActivity(intent1);
                break;
            case R.id.button2:
                Intent intent2=new Intent();
                intent2.setClass(MainActivity.this,Relativelzyout_act.class);
                startActivity(intent2);
                break;
            case R.id.button3:
                Intent intent3=new Intent();
                intent3.setClass(MainActivity.this,Tablelayout_act.class);
                startActivity(intent3);
                break;
        }

    }





}
