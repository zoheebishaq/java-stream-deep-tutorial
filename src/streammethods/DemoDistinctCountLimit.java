package streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoDistinctCountLimit {
    public static void main(String[] args) {
        List<String> vehiclesList = Arrays.asList("bus", "car", "bicycle", "bus", "car", "car", "bike");


        //distinct
        List<String> vehiculeDistinct = vehiclesList.stream().distinct().collect(Collectors.toList());

        System.out.println(vehiculeDistinct);

        //count
        long count = vehiclesList.stream().distinct().count();

        System.out.println(count);

        //limit

        vehiclesList.stream().limit(3).forEach(System.out::println);

    }
}
