package ru.astondevs.stage1.task6;

import java.util.List;

public class CustomClass {

    private String str;
    private List<Integer> list;

    public String getStr() {
        return str;
    }

    public List<Integer> getList() {
        return list;
    }

    public CustomClass(String str, List<Integer> list) {
        this.str = str;
        this.list = list;
    }

    @Override
    public String toString() {
        return str + " " + list;
    }

}
