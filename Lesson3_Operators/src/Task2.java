import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double s = num1 * num2;
        double p = (num1 + num2) * 2;
        System.out.println(s);
        System.out.println(p);
    }
}
