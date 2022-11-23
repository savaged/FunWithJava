package info.savaged;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FizzBuzz {

    public static int[] getDefaultNumbers() {
        return IntStream.range(0, 17).toArray();
    }

    public static String[] getOutput() {
        return getOutput(getDefaultNumbers());
    }

    public static String[] getOutput(int[] numbers) {
        if (numbers.length == 0) {
            numbers = getDefaultNumbers();
        }
        List<String> output = new ArrayList<>();
        for (int i : numbers) {
            output.add(getOutput(i));
        }
        return output.toArray(new String[0]);
    }

    private static String getOutput(int i) {
        String value = "";
        int r = i % 3;
        if (r == 0) {
            value = "Fizz";
        }
        r = i % 5;
        if (r == 0) {
            value += "Buzz";
        }
        if (value.equals("")) {
            value = String.valueOf(i);
        }
        return value;
    }

}
