package ru.astondevs.stage1.task6;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        ArrayList<CustomClass> arrayList = new ArrayList<>();
        arrayList.add(new CustomClass("str6", Arrays.asList(1,2,3)));
        arrayList.add(new CustomClass("str8", Arrays.asList(8,4,90)));
        arrayList.add(new CustomClass("str1", Arrays.asList(17,222,6)));
        arrayList.add(new CustomClass("str7", Arrays.asList(1080,4060,7,2,98)));
        arrayList.add(new CustomClass("str3", Arrays.asList(907,24,379,8888)));
        arrayList.stream().sorted(Comparator.comparing(CustomClass::getStr).reversed()).map(CustomClass::getList).map(e -> "Element: " + e.toString()).collect(Collectors.toSet()).forEach(System.out::println);

    }

}
