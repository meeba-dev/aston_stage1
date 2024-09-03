package ru.astondevs.stage1.task3;

import java.util.HashMap;
import java.util.Map;

// Immutable class / Неизменяемый класс
// 1. Запрет наследования (класс final)
// 2. Инициализация полей только при создании объекта, с помощью параметризованного конструктора
// 3. Отсутствие прямого доступа к состоянию (все поля private)
//      3a) Все поля private
//      3b) Отсутствие конструктора по умолчанию и set методов
// 4. При работе с ссылочными типами возвращается / передается копия объекта (deep copy)
public final class CarOwner {

    private final String fullName;
    private final int age;
    private final Map<String, String> cars;

    public CarOwner(String fullName, int age, Map<String, String> cars) {
        this.fullName = fullName;
        this.age = age;

        Map<String, String> tmpCars = new HashMap<>();

        for (Map.Entry<String, String> entry : cars.entrySet()) {
            tmpCars.put(entry.getKey(), entry.getValue());
        }
        this.cars = tmpCars;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public Map<String, String> getCars() {
        Map<String, String> copyCars = new HashMap<>();

        for (Map.Entry<String, String> entry : cars.entrySet()) {
            copyCars.put(entry.getKey(), entry.getValue());
        }
        return copyCars;
    }
}
