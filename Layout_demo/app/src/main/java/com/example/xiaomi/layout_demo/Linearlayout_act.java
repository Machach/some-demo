package com.example.xiaomi.layout_demo;

/**
 * Created by xiaomi on 18-8-22.
 */
import android.app.AppOpsManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class Linearlayout_act extends AppCompatActivity implements View.OnClickListener {

    private Button act1_back;

    @Override

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linearlayout);

        act1_back=(Button)findViewById(R.id.act1_back);

        act1_back.setOnClickListener(this);

    }


    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.act1_back:
                Intent intent = new Intent();
                intent.setClass(Linearlayout_act.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                break;

        }

    }
}
