package ru.astondevs.stage1.task2;

public class Animal {
    private String name;
    public Animal() {}
    public Animal(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    protected void method() {
        System.out.println("protected method from superclass");
    }
}
