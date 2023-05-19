import java.util.Scanner;
public class PrimeNo {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        int count = 0;
        for (int i = no; i > 0; i--) {
            if (no % i == 0) {
                count++;
            }
        }
        if (count > 2) {
            System.out.println("Number is not prime..");
        } else {
            System.out.println("Number is prime..");
        }
    }
}


