package ru.astondevs.stage1.task2.inner;

import ru.astondevs.stage1.task2.Animal;

public class Cat extends Animal {
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat with name " + name;
    }
}
