import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        StringBuilder s = new StringBuilder();
        while (n > 0) {
            s.append(n%10);
            n /= 10;
        }
        System.out.println(s);
        sc.close();
    }
}
