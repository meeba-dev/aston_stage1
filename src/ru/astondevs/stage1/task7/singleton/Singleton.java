package ru.astondevs.stage1.task7.singleton;

public class Singleton {

    private final String data;
    private static Singleton instance;
    private Singleton(String data) {
        this.data = data;
    };
    public static Singleton getInstance(String data) {
        if (instance == null) {
            instance = new Singleton(data);
        }
        return instance;
    }

    @Override
    public String toString() {
        return data;
    }
}


