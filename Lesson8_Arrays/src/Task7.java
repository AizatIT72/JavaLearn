import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int nums = sc.nextInt();
            arr[i] = nums;
        }
        int k = sc.nextInt();
        Arrays.sort(arr);
        int num = 0;
        for (int i = 1; i <= arr.length; i++) {
            if (i == k) {
                num = arr[i-1];
                break;
            }
        }
        if (num != 0) {
            System.out.println(num);
        } else {
            System.out.println("Ошибка ввода");
        }
        sc.close();
    }
}
