public class Lesson1_1 {
    public static void main(String[] args) {

        // Задание 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper + "\n");

        // Задание 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper + "\n");

        // Задание 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper + "\n");

        // Задание 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend + "\n");

        // Задание 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog + "\n");

        // Задание 6
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        System.out.println(firstBoxer + secondBoxer);
        System.out.println(secondBoxer - firstBoxer + "\n");

        // Задание 7
        System.out.println(secondBoxer - firstBoxer);
        System.out.println(secondBoxer % firstBoxer + "\n");

        // Задание 8.1
        var hours = 640;
        var workers = hours / 8;
        System.out.println("Всего работников в компании - " + workers + " человек." + "\n");

        // Задание 8.2
        workers = 94;
        hours = workers * 8;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + hours + " часов работы может быть поделено между сотрудниками");
    }
}