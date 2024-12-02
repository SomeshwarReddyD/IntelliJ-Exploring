package com.infy.test.optionalDemo;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalTest {
    public static void main(String[] args) {
//        Optional<String> first = Stream.of("Ang", "React", "Java").filter(el->el.startsWith("j")).findFirst();
//        System.out.println(first.get());

        Optional<String> name = optionalTest("SRaju");
        System.out.println(name.orElseThrow(() -> new NullPointerException("No Value present.")));

    }

    public static Optional<String> optionalTest(String name) {

        if (name.startsWith("S")) {
            return Optional.ofNullable(name);
        } else {
            return Optional.empty();
        }
    }
}
