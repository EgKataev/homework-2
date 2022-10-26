public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int a = 1_000;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = 2;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short c = 5555;
        System.out.println("Значение переменной c с типом short равно " + c);
        long d = 1847565443L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = (float) 1.54;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 1.01;
        System.out.println("Значение переменной f с типом double равно " + f);


        //Задание 2
        System.out.println("Задание 2");
        float variable1 = 27.12f;
        long variable2 = 987_678_965_549L;
        double variable3 = 2.786;
        boolean variable4 = false;
        short variable5 = 569;
        int variable6 = -159;
        char variable7 = 27897;
        byte variable8 = 67;


        //Задание 3
        System.out.println("Задание 3");
        int pupilsInFirstClass = 23;
        int pupilsInSecondClass = 27;
        int pupilsInThirdClass = 30;
        double paperCount = 480;
        double pepersPerPupil = paperCount / (pupilsInFirstClass + pupilsInSecondClass + pupilsInThirdClass);
        System.out.println("На каждого ученика рассчитано " + pepersPerPupil + " листов бумаги");


        //Задание 4
        System.out.println("Задание 4");
        double bottles = 16;
        double minutes = 2;
        double productivityPerMinute = bottles / minutes;
        double twentyMinutes = 20;
        System.out.println("За " + twentyMinutes + " минут машина произвела бутылок " + twentyMinutes * productivityPerMinute + " штук");
        double minutesInDay = 24 * 6;
        System.out.println("За " + minutesInDay + " сутки машина произвела бутылок " + minutesInDay * productivityPerMinute + " штук");
        double minutesInThreeDay = 3 * minutesInDay;
        System.out.println("За " + minutesInThreeDay + " сутки машина произвела бутылок " + minutesInThreeDay * productivityPerMinute + " штук");
    }
}