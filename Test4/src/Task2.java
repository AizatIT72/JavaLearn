import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[1000];
        int n = 0;
        while (sc.hasNext()) {
            int num = sc.nextInt();
            nums[n] = num;
            n++;
        }
        int[] nums1 = new int[n];
        for (int i = 0; i < n; i++) {
            nums1[i] = nums[i];
        }
        ArrayList<Integer> listarr = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            int k = nums1[i];
            for (int j = 0; j < nums1.length; j++) {
                if (k == nums1[j]) {
                    count += 1;
                }
            }
            if (count == 1) {
                listarr.add(nums1[i]);
            }
            count = 0;
        }
        for (int i = 0; i < listarr.size(); i++) {
            if (i + 1 == listarr.size()) {
                System.out.print(listarr.get(i));
            } else {
                System.out.print(listarr.get(i) + " ");
            }
        }
        sc.close();
    }
}
