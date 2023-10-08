public class Lesson3_1 {
    public static void main(String[] args) {

//        1 Task

        System.out.println("1 Task");
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println("\n");

//        2 Task

        System.out.println("2 Task");
        for(int i = 10; i >= 1; i--){
            System.out.println(i);
        }
        System.out.println("\n");

//        3 Task

        System.out.println("3 Task");
        for (int i = 0; i <= 17; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
        System.out.println("\n");

//        4 Task

        System.out.println("4 Task");
        for (int i = 10; i >= -10; i--){
            System.out.println(i);
        }
        System.out.println("\n");

//        5 Task

        System.out.println("5 Task");
        for (int i = 1904; i <= 2096; i++){
            if (i % 4 == 0){
                System.out.println(i + "год является високосным");
            }
        }
        System.out.println("\n");

//        6 Task

        System.out.println("6 Task");
        for (int i = 7; i <= 98; i++){
            if (i % 7 == 0){
                System.out.println(i);
            }
        }
        System.out.println("\n");

//        7 Task

        System.out.println("7 Task");
        for (int i = 1; i <= 512; ){
            System.out.println(i);
            i = i * 2;
        }
        System.out.println("\n");

//        8 Task

        System.out.println("8 Task");
        for (int i = 1, inc = 29000, aos = 29000; i <= 12; i++){
            System.out.println("Месяц " + i + ", сумма накоплений равна " + aos + "рублей");
            aos += inc;
        }
        System.out.println("\n");

//        9 Task

        System.out.println("9 Task");
        for (int i = 1, inc = 29000, aos = 29000; i <= 12; i++){
            System.out.println("Месяц " + i + ", сумма накоплений равна " + aos + "рублей");
            aos *= 1.01;
            aos += inc;
        }
        System.out.println("\n");

//        10 Task

        System.out.println("10 Task");
        for (int i = 1; i <= 10; i++){
            System.out.println("2 * " + i + " = " + (2 * i));
        }
        System.out.println("\n");

    }
}
