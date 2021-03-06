package com.p118pd.sdk;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import java.util.Calendar;
import java.util.HashMap;

/* renamed from: com.pd.sdk.ooOoOo0  reason: case insensitive filesystem */
public class C9054ooOoOo0 {
    public static boolean OooO00o(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }

    public static boolean OooO0O0(String str) {
        if (str.length() == 18) {
            String substring = str.substring(6, 14);
            Integer valueOf = Integer.valueOf(Integer.parseInt(substring.substring(0, 4)));
            Integer valueOf2 = Integer.valueOf(Integer.parseInt(substring.substring(4, 6), 10));
            Integer valueOf3 = Integer.valueOf(Integer.parseInt(substring.substring(6, 8)));
            Calendar instance = Calendar.getInstance();
            int i = instance.get(1);
            int i2 = instance.get(2) + 1;
            int i3 = instance.get(5);
            if (i - valueOf.intValue() > 18) {
                return true;
            }
            if (i - valueOf.intValue() == 18) {
                if (i2 - valueOf2.intValue() > 0) {
                    return true;
                }
                if (i2 - valueOf2.intValue() != 0 || i3 - valueOf3.intValue() < 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static boolean OooO0OO(String str) {
        return str == null || "".equals(str.trim());
    }

    public static boolean OooO0Oo(String str) {
        return str != null && !"".equals(str.trim());
    }

    public static String OooO00o(String str) {
        return str.replace("&lt;p&gt;", "").replace("&lt;/p&gt;", "\r\n").replace("<p>", "").replace("</p>", "\r\n");
    }

    public static SpannableStringBuilder OooO00o(String str, int i, int i2, int i3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2 + i, 33);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder OooO00o(String str, String str2, String str3, int i) {
        int length = str.length();
        int length2 = str2.length();
        return OooO00o(str + str2 + str3, length, length2, i);
    }

    public static String OooO00o(String str, Object... objArr) {
        int i = 0;
        for (Object obj : objArr) {
            str = str.replace("{" + i + "}", obj.toString());
            i++;
        }
        return str;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20717OooO00o(String str) {
        Integer num;
        if (str == "" || str.length() != 18) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(11, "??????");
        hashMap.put(12, "??????");
        hashMap.put(13, "??????");
        hashMap.put(14, "??????");
        hashMap.put(15, "?????????");
        hashMap.put(21, "??????");
        hashMap.put(22, "??????");
        hashMap.put(23, "?????????");
        hashMap.put(31, "??????");
        hashMap.put(32, "??????");
        hashMap.put(33, "??????");
        hashMap.put(34, "??????");
        hashMap.put(35, "??????");
        hashMap.put(36, "??????");
        hashMap.put(37, "??????");
        hashMap.put(41, "??????");
        hashMap.put(42, "??????");
        hashMap.put(43, "??????");
        hashMap.put(44, "??????");
        hashMap.put(45, "??????");
        hashMap.put(46, "??????");
        hashMap.put(50, "??????");
        hashMap.put(51, "??????");
        hashMap.put(52, "??????");
        hashMap.put(53, "??????");
        hashMap.put(54, "??????");
        hashMap.put(61, "??????");
        hashMap.put(62, "??????");
        hashMap.put(63, "??????");
        hashMap.put(64, "??????");
        hashMap.put(65, "??????");
        hashMap.put(71, "??????");
        hashMap.put(81, "??????");
        hashMap.put(82, "??????");
        hashMap.put(91, "??????");
        if (hashMap.get(Integer.valueOf(Integer.parseInt(str.substring(0, 2)))) == null) {
            return false;
        }
        Integer[] numArr = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2, 1};
        Integer num2 = 0;
        for (int i = 0; i < 17; i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
            num2 = Integer.valueOf(num2.intValue() + (Integer.valueOf(str.charAt(i) - '0').intValue() * numArr[i].intValue()));
        }
        if (str.charAt(17) == 'X' || str.charAt(17) == 'x') {
            num = Integer.valueOf(num2.intValue() + (numArr[17].intValue() * 10));
        } else if (str.charAt(17) < '0' || str.charAt(17) > '9') {
            return false;
        } else {
            num = Integer.valueOf(num2.intValue() + ((str.charAt(17) - '0') * numArr[17].intValue()));
        }
        if (num.intValue() % 11 == 1) {
            return true;
        }
        return false;
    }
}
