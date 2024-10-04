import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 12 || n == 1 || n == 2) {
            System.out.println("Зима");
        } else if (n == 3 || n == 4 || n == 5) {
            System.out.println("Весна");
        } else if (n == 6 || n == 7 || n == 8) {
            System.out.println("Лето");
        } else if (n == 9 || n == 10 || n == 11) {
            System.out.println("Осень");
        } else {
            System.out.println("error");
        }
        sc.close();
    }
}
