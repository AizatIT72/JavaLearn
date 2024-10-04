public class Task17 {
    public static void main(String[] args) {
        double num1 = Math.pow(Math.exp(1), Math.PI);
        double num2 = Math.pow(Math.PI, Math.exp(1));
        if (num1 > num2) {
            System.out.println(">");
        } else if (num1 < num2) {
            System.out.println("<");
        } else {
            System.out.println("=");
        }
    }
}
