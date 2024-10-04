import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (sc.hasNext()==true) {
            String s = sc.next();
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
