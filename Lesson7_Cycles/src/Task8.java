import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        char a_1 = a.charAt(0);
        char b_1 = b.charAt(0);
        sc.nextLine();
        String str = sc.nextLine();
        String[] words = str.split(" ");
        for (String word: words) {
            char word_c = word.charAt(0);
            if (a_1 >= b_1) {
                if (word_c >= b_1 && word_c <= a_1) {
                    System.out.println(word);
                }
            } else {
                if (word_c <= b_1 && word_c >= a_1) {
                    System.out.println(word);
                }
            }
        }
        sc.close();
    }
}
