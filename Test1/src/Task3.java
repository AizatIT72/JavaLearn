import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        for (int i=1; i<=n; i++) {
            if ((i%4==0 && i%100!=0) || (i%400==0)) {
                k += 1;
            }
        }
        System.out.println(k);
        sc.close();
    }
}
