import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char s1 = s.charAt(0);
        char s2 = s.charAt(s.length()-1);
        System.out.println(s1 + " " + s2);
        sc.close();
    }
}
