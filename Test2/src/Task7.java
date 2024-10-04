import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a = "Джефф Безос";
        String b = "Илон Маск";
        String c = "Марк Цукерберг";
        String d = "Билл Гейтс";
        if (s.contains(a) || s.contains(b) || s.contains(c) || s.contains(d)) {
            System.out.println("Добро пожаловать!");
        } else {
            System.out.println("Здесь никого нет, Вы ошиблись дверью");
        }
        sc.close();
    }
}
