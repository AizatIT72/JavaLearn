import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[1000];
        int k = 0;
        for (int i = 0; sc.hasNext(); i++) {
            int n = sc.nextInt();
            k++;
            arr[i] = n;
        }
        int[] arr_new = new int[k];
        for (int i = 0; i < k; i++) {
            arr_new[i] = arr[i];
        }
        Arrays.sort(arr_new);
        System.out.println(Arrays.toString(arr_new));
        sc.close();
    }
}
