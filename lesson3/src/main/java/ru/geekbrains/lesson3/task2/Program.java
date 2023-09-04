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
        Employee employee = new Employee(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salaryIndex * 5 * 20);
        return  employee;
    }



    public static Worker[] generateWorker(int counter){

        Worker[] workers = new Worker[counter];
        for (int i = 0; i < workers.length; i++){
            workers[i] = (Worker) generateEmployee();// Сдесь у меня все ломается, а что делать я не знаю.
        }
        return workers;
    }
    public static Freelancer[] generateFreelancer(int counter){

        Freelancer[] freelancers = new Freelancer[counter];
        for (int i = 0; i < freelancers.length; i++){
            freelancers[i] = (Freelancer) generateEmployee();// Сдесь у меня все ломается, а что делать я не знаю.
        }
        return freelancers;
    }
    public static void main(String[] args) {


        int typeEmployee = random.nextInt(2);
        switch (typeEmployee) {
            case 0:
                Employee[] workers = generateWorker(6);
                for (Employee worker: workers) {
                    System.out.println(worker);
                }

                Arrays.sort(workers);

                System.out.println();

                for (Employee worker: workers) {
                    System.out.println(worker);
                }
                break;
            case 1:
                Employee[] freelancers = generateFreelancer(6);
                for (Employee worker: freelancers) {
                    System.out.println(worker);
                }

                Arrays.sort(freelancers);

                System.out.println();

                for (Employee freelancer: freelancers) {
                    System.out.println(freelancer);
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + typeEmployee);
        }


    }
}
