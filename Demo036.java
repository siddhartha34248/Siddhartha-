import java.util.Scanner;

public class Demo036 {

    public static void main(String[] args) {
        try (
                Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            System.out.print("Enter the third number: ");
            int num3 = scanner.nextInt();
            if (num1 >= num2 && num1 >= num3) {
                System.out.println("The biggest number is: " + num1);
            } else if (num2 >= num1 && num2 >= num3) {
                System.out.println("The biggest number is: " + num2);
            } else {
                System.out.println("The biggest number is: " + num3);
            }
        }
    }
}