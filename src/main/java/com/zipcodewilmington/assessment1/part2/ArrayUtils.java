package com.zipcodewilmington.assessment1.part2;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {

        int count = 0;
        for (int i = 0; i < objectArray.length; i++) {

            if (objectToCount.equals(objectArray[i])) {
                count++;
            }
        }
        return count;
    }


    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {

        int n = (int) objectToRemove;
        //Object[] newArray = new Object[objectArray.length];
        for (int i = 1; i < objectArray.length - 1; i++) {

            if (objectArray[i] != objectArray[n+1]) {

                objectArray[i] = objectArray[i];
            } //else if (objectArray[i] == objectArray[n]) {




        }
        return objectArray;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        int count = 1, tempCount;
        int common = (int) objectArray[0];
        int temp = 0;

        for (int i = 0; i < objectArray.length - 1; i++) {

            temp = (int) objectArray[i];
            tempCount = 0;
            for (int n = 1; n < objectArray.length; n++) {
                if (temp == (int) objectArray[n]) {
                    tempCount++;
                }
                if (tempCount > count) {
                    common = temp;
                    count = tempCount;
                }

            }

        }

        return common;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        int count = 1, tempCount;
        int least = (int) objectArray[0];
        int temp = 0;

        for (int i = 0; i < objectArray.length - 1; i++) {

            temp = (int) objectArray[i];
            tempCount = 0;
            for (int n = 1; n < objectArray.length; n++) {
                if (temp == (int) objectArray[n]) {
                    tempCount++;
                }
                if (tempCount < count) {
                    least = temp;
                    count = tempCount;
                }

            }

        }
        return least;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {

        Object[] concat= new Object [0];
              concat=  ArrayUtils.mergeArrays(concat, objectArray);
              concat=  ArrayUtils.mergeArrays(concat, objectArrayToAdd);

        return concat;
    }

}


