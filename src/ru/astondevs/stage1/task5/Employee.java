package ru.astondevs.stage1.task5;

import java.util.Comparator;

// Кастомный компаратор + сортировка
//
public class Employee {

    private int id;
    private String name;

    public Employee(String name) {
        this.id = (int)(Math.random() * 100);
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}
