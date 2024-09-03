package ru.astondevs.stage1.task4;

// Utility class / Утилитарный класс
// Неизменяемый и ненаследуемый класс final
// Отсутствие возможности создания экземпляра (конструктор private)
// Все методы static и доступны в любой точке программы
public final class UtilityClass {

    private UtilityClass() {};

    public static int squareOfNum(int num) {
        return num * num;
    }

    public static int cubeOfNum(int num) {
        return num * num * num;
    }

}
