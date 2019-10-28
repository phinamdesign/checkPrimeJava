import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap So : ");
        int number = scanner.nextInt();

        if (number < 2)
            System.out.println(number + " is not a prime");
    }
}
