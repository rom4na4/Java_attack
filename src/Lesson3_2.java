public class Lesson3_2 {
    public static void main(String[] args) {
//        1 Task

        System.out.println("1 Task");
        int inc = 15000, aos = 0, i = 1;
        while (aos < 2459000){
            aos *= 1.01;
            aos += inc;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + aos + "рублей");
            i += 1;
        }
        System.out.println("\n");

//        2 Task

        System.out.println("2 Task");
        i = 1;
        while(i <= 10){
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n");
        for (i = 10; i >= 1; i--){
            System.out.print(i + " ");
        }
        System.out.println("\n");

//        3 Task

        System.out.println("3 Task");
        int populationSize = 12000000;
        double birthRate = (double) 17 /1000;
        double deathRate = (double) 8 /1000;
        for (i = 1; i <= 10; i++){
            System.out.println("Год " + i + ", численность населения составляет " + populationSize);
            populationSize = (int) (populationSize + (populationSize * birthRate) - (populationSize * deathRate));
        }
        System.out.println("\n");

//        4 Task

        System.out.println("4 Task");
        aos = 15000;
        for (i = 1; aos < 12000000; i++){
            System.out.println("Месяц " + i + ", сумма накоплений равна " + aos + "рублей");
            aos *= 1.07;
        }
        System.out.println("Месяц " + i + ", сумма накоплений равна " + aos + "рублей");
        System.out.println("Месяцев прошло: " + i);
        System.out.println("\n");

//        5 Task

        System.out.println("5 Task");
        aos = 15000;
        for (i = 1; aos < 12000000; i++){
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + aos + "рублей");
            }
            aos *= 1.07;
        }
        System.out.println("Месяц " + i + ", сумма накоплений равна " + aos + "рублей");
        System.out.println("Месяцев прошло: " + i);
        System.out.println("\n");

//        6 Task

        System.out.println("6 Task");
        aos = 15000;
        for (i = 1; i <= 108; i++){
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + aos + "рублей");
            }
            aos *= 1.07;
        }
        System.out.println("\n");

//        7 Task

        System.out.println("7 Task");
        int numberOfFriday = 3;
        for (i = 1; i <= 31; i++){
            if (i % 7 == numberOfFriday){
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
            }
        }
        System.out.println("\n");

//        8 Task

        System.out.println("8 Task");
        int year = 2023;
        int lastYear = year - 200;
        int futureYear = year + 100;
        for (i = 0; i < futureYear; i++){
            if( i % 79 == 0 && lastYear < i){
                System.out.println(i);
            }
        }
        System.out.println("\n");

    }
}
