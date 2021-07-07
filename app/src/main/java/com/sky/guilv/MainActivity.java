package com.sky.guilv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.ArrayMap;

import com.blankj.utilcode.util.LogUtils;
import com.p118pd.sdk.C8628oo0OO0O;
import com.p118pd.sdk.C8630oo0OO0OO;
import com.p118pd.sdk.C9046ooOoOOO;
import com.p118pd.sdk.C9054ooOoOo0;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Map<String, String> map = new ArrayMap<>();
        map.put("client", "android");
        map.put("version", MyConstants.appVersion);
        StringBuilder sb = new StringBuilder();
//        sb.append(C8742oo0oOo00.OooO0O0(C8625oo0OO00.OooO00o().OooO00o)); // todo
        sb.append(MyConstants.appVersionCode);
        String str = "";
        sb.append(str);
//        map.put("versionNumber", sb.toString());
        map.put("mobileTerminal", C8630oo0OO0OO.OooO00o().OooO0o);
        map.put("encrypt", "1");
        if (C9054ooOoOo0.OooO0Oo(C8630oo0OO0OO.OooO00o().OooO0oO)) {
            map.put("platformId", C8630oo0OO0OO.OooO00o().OooO0oO);
        }
//        map.putAll(C8625oo0OO00.OooO00o().m20250OooO00o());
        String OooO0OO = C8630oo0OO0OO.OooO00o().OooO0OO();
        if (C9054ooOoOo0.OooO0Oo(OooO0OO) && map.containsKey(OooO0OO)) {
            str = map.get(OooO0OO);
        }

//        C9046ooOoOOO.OooO00o(C8630oo0OO0OO.OooO00o().OooO0oo,
//                C8630oo0OO0OO.OooO00o().m20254OooO00o(),
//                C8628oo0OO0O.OooO00o(str), "1625585093928", map);

        map.put("mobileTerminal","internal");
//        map.put("encrypt","1");
//        map.put("client","android");
        map.put("appkey","gl_android_4da324c");
        map.put("_s_q__","bbb");
//        map.put("version","2.2.0");
        map.put("versionNumber","14");
        map.put("timestamp","1625585093928");
        C9046ooOoOOO.OooO00o("md5","",map);
    }
}