import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       int mx1 = Math.max(Math.max(a, b), c);
       int mn1 = Math.min(Math.min(a, b), c);
       System.out.println(a + b + c - mx1 - mn1);
       sc.close();
    }
}
