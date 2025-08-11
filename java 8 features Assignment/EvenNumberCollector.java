import java.util.*;
import java.util.stream.*;

public class EvenNumberCollector {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 22, 33, 40, 55);

        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());

        System.out.println("Even Numbers: " + evenNumbers);
    }
}
