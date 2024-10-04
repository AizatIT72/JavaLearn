import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
        char s1 = str1.charAt(0);
        char s2 = str2.charAt(0);
        char s3 = str3.charAt(0);
        if (s1 < s2 && s1 < s3) {
            if (s2 > s3) {
                System.out.println(str1 + "\n" + str3 + "\n" + str2);
            } else {
                System.out.println(str1 + "\n" + str2 + "\n" + str3);
            }
        } else if (s2 < s1 && s2 < s3) {
            if (s1 > s3) {
                System.out.println(str2 + "\n" + str3 + "\n" + str1);
            } else {
                System.out.println(str2 + "\n" + str1 + "\n" + str3);
            }
        } else if (s3 < s2 && s3 < s1) {
            if (s2 > s1) {
                System.out.println(str3 + "\n" + str1 + "\n" + str2);
            } else {
                System.out.println(str3 + "\n" + str2 + "\n" + str1);
            }
        }
        sc.close();
    }
}
