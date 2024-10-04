import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        if (year > 0 && month >= 1 && month <= 12 && day >= 1 && day <= 31) {
            if (month == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    if (day <= 29) {
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                } else {
                    if (day <= 28) {
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day <= 30) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            } else {
                System.out.println("true");
            }
        } else {
            System.out.println("false");
        }
        sc.close();
    }
}
