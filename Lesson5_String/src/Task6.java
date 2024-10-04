import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        char ch = str.charAt(n-1);
        System.out.println(ch);
        sc.close();
    }
}
