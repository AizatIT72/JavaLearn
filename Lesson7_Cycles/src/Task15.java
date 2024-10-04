import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int curr = 1;
            for (int j = 1; j <= i; ) {
                for (int g = 0; g < curr; g++) {
                    if (j > i) {
                        break;
                    }
                    if (j == i) {
                        System.out.print(curr);
                    } else {
                        System.out.print(curr + " ");
                    }
                    j++;
                }
                curr++;
            }
            System.out.println();
        }
        sc.close();
    }
}
