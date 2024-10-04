import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            int j = sc.nextInt();
            arr[i-1] = j;
        }
        int id = sc.nextInt();
        System.out.println(arr[id]);
        sc.close();
    }
}
