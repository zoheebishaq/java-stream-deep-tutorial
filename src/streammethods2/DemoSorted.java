package streammethods2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DemoSorted {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2, 4, 1, 3, 7, 5, 9);

        //sorted
        list1.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);//? 1234579

        //reverse
        list1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);//? 9754321


        //String
        List<String> list2=Arrays.asList("John","Mary","Kim","David","Smith");

        list2.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);

        list2.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
