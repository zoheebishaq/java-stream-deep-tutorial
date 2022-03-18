package mapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo2 {
    public static void main(String[] args) {


        List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");

        /*
        for (String s : vehicles) {
            Integer length = s.length();
            System.out.println(length);
        }
        */



        vehicles.stream().map(s -> s.length()).forEach(System.out::println);
    }



}
