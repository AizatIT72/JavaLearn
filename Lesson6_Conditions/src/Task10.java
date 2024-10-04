import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean check = false;
        if ((a + b) % 2 == 0 && (a * b) % 2 != 0) {
            check = true;
            System.out.println(check);
        } else {
            check = false;
            System.out.println(check);
        }
        sc.close();
    }
}
