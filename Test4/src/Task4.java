import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        String[][] mass = new String[m][n];
        for (int l = 0; l < k; l++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            mass[x-1][y-1] = "m";
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mass[i][j] == null) {
                    mass[i][j] = "0";
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int total = 0;
                if (mass[i][j].equals("m") == false) {
                    int[][] steps = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}, {1, 1}, {-1, 1}, {-1, -1}, {1, -1}};
                    for (int[] step: steps) {
                        int nx = i + step[0];
                        int ny = j + step[1];
                        if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
                            if (mass[nx][ny].equals("m")) {
                                total++;
                            }
                        }
                    }
                    mass[i][j] = Integer.toString(total);
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j + 1 == n) {
                    System.out.print(mass[i][j]);
                } else {
                    System.out.print(mass[i][j] + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
