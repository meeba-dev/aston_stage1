package ru.astondevs.stage1.task1;

public class FirstClass {

    static int counter = 0;
    public FirstClass() {
        counter++;
        System.out.println(counter + ". Исполняется конструктор FirstClass");
    }

    {
        counter++;
        System.out.println(counter + ". Исполняется блок инициализации FirstClass");
    }

    static {
        counter++;
        System.out.println(counter + ". Исполняется статический блок инициализации FirstClass");
    }
}