import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (true) {
            int n = sc.nextInt();
            if (n % 11 != 0) {
                break;
            }
            if (n % 3 == 0) {
                sum += n;
            }
            count++;
        }
        System.out.println(count);
        System.out.println(sum);
        sc.close();
    }
}
