import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        switch (len) {
            case 1:
                System.out.println("Одна буква");
                break;
            case 2:
                System.out.println("Две буквы");
                break;
            case 3:
                System.out.println("Три буквы");
                break;
            case 4:
                System.out.println("Четыре буквы");
                break;
            case 5:
                System.out.println("Пять букв");
                break;
            default:
                System.out.println("Длинное слово");
        }
        sc.close();
    }
}
