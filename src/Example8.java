import java.util.Arrays;

public class Example8 {


//    void sss(String[] c){
//        System.out.println(c);
//    }





        public static void main(String args[]) {

            System.out.println(Arrays.toString(args));
            System.out.println(args.length);

            Example8 example8 = new Example8();

           // example8.sss(new String[]{"s","ss"});
                Z z = new Z();

                z.numbera(1.1);
                z.numbera(2);

                String a, b= "adqd";

                Object d = 5;

            System.out.println(d.toString());

            Object aa = 5;
            System.out.println(aa.toString());

            StringBuilder dd = new StringBuilder("swe");

            String[] days = new String[1];
        }
}

class Sa {
     void numbera(double a){
             System.out.println("Sa");
     }

}

class Z extends Sa{
         void numbera(int b){
                 System.out.println("Z");
         }
}
