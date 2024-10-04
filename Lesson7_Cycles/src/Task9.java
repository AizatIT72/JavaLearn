import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean check = true;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                check = false;
                System.out.print(i + " ");
            }
        }
        if (check) {
            System.out.println("Таких чисел нет");
        }
        sc.close();
    }
}
