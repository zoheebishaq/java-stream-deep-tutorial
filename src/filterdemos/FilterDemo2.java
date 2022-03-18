package filterdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
    public static void main(String[] args) {

        List<String> names= Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");

        List<String>longnames=new ArrayList<String>();

        // ? tolist
       longnames = names.stream().filter(s -> s.length()>6 && s.length()<8).collect(Collectors.toList());
        System.out.println(longnames);

        // ? foreach
        names.stream().filter(s -> s.length()>6 && s.length()<8).forEach(s -> System.out.println(s));

       // ? foreach without lambda
        names.stream().filter(s -> s.length()>6 && s.length()<8).forEach(System.out::println);


    }
}
