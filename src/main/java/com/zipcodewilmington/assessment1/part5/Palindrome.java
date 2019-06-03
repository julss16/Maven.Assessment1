package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public static Integer countPalindromes(String input) {


        int index = 0;
        int max = input.length();
        int count = input.length();
        String p;

        for (int i = 0; i < input.length(); i++) {

            for (int k = i + 2; k <= input.length(); k++) {

                p = input.substring(i, k);
                count += isPalindromes(input.substring(i, k));
            }

        }
        return count;

    }


    public static Integer isPalindromes(String input1) {

        for (int i = 0; i < input1.length() / 2; i++) {
            if (input1.charAt(i) != input1.charAt(input1.length() - 1 - i))

                return 0;

        }
        return 1;


    }
}








