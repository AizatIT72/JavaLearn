import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            for (int i = 2; i <= 5; i++) {
                double a = Math.pow(num, i);
                int b = (int) a;
                if (i == 5) {
                    System.out.print(b);
                    break;
                }
                System.out.print(b + " ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
