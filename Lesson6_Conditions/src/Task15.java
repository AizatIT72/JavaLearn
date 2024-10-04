import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mn = sc.nextInt();
        int razn = Math.max(Math.max(a, b), c) - Math.min(Math.min(a, b), c);
        if (razn > mn) {
            System.out.println("Ура, бастуем!");
        } else {
            System.out.println("За работу, Солнце ещё высоко");
        }
        sc.close();
    }
}
