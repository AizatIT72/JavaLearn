import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        boolean flag = true;
        while (flag) {
             int i = sc.nextInt();
             if (i != 0){
                 sum += i;
             } else {
                 flag = false;
             }
        }
        System.out.println(sum);
        sc.close();
    }
}
