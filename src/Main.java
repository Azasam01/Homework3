public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }

    public static void task1 () {
        System.out.println("Задача 1");
        byte a = 50;
        System.out.println("Значение переменной а с типом byte равно " + a );
        short b = 1000;
        System.out.println("Значение переменной b с типом short равно " + b );
        int c = 100000;
        System.out.println("Значение переменной c с типом int равно " + c );
        long d = 10000000000000L;
        System.out.println("Значение переменной d с типом long равно " + d );
        float e = 1.2f;
        System.out.println("Значение переменной e с типом float равно " + e );
        double f = 1.2345;
        System.out.println("Значение переменной f с типом double равно " + f );

    }

    public static void task2 () {
        System.out.println("Задача 2");
        long d = 987678965549L;
        float y = 2.786f;
        short b = 569;
        short k = -159;
        short m = 27897;
        byte a = 67;

    }

    public static void task3 () {
        System.out.println("Задача 3");
        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        short paper = 480;
        byte students = (byte) (lp + as + ea);
        int studentsPaper = paper/students;
        System.out.println("There are " + studentsPaper + " sheets of paper for each student");

    }

    public static void task4 () {
        System.out.println("Задача 4");
        byte efficiency = 16;
        byte time2 = 2;
        byte efficiencyPer1 = 16/2;
        System.out.println(efficiencyPer1);
        byte time20 = 20;
        short efficiency20 = (short) (efficiencyPer1 * time20);
        System.out.println("За " + time20 +  " минут" + " машина произвела " + efficiency20 + " штук бутылок" );

        short time1440 = 1440;
        short efficiency1440 = (short) (efficiencyPer1 * time1440);
        System.out.println("За " + time1440 +  " минут" + " машина произвела " + efficiency1440 + " штук бутылок" );

        short time3 = (short) (time1440 * 3);
        System.out.println(time3);
        int efficiency3 = (int) (time3 * efficiencyPer1);
        System.out.println("За 3 дня" + " машина произвела " + efficiency3 + " штук бутылок");

        int time30 = time1440 * 30;
        System.out.println(time30);
        int efficiency30 = (int) (time30 * efficiencyPer1);
        System.out.println("За 1 месяц" + " машина произвела " + efficiency30 + " штук бутылок");

    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte jars = 120;
        byte whiteJars = 2;
        byte brownJars = 4;
        byte classroomJars = (byte) (whiteJars + brownJars);
        byte classrooms = (byte) (jars / classroomJars);
        byte whiteClass = (byte) (classrooms * whiteJars);
        byte brownClass = (byte) (classrooms * brownJars);
        System.out.println("In a school where " + classrooms + " classrooms need " + whiteClass + " cans of white paint and " + brownClass + " cans of brown paint.");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        byte banana = 5;
        byte Banana1 = 80;
        short gramsBanana = (short) (banana * Banana1);
        System.out.println(gramsBanana);

        short milk = 200;
        byte milk1 = 105;
        short gramsMilk = (short) (2 * milk1);
        System.out.println(gramsMilk);

        byte ice = 2;
        byte ice1 = 100;
        short gramsIce = (short) (ice1 * ice);
        System.out.println(gramsIce);

        byte egg = 4;
        byte egg1 = 70;
        short gramsEgg = (short) (egg1 * egg);
        System.out.println(gramsEgg);

        short breakfast = (short) (gramsBanana + gramsMilk + gramsIce + gramsEgg);
        System.out.println("In breakfast " + breakfast + " grams");

    }
    public static void task7() {
        System.out.println("Задача 7");
        short goal = 7000;
        short day250 = 250;
        short days1 = (short) (goal / day250);
        System.out.println("To lose weight,an athlete needs  " + days1 + " days");

        short day500 = 500;
        short days2 = (short) (goal / day500);
        System.out.println("To lose weight,an athlete needs  " + days2 + " days");

    }
    public static void task8 () {
        System.out.println("Задача 8");
        long Maria = 67760;
        long yearMaria = Maria * 12;
        long Denis = 83690;
        long yearDenis = Denis * 12;
        long Christina = 76230;
        long yearChristina = Christina * 12;
        float raise = 0.1F;

        float raiseMaria = Maria * raise;
        long salaryMaria = (long) (Maria + raiseMaria);
        long yearMariaR = salaryMaria * 12;
        long differenceMaria  = yearMariaR - yearMaria;
        System.out.println("Maria gets " + salaryMaria + " rubles now. Annual revenue increased by " + differenceMaria + " rubles" );

        float raiseDenis = Denis * raise;
        long salaryDenis = (long) (Denis + raiseDenis);
        long yearDenisR = salaryDenis * 12;
        long differenceDenis  = yearDenisR - yearDenis;
        System.out.println("Denis gets " + salaryDenis + " rubles now. Annual revenue increased by " + differenceDenis + " rubles" );

        float raiseChristina = Christina * raise;
        long salaryChristina = (long) (Christina + raiseChristina);
        long yearChristinaR = salaryChristina * 12;
        long differenceChristina  = yearChristinaR - yearChristina;
        System.out.println("Christina gets " + salaryChristina + " rubles now. Annual revenue increased by " + differenceChristina + " rubles" );
    }
}