package com.example.xiaomi.fragment_demo;

/**
 * Created by xiaomi on 18-8-20.
 */
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;




public class FirstFragment extends Fragment{
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container,Bundle savedInstanceState ){
        View view = inflater.inflate(R.layout.fragment_first,container,false);
        return view;
    }

}
