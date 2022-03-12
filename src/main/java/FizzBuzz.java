import java.util.List;

public class FizzBuzz {


    public String fizzBuzz(int value) {
        if (isDividedByFive(value) && isDividedByThree(value))
            return "FizzBuzz";
        if (isDividedByThree(value))
            return "Fizz";
        if (isDividedByFive(value))
            return "Buzz";
        return String.valueOf(value);
    }

    private boolean isDividedByFive(int i) {
        return i % 5 == 0;
    }

    private boolean isDividedByThree(int i) {
        return i % 3 == 0;
    }

    public StringBuilder compute(List<Integer> list) {
        return list.stream().map(currentValue -> new StringBuilder(fizzBuzz(currentValue)))
                .reduce(new StringBuilder(), StringBuilder::append);
    }}
