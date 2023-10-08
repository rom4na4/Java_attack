public class Lesson4_2 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Task 1");
        int expenseDuringMonth = 0;
        int[] expense = generateRandomArray();
        for (int i = 0; i < 30; i++){
            expenseDuringMonth += expense[i];
        }
        System.out.println("Сумма трат за месяц составила " + expenseDuringMonth + " рублей");
        System.out.print("\n");
    }

    public static void task2() {
        System.out.println("Task 2");
        int maxExpense = 0, minExpense = 10000000;
        int[] expense = generateRandomArray();
        for (int i = 0; i < 30; i++){
            if (expense[i] > maxExpense){
                maxExpense = expense[i];
            } else if(expense[i] < minExpense){
                minExpense = expense[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpense + " рублей. Максимальная сумма трат за день составила " + maxExpense + " рублей");
        System.out.print("\n");
    }

    public static void task3() {
        System.out.println("Task 3");
        int expenseDuringMonth = 0;
        double averageExpense = 0;
        int[] expense = generateRandomArray();
        for (int i = 0; i < 30; i++){
            expenseDuringMonth += expense[i];
        }
        averageExpense = (double) expenseDuringMonth / 30;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpense + " рублей");
        System.out.print("\n");
    }

    public static void task4() {
        System.out.println("Task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.print("\n");
    }
}
