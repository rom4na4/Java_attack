public class Lesson4_1 {
    public static void main(String[] args) {
//        1 Task

        int [] numbers = new int []{1,2,3};
        double [] numbers2 = {1.57, 7.654, 9.986};
        int [] numbers3 = {532, 634, 123, 653};

//        2 Task

        System.out.println("2 Task");
        for (int i = 0; i < numbers.length; i++){
            if (i != numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.println(numbers[i]);
            }
        }

        for (int i = 0; i < numbers2.length; i++){
            if (i != numbers2.length - 1) {
                System.out.print(numbers2[i] + ", ");
            } else {
                System.out.println(numbers2[i]);
            }
        }

        for (int i = 0; i < numbers3.length; i++){
            if (i != numbers3.length - 1) {
                System.out.print(numbers3[i] + ", ");
            } else {
                System.out.println(numbers3[i]);
            }
        }
        System.out.println("\n");

//        3 Task

        System.out.println("3 Task");
        for (int i = numbers.length - 1; i >= 0; i--){
            if (i != 0) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.println(numbers[i]);
            }
        }

        for (int i = numbers2.length - 1; i >= 0; i--){
            if (i != 0) {
                System.out.print(numbers2[i] + ", ");
            } else {
                System.out.println(numbers2[i]);
            }
        }

        for (int i = numbers3.length - 1; i >= 0; i--){
            if (i != 0) {
                System.out.print(numbers3[i] + ", ");
            } else {
                System.out.println(numbers3[i]);
            }
        }
        System.out.println("\n");

//        4 Task

        System.out.println("4 Task");
        for (int i = 0; i < numbers.length; i++){
            if (i != numbers.length - 1) {
                if (numbers[i] % 2 == 0){
                    System.out.print(numbers[i] + ", ");
                } else {
                    System.out.print((numbers[i] + 1) + ", ");
                }
            } else {
                if (numbers[i] % 2 == 0){
                    System.out.println(numbers[i]);
                } else {
                    System.out.println((numbers[i] + 1));
                }
            }
        }

    }
}
