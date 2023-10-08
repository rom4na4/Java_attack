public class Lesson2_1 {
    public static void main(String[] args) {

//        1 Task

        System.out.println("1 Task");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний, нужно немного подождать.");
        } else {
            System.out.println("Если возраст человека равен " + age + " , он не достиг совершеннолетия, нужно немного подождать.");
        }

//        2 Task

        System.out.println("2 Task");
        int temperature = 8;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        } else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        }

//        3 Task

        System.out.println("3 Task");
        int speed = 81;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }

//        4 Task

        System.out.println("4 Task");
        age = 27;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if(age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if(age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if(age > 24){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }

//        5 Task

        System.out.println("5 Task");
        age = 12;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if(age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении");
        } else if(age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

//        6 Task

        System.out.println("6 Task");
        int vanCapacity = 102;
        int vanCapacitySit = 60;
        int vanCapacityStay = 42;
        if (vanCapacity > 0){
            if(vanCapacitySit > 0){
                System.out.println("В вагоне имеются сидячие места.");
            }
            if(vanCapacityStay > 0){
                System.out.println("В вагоне имеются стоячие места.");
            }
        } else {
            System.out.println("Вагон полностью забит.");
        }

//        7 Task

        System.out.println("7 Task");
        int one = 6;
        int two = 3;
        int three = 9;
        if (one > two && one > three){
            System.out.println("Первая цифра больше остальных.");
        } else if (two > one && two > three){
            System.out.println("Вторая цифра больше остальных.");
        } else if (three > one && three > two){
            System.out.println("Третья цифра больше остальных.");
        }
    }
}
