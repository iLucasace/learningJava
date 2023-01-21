import java.util.Scanner;

class Sum {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type the first number:");
        int n1 = input.nextInt();

        System.out.println("\nType the second number:");
        int n2 = input.nextInt();

        int sum = n1 + n2;
        System.out.println("\n" + n1 + " + " + n2 + " = " + sum);

        input.close();
    }
}