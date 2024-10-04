import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean check = true;
        if (n == 1) {
            System.out.println("false");
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = false;
                }
            }
            System.out.println(check);
        }
        sc.close();
    }
}
