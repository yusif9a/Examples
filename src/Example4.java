import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example4 {



    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here

        Collections.sort(candles);

        int higtCandles = 1;
        int maxValue = candles.get(candles.size()-1);

        for (int i = 0; i< candles.size(); i++) {
            if (maxValue == candles.get(i)) {
                higtCandles = higtCandles +1;

                System.out.println(maxValue+" = "+candles.get(i));
            }else{
                continue;
            }
        }
//        System.out.println(candles);
        return higtCandles;

    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();

        a.add(5);
        a.add(1);
        a.add(5);
        a.add(3);
        a.add(4);

        System.out.println(birthdayCakeCandles(a));
    }
}
