import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int k = 1;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = j+1;
                }
            } else {
                k += 1;
                for (int j = 0; j < m; j++) {
                    if (j == 0) {
                        arr[i][j] = k;
                    } else {
                        arr[i][j] = arr[i][0] * arr[0][j];
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j + 1 == m) {
                    System.out.print(arr[i][j]);
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println("");
        }
        sc.close();
    }
}
