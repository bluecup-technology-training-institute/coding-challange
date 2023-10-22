package org.example.codewars;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Greed {

    public static int greedy(int[] dice){
        return Arrays.stream(dice)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream().mapToInt(e -> {
                    switch (e.getKey()) {
                        case 1 -> {
                            return ((int) ((e.getValue() >= 3) ? (1000 + (e.getValue() - 3) * 100) : (e.getValue() * 100)));
                        }
                        case 2 -> {
                            return ((e.getValue() >= 3) ? (200) : 0);
                        }
                        case 3 -> {
                            return ((e.getValue() >= 3) ? (300) : 0);
                        }
                        case 4 -> {
                            return ((e.getValue() >= 3) ? (400) : 0);
                        }
                        case 5 -> {
                            return ((int) ((e.getValue() >= 3) ? (500 + (e.getValue() - 3) * 50) : (e.getValue() * 50)));
                        }
                        default -> {
                            return ((e.getValue() >= 3) ? (600) : 0);
                        }
                    }
                }).sum();
    }

    /*
     AtomicInteger ans = new AtomicInteger();
        Arrays.stream(dice)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((key, value) -> {
                    switch (key) {
                        case 1 -> {
                            ans.addAndGet((int) ((value >= 3) ? (1000 + (value - 3) * 100) : (value * 100)));
                        }
                        case 2 -> {
                            ans.addAndGet((value >= 3) ? (200) : 0);
                        }
                        case 3 -> {
                            ans.addAndGet((value >= 3) ? (300) : 0);
                        }
                        case 4 -> {
                            ans.addAndGet((value >= 3) ? (400) : 0);
                        }
                        case 5 -> {
                            ans.addAndGet((int) ((value >= 3) ? (500 + (value - 3) * 50) : (value * 50)));
                        }
                        default -> {
                            ans.addAndGet((value >= 3) ? (600) : 0);
                        }
                    }
                });
        return ans.get();
     */

}
