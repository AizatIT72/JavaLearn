import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        int a = sc.nextInt();
        if (n > 99 && n < 1000 && n%100/10 == a) {
            System.out.println("true");
        } else if (n > 99 && n < 1000 && n%100/10 != a) {
            System.out.println("false");
        } else {
            System.out.println("error");
        }
        sc.close();
    }
}
