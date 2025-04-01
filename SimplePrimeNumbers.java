import java.util.Scanner;

public class SimplePrimeNumbers {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = x.nextInt();
        int count = 0;
        int num = 2;
         while (count < n) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print
                (num + " ");
 count++;
 }
num++;
 }
  x.close();
 }
}
