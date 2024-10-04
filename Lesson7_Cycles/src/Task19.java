import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        a = Math.toRadians(a);
        double y = Math.sin(a) + Math.cos(a);
        System.out.println(y);
        sc.close();
    }
}
