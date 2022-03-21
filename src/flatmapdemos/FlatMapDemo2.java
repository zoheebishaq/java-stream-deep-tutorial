package flatmapdemos;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlatMapDemo2 {
    public static void main(String[] args) {

        List<String> teamA = Arrays.asList("Scott", "David", "John");
        List<String> teamB = Arrays.asList("Mary", "Luna", "Tom");
        List<String> teamC = Arrays.asList("Ken", "Jony", "Kitty");


        List<List<String>> playersInBigTeam = Arrays.asList(teamA, teamB, teamC);

        for (List<String> team : playersInBigTeam) {
            for (String name : team) {
                System.out.println(name);

            }
        }

//        ex1
        playersInBigTeam.stream().flatMap(Collection::stream).forEach(System.out::println);

//        ex2
        playersInBigTeam.stream().flatMap(n -> n.stream()).forEach(System.out::println);
    }
}
