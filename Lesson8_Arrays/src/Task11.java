import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[1000];
        int k = 0;
        for (int i = 0; sc.hasNext(); i++) {
            int n = sc.nextInt();
            arr[i] = n;
            k++;
        }
        int[] arr1 = new int[k];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        int sum = Integer.MAX_VALUE;
        boolean check = true;
        if (arr1.length < 3) {
            System.out.println(0);
            check = false;
        } else {
            for (int i = 0; i <= arr1.length - 3; i++) {
                if (arr1[i] + arr1[i+2] < sum) {
                    sum = arr1[i] + arr1[i+2];
                }
            }
        }
        if (check) {
            System.out.println(sum);
        }
        sc.close();
    }
}
