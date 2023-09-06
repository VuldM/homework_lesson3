package ru.geekbrains.lesson3.task2;

/**
 * Фрилансер (работник с почасовой оплатой)
 * TODO: Доработать в рамках домашнего задания
 */
public class Freelancer extends Employee {
    public Freelancer(String surName, String name, double salary, int ageEmployee ) {
        super(surName, name, salary, ageEmployee);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; возраст %d Среднемесячная заработная плата (почасовая): %.2f",
                surName, name, ageEmployee, calculateSalary());
    }
}
