import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        boolean b = str1.contains(str2);
        System.out.println(b);
        sc.close();
    }
}
