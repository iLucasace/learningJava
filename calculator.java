import java.util.Scanner;

class Calculator {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double result;

        System.out.println("Type the first number:");
        double n1 = input.nextInt();

        System.out.println("\nChoose an operator: +, -, *, or /");
        char operator = input.next().charAt(0);

        System.out.println("\nType the second number:");
        double n2 = input.nextInt();

        switch (operator) {
            case '+':
                result = n1 + n2;
                System.out.println("\n" + n1 + " + " + n2 + " = " + result);
                break;
            case '-':
                result = n1 - n2;
                System.out.println("\n" + n1 + " - " + n2 + " = " + result);
                break;
            case '*':
                result = n1 * n2;
                System.out.println("\n" + n1 + " * " + n2 + " = " + result);
                break;
            case '/':
                result = n1 / n2;
                System.out.println("\n" + n1 + " / " + n2 + " = " + result);
                break;
            default:
                System.out.println("\nInvalid operator!");
                break;
        }
        
        input.close();
    }
}