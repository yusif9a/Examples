import java.util.Arrays;

public class Polindromic {

    public static void main(String[] args) {
        int x = 12;

        int reverse = 0;
        while (x>0){
                reverse = reverse*10+x%10;
                x = x/10;
        }
        System.out.println(reverse);
        System.out.println(x);

        System.out.println(x == reverse);

        System.out.println(1001%10);

        char[] s = {'a', 's'};

        Polindromic.reverseString(s);

    }



    public static void reverseString(char[] s) {

        int n = s.length;
        System.out.println(n);
        char[] temp = new char[s.length];
        for(int i = s.length-1 ; i >=0; i--){

            char a = s[i];
            s[i] = a;
            System.out.println(a);
        }

        System.out.println(Arrays.toString(s));

    }
    
}
