import java.util.*;

public class Example11{


    public int equalizer(List<Integer> arr) {
    Map<String, Integer> b= new HashMap<>();

    b.put("a",1);
        int a = 0;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i - 1) > arr.get(i)) {
                a = i+1;
            }
        }
        return a;
    }


    public static void main(String[] args) {
        Map<Integer, Integer> a = new HashMap<>();

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        Example11 example11 = new Example11();
        System.out.println(example11.equalizer(arr));
    }
}
