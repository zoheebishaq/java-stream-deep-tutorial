package filterdemos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo3 {
    public static void main(String[] args) {


        List<String> words = Arrays.asList("cup", null, "forest", "sky", "book", null, "theatre");

        List<String> words2 = words.stream().filter(s -> s != null).collect(Collectors.toList());

        System.out.println(words2);

    }
}
