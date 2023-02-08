public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        if (age <18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2() {
        int temperature = 6;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
    }
    public static void task3() {
        int speed = 55;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить за штраф");
        }
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }
    public static void task4() {
        int age = 19;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        else if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ",то его место в университете");
        }
        else if (age > 24) {
            System.out.println("Если возраст человека равен "  + age + ", то ему нужно ходить на работу");
        }
    }
    public static void task5() {
        int age = 6;
        boolean hasAdult = true;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нелья кататься на атракционе");
        }
        else if (age >= 5 && age < 14 && hasAdult) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься только в сопровождении взрослого");
        }
        else if (age >= 5 && age < 14 && !hasAdult) {
            System.out.println("Если возраст ребенка равен " + age + ", то кататься нельзя, взрослого нет");
        }
        else if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься без сопровождения взрослого");
        }
    }
    public static void task6() {
        int oneWagon = 102;
        int seatPlace = 60;
        int standingPlace = oneWagon - seatPlace;
        System.out.println("В вагоне " + standingPlace + " стоячих мест");
        if (seatPlace > 60 && standingPlace > 42) {
            System.out.println("Нет сидячих мест в вагоне");
        }
        else if (seatPlace <= 60 || standingPlace <= 42) {
            System.out.println("Есть место в вагоне");
        }
        else if (seatPlace <= 60 && standingPlace > 42) {
            System.out.println("Есть только сидячие места");
        }
        else if (seatPlace > 60 && standingPlace <= 42) {
            System.out.println("Есть только стоячие места");
        }
    }
    public static void task7() {
        int one = 1;
        int two = 2;
        int three = 3;
        if (one < two && one < three) {
            System.out.println("самое малое число 1");
        }
        else if (two > one && two < three) {
            System.out.println("среднее число 2");
        }
        else if (three > one && three > two) {
            System.out.println("большое число 3");
        }

    }
}