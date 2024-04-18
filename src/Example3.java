import java.util.Scanner;

public class Example3 {


    private final static String regularExpression = "^[aA-zZ,_]\\w{7,29}$";




    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String username = scan.nextLine();

        if (username.matches(regularExpression)){
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }

    }
}
