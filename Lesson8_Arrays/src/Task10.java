import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i].length();
        }
        //int min = Arrays.stream(arr1).min().getAsInt();
        int max = 100000;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < max) {
                max = arr1[i];
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == max) {
                System.out.println(i+1);
                break;
            }
        }
        sc.close();
    }
}
