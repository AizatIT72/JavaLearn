import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        int k = 0;
        while (sc.hasNext()) {
            String str = sc.nextLine();
            s += str;
            s += " ";
            String[] arr = str.split(" ");
            k = arr.length;
        }
        String[] elem = s.split(" ");
        System.out.println("Строк: " + elem.length/k); // строки
        System.out.println("Столбцов: " + k); // столбцы
        sc.close();
    }
}
