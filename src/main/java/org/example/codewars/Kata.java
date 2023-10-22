package org.example.codewars;

import java.util.Arrays;
import java.util.Map.Entry;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Kata {

    public static double findUniq(double arr[]) {

        return Arrays.stream(arr).boxed()
                .collect(groupingBy(identity(), counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .map(Entry::getKey)
                .orElse(0.0);
    }

    /*
          return Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(a -> a))
               .entrySet()
               .stream().filter(i -> i.getValue().size() == 1)
               .findFirst().get().getValue().get(0);
     */
}
