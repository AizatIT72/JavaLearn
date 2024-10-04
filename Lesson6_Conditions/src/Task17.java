import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = -20000000;
        if (c % 2 == 0) {
            if (c >= max) {
                max = c;
            }
        }
        if (b % 2 == 0) {
            if (b >= max) {
                max = b;
            }
        }
        if (a % 2 == 0) {
            if (a >= max) {
                max = a;
            }
        }
        if (!(max == -20000000)) {
            System.out.println(max);
        } else {
            System.out.println("Чётных чисел нет");
        }
        sc.close();
    }
}
