package com.example.xiaomi.intent_demo;

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


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private EditText username;
    private TextView userage;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        username=(EditText)findViewById(R.id.username);
        userage=(TextView)findViewById(R.id.userage);
        imageView=(ImageView)findViewById(R.id.imageView);

        button1.setOnClickListener(this);
        button4.setOnClickListener(this);
        button3.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        Log.i("debug","onActivityResult"+"requestCode"+requestCode+"\n resultCode"+resultCode);
        if(requestCode==123){
            switch (resultCode){
                case 200:
                    userage.setText(data.getStringExtra("age"));
                    break;
                case -1:
                    final Bitmap photo=data.getParcelableExtra("data");
                    imageView.setImageBitmap(photo);

            }
        }

    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.button1:
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Main2Activity.class);
                intent.putExtra("name",username.getText().toString());
                startActivityForResult(intent,123);
                break;
            case R.id.button2:
                Intent intent1=new Intent();
                intent1.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent1,123);
                break;
            case R.id.button3:
                Intent sendIntent=new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,"Android分享");
                sendIntent.setType("text/plain");
                startActivity(Intent.createChooser(sendIntent,"分享界面Title"));
                break;
            case R.id.button4:
                Intent intent2=new Intent();
                intent2.setAction("com.text.jh");
                startActivity(intent2);
                break;
        }

    }






}
