import java.util.Arrays;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = "";
        for (int i = 1; i <= n; i++) {
            String str = sc.nextLine();
            s += (str + ";");
        }
        String[] arr = s.split(";");
        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            String[] el = str.split(" ");
            System.out.println(Arrays.toString(el));
        }
        sc.close();
    }
}