import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String[]> listarr = new ArrayList<>();
        int sum = 0;
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] elem = str.split(" ");
            sum = elem.length;
            listarr.add(elem);
        }
        String[][] stringarr = new String[listarr.size()][];
        int k = listarr.size();
        for (int i = 0; i < listarr.size(); i++) {
            stringarr[i] = listarr.get(k-1);
            k -= 1;
        }
        for (int j = 0; j < sum; j++) {
            for (int i = 0; i < stringarr.length; i++) {
                if (i + 1 == stringarr.length) {
                    System.out.print(stringarr[i][j]);
                } else {
                    System.out.print(stringarr[i][j] + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
