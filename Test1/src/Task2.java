import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double diskr = b*b - 4*a*c;
        double sum = -b / a;
        double prod = (b*b - diskr) / (4 * (a * a));
        System.out.println(sum + " " + prod);
        sc.close();
    }
}
