
//Написать программу по возведению числа в степень с помощью рекурсии.

import java.util.Scanner;

public class Recursion {
    private static int a;
    private static int b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Число для возведения в степень");
        a = sc.nextInt();
        System.out.println("Введите степень числа");
        b = sc.nextInt();
        System.out.println(a + "^" + b + "=" + recurs(a, b));

    }

    public static int recurs(int a, int b) {
        if (a == 0) {
            if (b > 0) {
                return 0;
            }
        }
        if (a > 0) {
            if (b == 0) {
                return 1;
            }
        }
        return a * recurs(a, b - 1);
    }
}
