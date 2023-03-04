import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your date of birth: ");
        String dateOfBirth = sc.nextLine();

        System.out.print("Enter your student ID: ");
        String studentID = sc.nextLine();

        System.out.println("My name is " + name);
        System.out.println("My date of birth: " + dateOfBirth);
        System.out.print("My student ID: " + studentID);
    }
}