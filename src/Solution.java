import java.util.Arrays;
import java.util.Scanner;

class Prime {
    public static void checkPrime(int[] values) {
        for (int i = 0; i < values.length; i++) {
            if (PrimeChecker.isPrime(values[i])) {
                System.out.print(values[i] + " ");
            }
        }
        System.out.print("\n");
    }
}

class PrimeChecker {
    public static boolean isPrime(int n) {
        if (n <= 1) { return false; }
        for (int i = 2; i <= (int)(n/2); i++) {
            if (n % i == 0) { return false; }
        }

        return true;
    }
}



public class Solution {




    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Prime.checkPrime(arr);

    }
}