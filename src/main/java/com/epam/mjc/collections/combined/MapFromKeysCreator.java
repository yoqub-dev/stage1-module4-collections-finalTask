package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> resultMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            int keyLength = entry.getKey().length();
            String key = entry.getKey();

            if (!resultMap.containsKey(keyLength)) {
                resultMap.put(keyLength, new TreeSet<>(Collections.reverseOrder()));
            }

            resultMap.get(keyLength).add(key);
        }

        return resultMap;
    }
}
