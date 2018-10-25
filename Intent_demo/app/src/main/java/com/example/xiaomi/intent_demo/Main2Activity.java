package com.example.xiaomi.intent_demo;


import android.content.Intent;
import android.icu.util.BuddhistCalendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    private TextView textView;
    private EditText activity2_age;
    private  Button activity2_back;
    private Intent intent;



    @Override
    protected void onCreate(Bundle savedInstanseState){
        super.onCreate(savedInstanseState);
        setContentView(R.layout.activity_main2);
        intent=getIntent();
        textView=(TextView)findViewById(R.id.activity2_data);
        activity2_age=(EditText)findViewById(R.id.activity2_age);
        activity2_back=(Button)findViewById(R.id.activity2_back);

        textView.setText(intent.getStringExtra("name"));
        activity2_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.activity2_back:
                Intent intent_back=new Intent();
                intent_back.putExtra("age",activity2_age.getText().toString());
                setResult(200,intent_back);
                finish();
                break;
        };

    }
}
