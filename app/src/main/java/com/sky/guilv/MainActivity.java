package com.sky.guilv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.ArrayMap;

import com.blankj.utilcode.util.LogUtils;
import com.p118pd.sdk.C8625oo0OO00;
import com.p118pd.sdk.C8628oo0OO0O;
import com.p118pd.sdk.C8630oo0OO0OO;
import com.p118pd.sdk.C9046ooOoOOO;
import com.p118pd.sdk.C9054ooOoOo0;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
    public native C8625oo0OO00 OooO00o(C8625oo0OO00 oo0oo00);
}