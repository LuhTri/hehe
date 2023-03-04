import java.util.Scanner;

public class Exercise3 {

    public static int divisionRemainder(int a, int b) {
        return a % b;
    }
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter divisor a: ");
        a = sc.nextInt();

        System.out.print("Enter b: ");
        b = sc.nextInt();

        System.out.print("The remainder of the division is: " + divisionRemainder(a, b));
    }
}
