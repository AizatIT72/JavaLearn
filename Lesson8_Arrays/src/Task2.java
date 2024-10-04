import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }
        System.out.println(arr[n-1]);
        sc.close();
    }
}
