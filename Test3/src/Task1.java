import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        int max = -100000;
        if (n == 0) {
            System.out.println(0);
        } else {
            while (n > 0) {
                max = Math.max(max, n%10);
                n /= 10;
            }
            System.out.println(max);
        }
        sc.close();
    }
}
