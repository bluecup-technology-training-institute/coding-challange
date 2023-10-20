package org.example.codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class XO {

    public static boolean getXO (String str) {

        str = str.toLowerCase();
        return str.replace("o","").length() == str.replace("x","").length();
    }
}
