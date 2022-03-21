package streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoReduce {
    public static void main(String[] args) {


        List<String> stringList = Arrays.asList("A","B","C","1","2","3");

        stringList.stream().reduce()
    }
}
