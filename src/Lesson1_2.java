public class Lesson1_2 {
    public static void main(String[] args) {

        // Задание 1
        int first = 100000;
        byte second = 100;
        short third = 10;
        long fourth = 999999;
        float fifth = 5.6F;
        double sixth = 5.6242354364;
        System.out.println("Значение переменной first с типом int равно " + first);
        System.out.println("Значение переменной second с типом byte равно " + second);
        System.out.println("Значение переменной third с типом short равно " + third);
        System.out.println("Значение переменной fourth с типом long равно " + fourth);
        System.out.println("Значение переменной fifth с типом float равно " + fifth);
        System.out.println("Значение переменной sixth с типом double равно " + sixth + "\n");

        // Задание 2
        float firstNumber = 27.12F;
        long secondNumber = 987678965549L;
        short thirdNumber = 2786;
        short fourthNumber = 569;
        short fifthNumber = -159;
        short sixthNumber = 27897;
        byte seventhNumber = 67;

        // Задание 3
        byte firstClass = 23;
        byte secondClass = 27;
        byte thirdClass = 30;
        short paper = 480;
        System.out.println("На каждого ученика рассчитано " + paper / (firstClass + secondClass + thirdClass) + " листов бумаги" + "\n");

        // Задание 4
        int efficiency = 16/2;
        int twentyMinutes = efficiency * 20;
        int mpd = 24 * 60;
        int day = efficiency * mpd;
        int threeDays = efficiency * mpd * 3;
        int oneMonth = efficiency * mpd * 30;
        System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + threeDays + " штук бутылок");
        System.out.println("За месяц машина произвела " + oneMonth + " штук бутылок" + "\n");

        // Задание 5
        int wpc = 2;
        int bpc = 4;
        int classes = 120 / (wpc + bpc);
        int whiteColor = classes * wpc;
        int browColor = classes * bpc;
        System.out.println("В школе, где " + classes + " классов, нужно " + whiteColor + " банок белой краски и " + browColor + " банок коричневой краски" + "\n");

        // Задание 6
        short bananas = 5 * 80;
        short milk = 2 * 105;
        short iceCream = 2 * 100;
        short eggs = 4 * 70;
        int sum = bananas + milk + iceCream + eggs;
        float sum_kg = (float) (bananas + milk + iceCream + eggs) / 1000;
        System.out.println("Вес спортзавтрака в грамма = " + sum);
        System.out.println("Вес спортзавтрака в кг = " + sum_kg + "\n");

        // Задание 7
        short weight = 7000;
        int minDays = weight / 500;
        System.out.println(minDays);
        int maxDays = weight / 250;
        System.out.println(maxDays);
        int avgDays = (minDays + maxDays) / 2;
        System.out.println(avgDays + "\n");

        // Задание 8
        double ipy = 1.1;
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        double raisingMasha = (masha * ipy) - masha;
        double raisingDenis = (denis * ipy) - denis;
        double raisingKristina = (kristina * ipy) - kristina;
        System.out.println("Маша теперь получает " + (masha + raisingMasha) + " рублей. Годовой доход вырос на " + raisingMasha + " рублей");
        System.out.println("Денис теперь получает " + (denis + raisingDenis) + " рублей. Годовой доход вырос на " + raisingDenis + " рублей");
        System.out.println("Кристина теперь получает " + (kristina + raisingKristina) + " рублей. Годовой доход вырос на " + raisingKristina + " рублей" + "\n");
    }
}