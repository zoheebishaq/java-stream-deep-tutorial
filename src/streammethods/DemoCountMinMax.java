package streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DemoCountMinMax {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //! count
        long numberOfEvenNumbers = numbersList.stream().filter(n -> n % 2 == 0).count();

        System.out.println(numberOfEvenNumbers);

        //! min
        Optional<Integer> min = numbersList.stream().min((o1, o2) -> {
            return o1.compareTo(o2);
        });

        System.out.println(min.get());

        //! max
        Optional<Integer> max = numbersList.stream().max((o1, o2) -> {
            return o1.compareTo(o2);
        });


        System.out.println(max.get());
    }
}
