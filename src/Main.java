public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println();

        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println();

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println();

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println();

        for (int i = 7; i < 100; i = i + 7) {
            System.out.println(i);
        }
        System.out.println();

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println();

        int contribution = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + contribution;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();

        total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + contribution;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();

        int num = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i + "=" + (num * i));
        }
    }
}
