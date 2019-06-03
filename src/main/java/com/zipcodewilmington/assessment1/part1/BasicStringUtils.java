package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        String camel = str.substring(0,1).toUpperCase();
        String camel1= camel + str.substring(1);

        return  camel1;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {

        String reverse = new StringBuffer(str).reverse().toString();


        return reverse;
    }


    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {

        String reverse1= new StringBuffer(str).reverse().toString();
        String reverse2 = reverse1.substring(0,1).toUpperCase();
        String reverse3 = reverse2 + reverse1.substring(1);


        return reverse3;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        String remove = "";
        for (int i= 0; i < str.length(); i++){
            if (str.charAt(i) != str.charAt(0) && str.charAt(i) != str.charAt(str.length() -1) ){
              remove += str.charAt(i);
            }
        }

        return remove;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {

        char[] inverse = str.toCharArray();
        for (int i =0; i < inverse.length; i++){

            char n = inverse[i];
            if (Character.isUpperCase(n)){

                inverse[i]= Character.toLowerCase(n);

            }else if (Character.isLowerCase(n)){
                inverse[i]= Character.toUpperCase(n);
            }
        }

        return new String (inverse);
    }
}
