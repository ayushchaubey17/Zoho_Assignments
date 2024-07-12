import java.util.Scanner;

public class BitwiseOpertor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();


        int and = num1 & num2;
        System.out.printf("%d & %d = %d%n", num1, num2, and);


        int or = num1 | num2;
        System.out.printf("%d | %d = %d%n", num1, num2, or);


        int xor = num1 ^ num2;
        System.out.printf("%d ^ %d = %d%n", num1, num2, xor);


        int leftShift = num1 << 1;
        System.out.printf("%d << 1 = %d%n", num1, leftShift);


        int rightShift= num1 >> 1;
        System.out.printf("%d >> 1 = %d%n", num1, rightShift);

        sc.close();
    }
}
