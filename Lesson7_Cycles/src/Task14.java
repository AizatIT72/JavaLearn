import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (k == n) {
                    break;
                } else {
                    System.out.print(i + " ");
                    k++;
                }
            }
        }
        sc.close();
    }
}
