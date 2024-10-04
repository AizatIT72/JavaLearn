import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int j = sc.nextInt();
            arr[i] = j;
        }
        for (int i = 1; i <= arr.length-1; i++) {
            if (i == arr.length-1) {
                System.out.print(arr[i]);
            } else if (arr[i-1] < arr[i]) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}