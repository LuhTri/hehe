import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        float height, base, area;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter triangle's height: ");
        height = sc.nextFloat();

        System.out.print("Enter triangle's base: ");
        base = sc.nextFloat();

        area = 0.5f * base * height;

        System.out.printf("Triangle's area is: %4.3f", area);

    }
    
}
