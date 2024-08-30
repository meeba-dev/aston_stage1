package ru.astondevs.stage1.task2;


import ru.astondevs.stage1.task2.inner.Cat;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // 1. Assign name by constructor
        Animal animal = new Animal("AnimalName");
        System.out.println(animal.getName());
        Cat cat = new Cat();
        // 2. Assign name by set method / setter
        cat.setName("NameBeforeReflection");
        System.out.println(cat.getName());
        cat.method();
        // 3. Assign private field value by reflection API
        Field field = Cat.class.getDeclaredField("name");
        field.setAccessible(true);
        field.set(cat, "NameAfterReflection");
        System.out.println(cat);
    }
}
