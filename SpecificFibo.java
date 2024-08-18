import java.util.Scanner;

public class SpecificFibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term number: ");
        int n = sc.nextInt();

        int num1 = 0, num2 = 1;
        int specificFib = 0;

        if (n == 0) {
            specificFib = num1;
        } else if (n == 1) {
            specificFib = num2;
        } else {
            for (int i = 2; i <= n; i++) {
                specificFib = num1 + num2;
                num1 = num2;
                num2 = specificFib;
            }
        }

        System.out.println("The " + n + "th Fibonacci number is: " + specificFib);
    sc.close();
    }
}