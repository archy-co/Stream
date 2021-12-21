import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strL = Arrays.asList("1", "abc", "1.3", "15", "7.", "3.5");
        List<Integer> intL =  MapTask.mapping(strL);
        System.out.println(intL);

        List<String> words = Arrays.asList("Hello", "there");
        List<String> chW = FlattingTask.flattingStrings(words);
        System.out.println(chW);

    }
}
