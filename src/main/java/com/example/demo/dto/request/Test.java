package com.example.demo.dto.request;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
//        Stream.iterate(1, count -> count + 1) //
//                .filter(number -> number % 3 == 0) //
//                .limit(7) //
//                .forEach(System.out::println);


//        String[] languages = { "Java", "C#", "C++", "PHP", "Javascript" };
//        Stream<String> testStream1 = Arrays.stream(languages);
//        testStream1.forEach(x -> System.out.println(x));

        ArrayList<Long> numberList = new ArrayList<>();
        numberList.add(1L);
        numberList.add(2L);
        numberList.add(3L);
        numberList.add(4L);
        numberList.add(5L);

       Stream<Long> listchange= numberList.stream().map(x->x+1);
        System.out.println("thay doi");
        listchange.forEach(x-> System.out.println(x));
    }
}
