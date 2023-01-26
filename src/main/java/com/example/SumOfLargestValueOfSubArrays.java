package com.example;

import java.util.Collections;
import java.util.List;

public class SumOfLargestValueOfSubArrays {
    public static void main(String[] args) {

    }

    public static Integer[] sumOfSubArrays (List<Integer> arrList) {
        Collections.sort(arrList);
        Integer[] arr = new Integer[arrList.size()];
        int j = 0;
        while (arrList.size() > 0) {
            int temp = 0;
            for (int i = 0; i < arrList.size(); i++) {
                temp += arrList.get(i);
            }
            arr[j] = temp;
            j++;
            arrList.remove(arrList.get(0));
        }
        return arr;
    }
}

//1,2,3,-5,0,1,2
//subarray with the largest sum