package mapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {
    public static void main(String[] args) {


        List<Integer> numbersList = Arrays.asList(2, 3, 4, 5);

        List<Integer> multipliedList = new ArrayList<Integer>();


        //before java 8
        for (Integer n : numbersList) {
            multipliedList.add(n * 3);
        }
        System.out.println(multipliedList);


        multipliedList = numbersList.stream().map(integer -> integer * 3).collect(Collectors.toList());
        System.out.println(multipliedList);

    }


}
