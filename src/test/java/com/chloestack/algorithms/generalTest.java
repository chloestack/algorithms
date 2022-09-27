package com.chloestack.algorithms;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class generalTest {

    @Test
    void generalTest() {

        List<Long> result = longStreamL();
        System.out.println(result.toString());

        String test = "312-12-14212";
        String test1 = "3121214212";
        String testList = "3121214 212, 3121214992, 3121214212 ";
        System.out.println(converted(test));
        System.out.println(converted(test1));

        Stream<String> streamList = Stream.of(testList.split(","));
        System.out.println(
                streamList.map(el -> converted(el))
                        .collect(Collectors.toList()));

    }

    private String converted(String str) {
        return str.trim().replaceAll("^([0-9]{3})-?([0-9]{2})-?([0-9]{5})$", "$1-$2-$3");
    }

    private List<Long> longStreamL() {
        List<Long> testL = new ArrayList<>();
        testL.add(123L);
        testL.add(312L);
        testL.add(0L);
        testL.add(102L);
        testL.add(-321L);
        return testL.stream().map(l -> l < 0L ? 0 : l)
                .collect(Collectors.toList());
    }

}
