import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i * i <= n) {
            System.out.print(i*i + " ");
            i++;
        }
        sc.close();
    }
}
