package com.sky.guilv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.ArrayMap;

import com.blankj.utilcode.util.LogUtils;
import com.p118pd.sdk.C9046ooOoOOO;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Map<String, String> map = new ArrayMap<>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        C9046ooOoOOO.OooO00o("str","str2",map);
    }
}