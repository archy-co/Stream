import java.util.List;
import java.util.stream.Collectors;

public class MapTask {
    public static List<Integer> mapping(List<String> input) {
        return input.stream().filter(str -> str.matches("-?\\d*")).map(Integer::parseInt).collect(Collectors.toList());
    }
}
