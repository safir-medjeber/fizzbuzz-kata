import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzz {


    public String fizzBuzz(int value) {
        if(isDividedByFive(value) && isDividedByThree(value))
            return "FizzBuzz";
        if(isDividedByThree(value))
            return "Fizz";
        if(isDividedByFive(value))
            return "Buzz";
        return String.valueOf(value);
    }

    private boolean isDividedByFive(int i) {
        return i % 5 == 0;
    }

    private boolean isDividedByThree(int i) {
        return i % 3 == 0;
    }

    public String compute(List<Integer> list) {
        return  list.stream()
                .map(currentValue -> fizzBuzz(currentValue))
                .reduce("", (currentValue, nextValues) -> currentValue + nextValues);
    }
}
