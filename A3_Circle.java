import java.util.Scanner;

public class A3_Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt
        System.out.println("Enter the radius of your circle: ");
        double radius = scanner.nextDouble();

        // Calculations
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        // Output
        System.out.println();
        System.out.println("Circle Properties:");
        System.out.printf("%-14s %10.3f%n", "Radius: ", radius);
        System.out.printf("%-14s %10.3f%n", "Circumference:", circumference);
        System.out.printf("%-14s %10.3f%n", "Area: ", area);

        scanner.close();
    }
}
