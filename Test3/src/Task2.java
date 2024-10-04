import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a <= b) {
            for (int i = a; i <= b; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("");
                }
            }
        } else {
            for (int j = b; j <= a; j++) {
                if (j % 2 != 0) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("");
                }
            }
        }
        sc.close();
    }
}
