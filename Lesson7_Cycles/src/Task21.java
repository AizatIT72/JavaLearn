import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double n = sc.nextDouble();
        double hp = Math.abs(Math.pow(x, y / n));
        double scale = Math.pow(10, 5);
        System.out.println(Math.round(hp * scale) / scale);
        sc.close();
    }
}
