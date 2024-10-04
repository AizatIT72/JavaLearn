import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Сложение: " + x + " + " + y + " = " + (x+y));
        System.out.println("Вычитание: " + x + " - " + y + " = " + (x-y));
        sc.close();
    }
}
