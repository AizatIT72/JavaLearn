import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str = str1 + " " + str2;
        System.out.println(str);
        System.out.println(str.length());
        sc.close();
    }
}
