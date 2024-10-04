import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String[]> listarr = new ArrayList<>();
        int sum = 0;
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] arr = str.split(" ");
            String[] arr1 = new String[arr.length];
            sum = arr.length;
            int k = arr.length;
            for (int i = 0; i < arr.length; i++) {
                arr1[i] = arr[k-1];
                k -= 1;
            }
            listarr.add(arr1);
        }
        String[][] strarr = new String[listarr.size()][];
        for (int i = 0; i < listarr.size(); i++) {
            strarr[i] = listarr.get(i);
        }
        for (int i = 0; i < sum; i++) {
            for (int j = 0; j < strarr.length; j++) {
                if (j + 1 == strarr.length) {
                    System.out.print(strarr[j][i]);
                } else {
                    System.out.print(strarr[j][i] + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
