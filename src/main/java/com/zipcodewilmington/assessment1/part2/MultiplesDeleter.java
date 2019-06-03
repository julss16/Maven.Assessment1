package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {

        int count = 0;

        for (int i = 0; i < ints.length - 1; i++) {
            if (ints[i] % 2 != 0) {
                count++;
            }
        }

            Integer[] evens = new Integer[count];
            int x = 0;
            for (int k = 0; k < ints.length - 1; k++) {
                if (ints[k] % 2 != 0) {


                evens[x] = ints[k];
                x++;



            }

        }return evens;
    }

        /**
         * @param ints array of Integer objects
         * @return all ints which are divisible by 2
         * given an array of integers, named `ints` return an identical array with odds removed
         */
        public Integer[] deleteOdds (Integer[]ints){

            int count = 0;

            for (int i = 0; i < ints.length ; i++) {
                if (ints[i] % 2 == 0) {
                    count++;
                }
            }

            Integer[] odds = new Integer[count];
            int x = 0;
            for (int k = 0; k < ints.length; k++) {
                if (ints[k] % 2 == 0) {


                    odds[x] = ints[k];
                    x++;



                }

            }return odds;

        }

        /**
         * @param ints array of Integer objects
         * @return all ints which are not divisible by 3
         * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
         */
        public Integer[] deleteMultiplesOf3 (Integer[]ints){

            int count = 0;

            for (int i = 0; i < ints.length ; i++) {
                if (ints[i] % 3 != 0) {
                    count++;
                }
            }

            Integer[] three = new Integer[count];
            int x = 0;
            for (int k = 0; k < ints.length; k++) {
                if (ints[k] % 3 != 0) {


                    three[x] = ints[k];
                    x++;



                }

            }return three;


        }

        /**
         * @param ints array of Integer objects
         * @param multiple the multiple to evaluate divisibility against
         * @return all ints which are not divisible by the `multiple` specified
         * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
         */
        public Integer[] deleteMultiplesOfN (Integer[]ints,int multiple){

            int count = 0;

            for (int i = 0; i < ints.length ; i++) {
                if (ints[i] % multiple != 0) {
                    count++;
                }
            }

            Integer[] n = new Integer[count];
            int x = 0;
            for (int k = 0; k < ints.length; k++) {
                if (ints[k] % multiple != 0) {


                    n[x] = ints[k];
                    x++;



                }

            }return n;


        }

}
