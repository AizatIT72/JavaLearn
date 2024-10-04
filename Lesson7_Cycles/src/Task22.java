import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = Math.sqrt(a * a + b * b);
        double pr = Math.round(a + b + c);
        System.out.println(pr);
        sc.close();
    }
}
