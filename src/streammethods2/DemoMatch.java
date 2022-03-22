package streammethods2;

import java.util.*;

public class DemoMatch {

    public static void main(String[] args) {

        Set<String> fruites=new HashSet<String>();

        fruites.add("One apple");
        fruites.add("One mango");
        fruites.add("Two apples");
        fruites.add("More grapes");
        fruites.add("Two guavas");


        //anyMatch()

        boolean resultAny = fruites.stream().anyMatch(s -> s.startsWith("One"));
        System.out.println(resultAny);


        //allMatch()
        boolean resultAll = fruites.stream().allMatch(s -> s.startsWith("One"));
        System.out.println(resultAll);

        //noneMatch()
        boolean resultNone = fruites.stream().noneMatch(s -> s.startsWith("One"));
        System.out.println(resultNone);
    }
}
