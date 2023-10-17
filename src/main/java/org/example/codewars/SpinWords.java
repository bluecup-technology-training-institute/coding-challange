package org.example.codewars;

import java.util.StringTokenizer;

public class SpinWords {

    public String spinWords(String sentence) {

        if(null == sentence || sentence.isBlank() || sentence.isEmpty()) {
            return sentence;
        }

        String[] splitWords = sentence.split(" ");

        return process(splitWords);
    }

    private String process(String[] words) {

        StringBuilder stringBuilder = new StringBuilder();

        for (var s : words) {
            if(s.length() < 5) {
                stringBuilder.append(s);
            } else {
                stringBuilder.append(reverse(s));
            }
            stringBuilder.append(" ");
        }

        return stringBuilder.toString().trim();
    }

    private String reverse(String str) {

        StringBuilder stringBuilder = new StringBuilder();

        char[] c = str.toCharArray();

        for(int i=c.length-1; i>=0; i--) {
            stringBuilder.append(c[i]);
        }

        return stringBuilder.toString();
    }
}