package ru.geekbrains.lesson3.task2;

public class Worker extends Employee {

    public Worker(String surName, String name, double salary, int ageEmployee) {
        super(surName, name, salary,ageEmployee );
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; возраст %d Среднемесячная заработная плата (фиксированная): %.2f",
                surName, name, ageEmployee, calculateSalary());
    }
}
