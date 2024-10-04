import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println((a >= b) ? "Холифилд - чемпион!" : "Бой продолжается!");
        sc.close();
    }
}
