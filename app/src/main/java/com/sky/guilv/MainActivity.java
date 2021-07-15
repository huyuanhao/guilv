package com.sky.guilv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.p118pd.sdk.C8625oo0OO00;

public class MainActivity extends AppCompatActivity {
    static {
        System.loadLibrary("jinhui-encrypt");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    //编写一个native方法
//    public native C8625oo0OO00 oo0OO00();
}