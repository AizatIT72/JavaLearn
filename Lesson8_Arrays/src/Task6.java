import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str1 = str.split(",");
        for (String elem: str1) {
            System.out.println(elem);
        }
        sc.close();
    }
}
