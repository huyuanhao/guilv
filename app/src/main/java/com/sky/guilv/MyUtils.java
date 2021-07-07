package com.sky.guilv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyUtils {

    private static class MapForKeyComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    }

    public static Map<String, String> sortMap(Map<String, String> map) {
        if (map == null || map.isEmpty()) return new HashMap<>();
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list, new MapForKeyComparator());
        Map<String, String> newMap = new HashMap<>();
        for (String key : list) {
            newMap.put(key, map.get(key));
        }
        return newMap;
    }

}
