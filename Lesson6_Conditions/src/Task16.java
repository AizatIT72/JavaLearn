import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        if (a2 > b1 || a1 > b2) {
            System.out.println("Пересечения нет");
        } else if (a2 > a1 && a2 < b1 && b2 > b1) {
            System.out.println(a2 + " " + b1);
        } else if (a1 == a2 && b1 == b2) {
            System.out.println(a1 + " " + a2);
        } else if (a1 == a2 && b1 > b2) {
            System.out.println(a1 + " " + b2);
        } else if (a1 == a2 && b1 < b2) {
            System.out.println(a1 + " " + b1);
        } else if (a1 < a2 && b1 == b2) {
            System.out.println(a2 + " " + b1);
        } else if (a1 > a2 && b1 == b2) {
            System.out.println(a1 + " " + b1);
        } else if (a2 < a1 && a1 < b2 && b1 > b2) {
            System.out.println(a1 + " " + b2);
        } else if (a1 < a2 && b1 > b2) {
            System.out.println(a2 + " " + b2);
        } else if (a1 > a2 && b2 > b1) {
            System.out.println(a1 + " " + b1);
        } else if (b1 == a2 && b2 > b1) {
            System.out.println(b1);
        } else if (b2 == a1 && b1 > b2) {
            System.out.println(b2);
        }
        sc.close();
    }
}
