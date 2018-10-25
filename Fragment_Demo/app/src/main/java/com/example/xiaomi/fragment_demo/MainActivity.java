package com.example.xiaomi.fragment_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mAddBtn = null;
    private Button mRemoveBtn = null;
    private Button mRepalceBtn = null;
    private Fragment mSecondFragment = null;
    private Fragment mThirdFragment = null;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAddBtn=(Button)findViewById(R.id.add_btn);
        mRemoveBtn=(Button)findViewById(R.id.remove_btn);
        mRepalceBtn=(Button)findViewById(R.id.replace_btn);

        // create instance

        mSecondFragment=new SecondFragment();
        mThirdFragment=new ThirdFragment();

        //set listen

        mAddBtn.setOnClickListener(this);
        mRemoveBtn.setOnClickListener(this);
        mRepalceBtn.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        FragmentManager fragmentManager = getFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        switch (v.getId()){
            case R.id.add_btn:
                if(!mSecondFragment.isAdded()){
                    fragmentTransaction.add(R.id.fragment_container1,mSecondFragment);
                }
                if(!mThirdFragment.isAdded()){
                    fragmentTransaction.add(R.id.fragment_container2,mThirdFragment);
                }
                break;

            case R.id.remove_btn:
                fragmentTransaction.remove(mSecondFragment);
                break;

            case R.id.replace_btn:
                if(!mSecondFragment.isAdded()){
                    fragmentTransaction .replace(R.id.fragment_container2,mSecondFragment);
                }
                break;

            default:
                break;

        }


        fragmentTransaction.commit();

    }
}
