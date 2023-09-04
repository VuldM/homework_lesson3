package ru.geekbrains.lesson3.task2;

/**
 * Фрилансер (работник с почасовой оплатой)
 * TODO: Доработать в рамках домашнего задания
 */
public class Freelancer extends Employee {
    public Freelancer(String surName, String name, double salary) {
        super(surName, name, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Среднемесячная заработная плата (почасовая): %.2f",
                surName, name, calculateSalary());
    }
}
