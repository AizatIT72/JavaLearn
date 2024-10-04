import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n/2];
        int sum = 0;
        int k = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                arr[k] = i;
                k++;
                sum += i;
            }
        }
        for (int j = 1; j <= arr.length; j++) {
            if (j == arr.length) {
                System.out.print(arr[j-1]);
            } else {
                System.out.print(arr[j-1] + " ");
            }
        }
        System.out.println("");
        System.out.println(sum);
        sc.close();
    }
}
