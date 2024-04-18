import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class F {


    public static void main(String[] args) {
        List<String> listOfWords = Arrays.asList("Hello", "World");
        List<String> uniqueChars = listOfWords.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .toList();

        System.out.println(listOfWords);
        System.out.println(uniqueChars);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .filter(n -> n > 5)
                .findAny();

        System.out.println(numbers);
        System.out.println(result);
    }
}
