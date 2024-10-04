import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String name2 = sc.nextLine();
        int count = sc.nextInt();
        System.out.println("Привет, " + name + ", это твой помощник " + name2 + ".");
        System.out.println("У тебя " + count + " новых писем.");
    }
}
