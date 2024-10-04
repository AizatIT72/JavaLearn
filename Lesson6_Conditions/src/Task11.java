import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int a_1 = (a % 2 == 0) ? 1 : 0;
        int b_1 = (b % 2 == 0) ? 1 : 0;
        int c_1 = (c % 2 == 0) ? 1 : 0;
        if (a_1 + b_1 + c_1 == 2){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }
}
