package ru.geekbrains.lesson3.task2;

import java.util.Comparator;

public class ageComparator implements Comparator<Employee> {
        @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.calculateAge(), o2.calculateAge());
    }
}
