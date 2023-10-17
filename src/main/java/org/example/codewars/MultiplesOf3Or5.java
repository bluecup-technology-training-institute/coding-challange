package org.example.codewars;

public class MultiplesOf3Or5 {

    public int solution(int number) {

        int result = 0;

        if(number <= 0) {
            return number;
        }

        number = number - 1;

        while (number > 0) {
            result = result + (((number % 3) == 0 || (number % 5) == 0) ? number : 0);
            number--;
        };

        return  result;
    }

}
