import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 0;
        String s = "";
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] elem = str.split(" ");
            if (k + 1 <= elem.length) {
                s += elem[k];
            }
            k += 1;
        }
        String[] arr = s.split("");
        for (int i = 1; i <= arr.length; i++) {
            if (i == arr.length) {
                System.out.print(arr[i-1]);
            } else {
                System.out.print(arr[i-1] + " ");
            }
        }
        sc.close();
    }
}