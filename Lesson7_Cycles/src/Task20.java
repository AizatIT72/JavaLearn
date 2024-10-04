import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double pi = Math.PI;
        double scale = Math.pow(10, n);
        if (n == 0) {
            System.out.println(3);
        } else {
            System.out.println(Math.round(pi * scale) / scale);
        }
        sc.close();
    }
}
