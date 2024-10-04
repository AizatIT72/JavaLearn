import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[1000];
        int k = 0;
        while (sc.hasNext()) {
            int nums = sc.nextInt();
            arr[k] = nums;
            k += 1;
        }
        int[] elem = new int[k];
        for (int i = 0; i < k; i++) {
            elem[i] = arr[i];
        }
        if (n + 1 > k || n < 0) {
            System.out.println("Неверный ввод");
        } else {
            System.out.println(elem[n]);
        }
        sc.close();
    }
}
