package com.chessboard.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utils {
    private static Map<String, Integer> rowPositions = new HashMap<>();
    static {
        rowPositions.put("A",1);
        rowPositions.put("B",2);
        rowPositions.put("C",3);
        rowPositions.put("D",4);
        rowPositions.put("E",5);
        rowPositions.put("F",6);
        rowPositions.put("G",7);
        rowPositions.put("H",8);
    }

    public static Integer getRowNumber(String position) {
        return rowPositions.get(position);
    }

    public static String getRowLetter(int position) {
        for(Map.Entry<String, Integer> entry: rowPositions.entrySet()) {
            if(entry.getValue() == position) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static List<Integer> getRowNumbers() {
        List<Integer> rowNumbers = new ArrayList<>();
        for(Map.Entry<String, Integer> entry: rowPositions.entrySet()) {
            rowNumbers.add(entry.getValue());
        }
        return rowNumbers;
    }
}
