package ru.geekbrains.lesson3.task2;

import java.util.Arrays;
import java.util.Random;

public class Program {

    private static final Random random = new Random();


    /**
     * TODO: Переработать метод generateEmployee, метод должен генерировать
     *   случайного сотрудника типа Worker или Freelancer, метод должен быть один.
     *   Метод generateWorker должен генериврвать либо фрилансера либо воркера, добавить новое
     *   состояние, например возраст, отсортировать компаратором
     *
     * @return
     */
    public static Employee generateEmployee() {
        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surnames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};
        int salaryIndex = random.nextInt(500, 900);
        int typeEmployee = random.nextInt(0, 2);
        int ageEmployee = random.nextInt(18, 65);

        if (typeEmployee == 0) {
            return new Freelancer(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salaryIndex * 5 * 20, ageEmployee);
        } else {
            return new Worker(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salaryIndex * 100, ageEmployee);
        }
    }

    public static Employee[] generateEmployees(int counter) {
        Employee[] workers = new Employee[counter];
        for (int i = 0; i < workers.length; i++) {
            workers[i] = generateEmployee();
        }
        return workers;
    }


    public static void main(String[] args) {

        Employee[] employees = generateEmployees(6);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees, new ageComparator());

        System.out.println();

        for (Employee employee : employees) {
            System.out.println(employee);

        }
    }
}
