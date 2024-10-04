import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        double count = 0.0;
        while (true) {
            double n = sc.nextDouble();
            if (n <= 10 && n >= 0) {
                sum += n;
                count++;
            } else {
                break;
            }
        }
        double end = sum / count;
        System.out.println(end);
        sc.close();
    }
}
