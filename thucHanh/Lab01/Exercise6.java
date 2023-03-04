import java.util.Scanner;

public class Exercise6 {
    public static int min(int a, int b, int c) {
        int min = a < b ? a : b;
        return min < c ? min : c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a, b, c in turn:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print("The smallest number in three numbers is: " + min(a, b, c));

    }
}
