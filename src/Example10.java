import java.util.Scanner;

public class Example10 {

    public int divisor_sum(int n) {
        int b = n / 2;
        System.out.println(b);
        int a = 0;
        for (int i = 1; i <= b; i++) {

            if (n % i == 0) {
                a = a + i;
                System.out.println(a);
            }
        }
        return a + n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Example10 myCalculator = new Example10();
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(myCalculator.divisor_sum(n));


    }
}
