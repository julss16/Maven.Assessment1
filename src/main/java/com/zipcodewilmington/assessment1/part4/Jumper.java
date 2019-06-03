package com.zipcodewilmington.assessment1.part4;


public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int flagHeight, int jumpHeight){


        int k = flagHeight;
        int j = jumpHeight;


        int jumps = (int) Math.ceil(k/j);

        return jumps;

    }
}








