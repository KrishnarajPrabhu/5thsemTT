package tt;
import java.util.Scanner;

public class armstrongnum {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number:");
        int num = scan.nextInt();
        int count = 0;
        int temp = num; 
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        Armstrong(num, count);
    }

    static void Armstrong(int n, int count) {
        int temp = n; 
        int res = 0;
        while (temp > 0) {
            int rem = temp % 10;
            res += Math.pow(rem, count);
            temp = temp / 10;
        }
        if (res == n)
            System.out.print(n + " is an Armstrong number");
        else
            System.out.print(n + " is not an Armstrong number");
    }
}
