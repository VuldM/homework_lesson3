package ru.geekbrains.lesson3.task2;

/**
 * Сотрудник
 */
public class Employee implements Comparable<Employee> {


    /**
     * Фамилия
     */
    protected String surName;

    /**
     * Имя
     */
    protected String name;

    /**
     * Ставка заработной платы
     */
    protected double salary;
    protected  int ageEmployee;

    public double calculateSalary(){
        return salary;
    };
public int calculateAge(){
    return ageEmployee;
}

    public Employee(String surName, String name, double salary, int ageEmployee) {
        this.surName = surName;
        this.name = name;
        this.salary = salary;
        this.ageEmployee = ageEmployee;
    }

    @Override
    public String toString() {
        return String.format("%s %s", surName, name);
    }

    @Override
    public int compareTo(Employee o) {
        int res = surName.compareTo(o.surName);
        if (res == 0){
            return name.compareTo(o.name);
        }
        return res;
    }
}
