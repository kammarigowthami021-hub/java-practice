import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        boolean ans = check(number);

        System.out.println(ans);
        sc.close();
    }

    static boolean check(int number) {

        int temp = number;
        int digits = String.valueOf(number).length();
        int sum = 0;

        while (temp > 0) {
            int rem = temp % 10;

            int power = 1;

            // Calculate rem^digits
            for (int i = 1; i <= digits; i++) {
                power = power * rem;
            }

            sum += power;

            temp = temp / 10;
        }

        return sum == number;
    }
}