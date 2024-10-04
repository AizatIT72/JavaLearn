import java.util.Scanner;

public class Task9 {
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
        for (int i = 1; i < arr1.length - 2; i += 2) {
            int temp = arr1[i];
            arr1[i] = arr1[i+1];
            arr1[i+1] = temp;
        }
        for (int el: arr1) {
            System.out.print(el + " ");
        }
        sc.close();
    }
}
