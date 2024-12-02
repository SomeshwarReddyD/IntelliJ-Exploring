package com.infy.test.java9;

import java.util.List;

public class FactoryMethodOf {

    public static void main(String[] args) {
        OfMethodTest();
    }

    public static void OfMethodTest() {
//        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8);
//        integers.forEach(el->System.out::println);

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8);
        integers.forEach(System.out::println);

        List<String> strings = List.of("a", "bv", "csd", "skdf");
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

    }
}
