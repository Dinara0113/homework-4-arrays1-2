public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int[] salaries = {10000, 20000, 30000, 40000, 100000};

        int sumSalaries = 0;
        for (int i = 0; i < salaries.length; i++) {
            sumSalaries += salaries[i];
        }
        System.out.println("Сумма затрат за месяц составила " + sumSalaries + " рублей");

        System.out.println("Task 2");
        int[] salariesMonth = {10000, 20000, 30000, 40000, 50000};

        int minSalary = salariesMonth[0];
        int maxSalary = salariesMonth[0];

        for (int i : salariesMonth) {
            if (i > maxSalary) {
                maxSalary = i;
            }
            if (i < minSalary) {
                minSalary = i;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minSalary + " рублей."
                + " Максимальная сумма трат за неделю составила " + maxSalary + " рублей.");



        System.out.println("Task 3");
        int[] salaries2 = {10, 20, 30, 40, 50};

        int sumSalaries2 = 0;
        for (int salary : salaries2) {
            sumSalaries2 += salary;
        }
        int averageSalary = sumSalaries2 /salaries2.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSalary + " рублей.");


        System.out.println("Task 4");
        char [] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
            
        }

    }
}