package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {

        String[] words = sentence.split(" ");

        return words;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {



        for (int i=0; i < sentence.length(); i++){
            if (sentence.charAt(i)== ' '){
                return sentence.substring(0, i);
            }
                    }

        return sentence;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {

        String first = new StringBuffer(sentence).reverse().toString();

       //for (int i = 0; i < first.length() -1; i++) {
            //if (first.charAt(i) == ' ') {
               // return first.substring(0, i);
        String arr[] = first.split(" ",2);
        String first1 = arr[1];


        return first1 ;
        }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {

        String first = new StringBuffer(sentence).reverse().toString();

        //for (int i = 0; i < first.length() -1; i++) {
        //if (first.charAt(i) == ' ') {
        // return first.substring(0, i);
        String arr[] = first.split(" ",2);
        String first1 = arr[1];
        String firstcap = first1.substring(0,1).toUpperCase() + first1.substring(1);

        return firstcap ;

    }



    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {


        return str.substring(0, index).concat(str.substring(index +1));
    }

}
