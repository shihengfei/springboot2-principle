package com.afei.auto.util;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        for (Integer integer : integers) {
            if (integer< 3){
                System.out.println(integer);
                return;
            }
            System.out.println("----"+integer);
        }
    }
}
