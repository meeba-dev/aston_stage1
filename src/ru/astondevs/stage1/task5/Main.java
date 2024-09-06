package ru.astondevs.stage1.task5;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println((int)(Math.random() * 100));

        Employee emp1 = new Employee("John");
        Employee emp2 = new Employee("Linda");
        Employee emp3 = new Employee("Ivan");
        Employee emp4 = new Employee("Svetlana");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);

        System.out.println("Before sort: ");
        showList(employeeList);

        CustomComparator comparator = new CustomComparator();
        employeeList.sort(comparator);

        System.out.println("After sort: ");
        showList(employeeList);
    }

    public static void showList(List<Employee> list) {
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
}
