import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a for quadratic equation ax^2 + bx +c =0");
        double a = sc.nextDouble();
        System.out.println("Enter the value of b for quadratic equation ax^2 + bx +c =0");
        double b = sc.nextDouble();
        System.out.println("Enter the value of c for quadratic equation ax^2 + bx +c =0");
        double c = sc.nextDouble();


        double discriminant = b*b - 4*a*c;
        if(discriminant<0) System.out.println("both Roots are imaginary");
        else if (discriminant>02) {
            double root1 = (-b + Math.sqrt(discriminant))/(2*a);
            double root2 = (-b - Math.sqrt(discriminant))/(2*a);

            System.out.println("root1 is "+root1);
            System.out.println("root2 is "+root2);
        }
        else{
            double commonRoot = -b/(2*a);
            System.out.println("both roots are common to "+commonRoot);
        }

    }
}
