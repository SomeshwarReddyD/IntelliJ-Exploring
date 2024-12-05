package com.infy.test.java10;

import java.util.Arrays;
import java.util.List;

public class ToArrayMethod {
    public static void main(String[] args) {
        List<Integer> integers = List.of(3, 5, 4, 6, 2, 9);
        Integer[] array = integers.toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
