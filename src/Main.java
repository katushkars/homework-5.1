public class Main {
    public static void main(String[] args) {
        //Задание 1.1
        System.out.println("Задание 1.1");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        //Задание 1.2
        System.out.println("Задание 1.2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        //задание 1.3
        System.out.println("Задание 1.3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        //задание 1.4
        System.out.println("Задание 1.4");
        for (int i = 10; i > -10; i = i - 1) {
            System.out.println(i);
        }
        //задание 2.1
        System.out.println("Задание 2.1");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " является високосным годом");
        }
        //задание 2.2
        System.out.println("Задание 2.2");
        for (int i = 7; i < 99; i = i + 7) {
            System.out.println(i);
        }
        //задание 2.3
        System.out.println("Задание 2.3");
        for (int i = 1; i < 513; i = i *2) {
            System.out.println(i);
        }
        //задание 3.1
        System.out.println("Задание 3.1");

        int accumulation=29000;
        int total=0;
        for (int i=0;i<12;i++){
            total=total+accumulation;
            System.out.println("Месяц "+i+ " итого " +total);
        }
        //задание 3.2
        System.out.println("Задание 3.2");

        int accumulation2=29000;
        int total2=0;
        for (int i=0;i<12;i++) {
            total2=total2+ (total2/100);
            total2 = total2 + accumulation2;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total2+ " рублей");
        }

    }
}

