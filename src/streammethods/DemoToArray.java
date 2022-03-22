package streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DemoToArray {
    public static void main(String[] args) {


        List<String> stringList = Arrays.asList("A", "B", "C", "1", "2", "3");

        Object[] arr = stringList.stream().toArray();

        System.out.println(arr.length);//? 6

        for (Object o : arr) {
            System.out.println(o);
        }
    }
}

