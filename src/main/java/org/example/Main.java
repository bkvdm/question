package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("ZЛуганск", "ZСевастополь", "ZДонецк"));
        List<String> namesOne = new ArrayList<>();
        for (String name : names) {
            namesOne.add(name.substring(1));
        }
        Collections.sort(namesOne);

        System.out.println(namesOne);

        List<String> namesTwo = new ArrayList<>();
        names.forEach(name -> namesTwo.add(name.substring(1)));
        Collections.sort(namesTwo);

        System.out.println(namesTwo);

        List<String> namesThree = names.stream()
                .map(name -> name.substring(1))
                .sorted()
                .collect(Collectors.toList());

        System.out.println(namesThree);
    }
}