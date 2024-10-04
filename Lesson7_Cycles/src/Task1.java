import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        while (a <= n) {
            System.out.println(a);
            a++;
        }
        sc.close();
    }
}
