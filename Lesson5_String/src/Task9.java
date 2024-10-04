import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String a_1 = Integer.toString(a);
        String b_1 = Integer.toString(b);
        System.out.println(a + b);
        System.out.println(a_1 + b_1);
        sc.close();
    }
}
