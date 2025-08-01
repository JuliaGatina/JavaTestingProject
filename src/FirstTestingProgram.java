import java.util.Scanner;

public class FirstTestingProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if (a < b) {
            System.out.println("a < b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a = b");
        }

        System.out.println("a + b: " + (a + b));
        System.out.println("a - b: " + (a - b));


        if (b != 0) {
            System.out.println("a / b: " + (a / b));
        } else {
            System.out.println("a / b: Деление на ноль невозможно!");
        }

        System.out.println("a x b: " + (a * b));
    }
}