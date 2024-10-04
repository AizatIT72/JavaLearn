import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.nextLine();
        boolean check = str1.charAt(0) < str2.charAt(1);
        System.out.println(check);
        sc.close();
    }
}
