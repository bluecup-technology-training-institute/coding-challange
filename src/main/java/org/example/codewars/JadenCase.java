package org.example.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {

    public String toJadenCase(String phrase) {

        if(null == phrase || phrase.isBlank()) {
            return null;
        }

        return Arrays.stream(phrase.split(" "))
                .map(w -> w.substring(0,1).toUpperCase() + w.substring(1))
                .collect(Collectors.joining(" "));
    }
}
