import java.util.Locale;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (y <= 2 - x*x && y >= x || y <= 2 - x*x && y <= x && y >= 0 && x >= 0 && x <= Math.sqrt(2))  {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
