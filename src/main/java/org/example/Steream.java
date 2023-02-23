package org.example;

import java.util.List;
public class Stream {

    public static void main(String[] args) {
        List<String> names = List.of("yamada", "tanaka", "yasuda", "suzuki", "iida");
        List<String> sortedResult = names.stream().sorted().toList();

        long count = names.stream().filter(v -> v.startsWith("y")).count();

        boolean hasYamada = names.stream().anyMatch(name -> name.equals("yamada"));
        //List<String> result = names.stream().filter(v -> v.contains("a")).toList();

        System.out.println(sortedResult);
        System.out.println(count);
        System.out.println(hasYamada);

    }

}
