import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = (++x / --y);
        --x;
        ++y;
        int z1 = (++y / --x);
        System.out.println(z + z1);
    }
}
