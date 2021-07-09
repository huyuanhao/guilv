package com.sky.guilv;

import android.util.ArrayMap;

import com.p118pd.sdk.C8630oo0OO0OO;
import com.p118pd.sdk.C8932ooOOO0o;
import com.p118pd.sdk.C9048ooOoOOOo;
import com.p118pd.sdk.C9052ooOoOOoo;
import com.p118pd.sdk.C9054ooOoOo0;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author PC
 * @date 2021/07/08 17:57
 */
public class tests {
    private static HashMap< String, String> map;
    public static boolean is = false;
    public static void main(String[] args) {
        map = new HashMap<>();
        map.put("client", "android");
        map.put("version", MyConstants.appVersion);
        StringBuilder sb = new StringBuilder();
//        sb.append(C8742oo0oOo00.OooO0O0(C8625oo0OO00.OooO00o().OooO00o)); // todo
        sb.append(MyConstants.appVersionCode);
        String str = "";
        sb.append(str);
//        map.put("versionNumber", sb.toString());
//        map.put("mobileTerminal", C8630oo0OO0OO.OooO00o().OooO0o);
        map.put("encrypt", "1");
        if (C9054ooOoOo0.OooO0Oo(C8630oo0OO0OO.OooO00o().OooO0oO)) {
            map.put("platformId", C8630oo0OO0OO.OooO00o().OooO0oO);
        }
//        map.putAll(C8625oo0OO00.OooO00o().m20250OooO00o());
        String OooO0OO = C8630oo0OO0OO.OooO00o().OooO0OO();
        if (C9054ooOoOo0.OooO0Oo(OooO0OO) && map.containsKey(OooO0OO)) {
            str = map.get(OooO0OO);
        }
        map.put("mobileTerminal","internal");
//        map.put("encrypt","1");
//        map.put("client","android");
        map.put("appkey","gl_android_4da324c");
        map.put("_s_q__","bbb");
//        map.put("version","2.2.0");
        map.put("versionNumber","14");
        map.put("timestamp","1625585093928");

        String strs = "0123456789abcdefghijklmnopqrstuvwxyz";
        List<String> result = new ArrayList<String>();
        StringBuilder sbs = new StringBuilder();
        char[] strss = strs.toCharArray();
        for(int i = 1; i<= strss.length; i++){
            getCombinations(strs.toCharArray(), 0, i, result, sbs);
            if(is){
                break;
            }
        }
    }
    public static void getCombinations(char[] strs, int begin, int len, List<String> result, StringBuilder sb){

        if(len == 0){
            result.add(sb.toString());
            return;
        }
        if(begin >= strs.length) {
            return;
        }
//        System.out.println("isSignCode1=" + sb);
        sb.append(strs[begin]); //选择第一个字符
        getCombinations(strs, begin + 1, len - 1, result, sb);  //从剩下的n-1个字符中选择len-1个字符
//        System.out.println("isSignCode2=" + sb);
        sb.deleteCharAt(sb.length() - 1); // 取消选择第一个字符
        getCombinations(strs, begin + 1, len, result, sb); //从剩下的n-1个字符中选择len个字符。
//        System.out.println("isSignCode3=" + sb);
        for (int i = 0; i < result.size(); i++) {
            System.out.println("isSignCode=" + result.get(i));
            is  = isSignCode("isSignCodemd5=",result.get(i),map);
            if(is){
                System.out.println("isSignCode成功=" + result.get(i));
                break;
            }
        }
    }

    public static boolean isSignCode(String str, String str2, Map<String, String> map) {
//        List<Map.Entry<String, String>> arrayList = new ArrayList<>(map.entrySet());
//        Collections.sort(map, new OooO00o());
        map = MyUtils.sortMap(map);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
//        }
//        for (Map.Entry entry : arrayList) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            sb.append(str3);
            sb.append(str4);
            if (i != 0) {
                sb2.append("&");
            }
            sb2.append(str3);
            sb2.append(C8932ooOOO0o.OooO0Oo);
            try {
                sb2.append(URLEncoder.encode(str4, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            i++;
        }
        sb.append(str2);
        sb.insert(0, str2);
        String signcode = OooO00o(str, sb2.toString(), sb.toString().toUpperCase());
        System.out.println("signcode" + signcode);
        if("faa0f69f8aa0fbf0ce6c826260400000".equals(signcode)){
            return true;
        }
        return false;
//        map.put("signcode", signcode);
//        return map;
    }
    public static String OooO00o(String str, String str2, String str3) {
        System.out.println("str = " + str + "\nstr2 = " + str2 + "\nstr3 = " + str3);
        if (!C9048ooOoOOOo.OooO00o().m20707OooO0O0().equals(str)) {
            return OooO00o(str3);
        }
        try {
            String OooO00o2 = C9052ooOoOOoo.OooO00o(str3, "utf-8");
            if (C9048ooOoOOOo.OooO00o().m20705OooO00o() != null) {
                return C9048ooOoOOOo.OooO00o().m20705OooO00o().OooO00o(str2, OooO00o2);
            }
            if (-1 == C9048ooOoOOOo.OooO00o().OooO0Oo()) {
                return OooO00o2;
            }
            int OooO0Oo = C9048ooOoOOOo.OooO00o().OooO0Oo();
            return OooO00o2.substring(OooO0Oo, C9048ooOoOOOo.OooO00o().OooO0o0() + OooO0Oo);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String OooO00o(String str) {
        if (C9054ooOoOo0.OooO0OO(str)) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() < 2) {
                    stringBuffer.append(0);
                }
                stringBuffer.append(hexString);
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }
}
