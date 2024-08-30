package ru.astondevs.stage1.task1;

public class SecondClass extends FirstClass {
    public SecondClass() {
        FirstClass.counter++;
        System.out.println(FirstClass.counter + ". Исполняется конструктор SecondClass");
    }

    {
        FirstClass.counter++;
        System.out.println(FirstClass.counter + ". Исполняется блок инициализации SecondClass");
    }

    static {
        FirstClass.counter++;
        System.out.println(FirstClass.counter + ". Исполняется статический блок инициализации SecondClass");
    }
}
