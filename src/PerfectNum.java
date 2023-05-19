import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number>>");
        int num = scanner.nextInt();

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println(i);
                result = result + i;
            }
        }

        if (result == num) {
            System.out.println(num + "is a perfect no" + result + " = " + num);
        } else {
            System.out.println("not perfect");
        }
    }

}


