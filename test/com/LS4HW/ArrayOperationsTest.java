package com.LS4HW;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ArrayOperationsTest {
    private static int[] leftArray = {1,5,4,23,65,32,78};
    private static int[] rightArray = {3,5,24,4,1,2,34,45,32,5};
    private static int[] mergeExpectedArray = {1,5,4,23,65,32,78,3,24,2,34,45};
    private static int[] innerUnionExpectedArray = {1,5,4,32};
    private static int[] outerUnionExpectedArray = {23,65,78,3,24,2,34,45};

    @Test
    public void testInnerUnion() throws Exception {
        // initialize variable inputs
        ArrayElement[] objectLeftArray = Main.generateObjectArray(leftArray);
        ArrayElement[] objectRightArray = Main.generateObjectArray(rightArray);
        ArrayElement[] objectInnerUnionExpectedArray = Main.generateObjectArray(innerUnionExpectedArray);

        // initialize class to test
        ArrayOperations testClass = new ArrayOperations();

        // invoke method on class to test
        ArrayElement[] returnedValue = testClass.innerUnionArrays(objectLeftArray, objectRightArray);

        // assert return value
        Arrays.sort(objectInnerUnionExpectedArray, new ArrayElementComparator());
        Arrays.sort(returnedValue, new ArrayElementComparator());

        assertArrayEquals(objectInnerUnionExpectedArray, returnedValue);

    }

    @Test
    public void testMerge() throws Exception {
        // initialize variable inputs
        ArrayElement[] objectLeftArray = Main.generateObjectArray(leftArray);
        ArrayElement[] objectRightArray = Main.generateObjectArray(rightArray);
        ArrayElement[] objectMergeExpectedArray = Main.generateObjectArray(mergeExpectedArray);

        // initialize class to test
        ArrayOperations testClass = new ArrayOperations();

        // invoke method on class to test
        ArrayElement[] returnedValue = testClass.mergeArrays(objectLeftArray, objectRightArray);

        // assert return value
        Arrays.sort(objectMergeExpectedArray, new ArrayElementComparator());
        Arrays.sort(returnedValue, new ArrayElementComparator());

        Assert.assertArrayEquals(objectMergeExpectedArray, returnedValue);
    }

    @Test
    public void testOuterUnion() throws Exception {
        // initialize variable inputs
        ArrayElement[] objectLeftArray = Main.generateObjectArray(leftArray);
        ArrayElement[] objectRightArray = Main.generateObjectArray(rightArray);
        ArrayElement[] objectOuterUnionExpectedArray = Main.generateObjectArray(outerUnionExpectedArray);

        // initialize class to test
        ArrayOperations testClass = new ArrayOperations();

        // invoke method on class to test
        ArrayElement[] returnedValue = testClass.outerUnionArrays(objectLeftArray, objectRightArray);

        // assert return value
        Arrays.sort(objectOuterUnionExpectedArray, new ArrayElementComparator());
        Arrays.sort(returnedValue, new ArrayElementComparator());

        Assert.assertArrayEquals(objectOuterUnionExpectedArray, returnedValue);
    }

    @Test
    public void testInnerUnionWithMyException() throws MyException {
        try {
        // initialize variable inputs
        ArrayElement[] objectLeftArray = Main.generateObjectArray(null);
        ArrayElement[] objectRightArray = Main.generateObjectArray(rightArray);
        ArrayElement[] objectInnerUnionExpectedArray = Main.generateObjectArray(innerUnionExpectedArray);

        //initialize class to test
        ArrayOperations testClass = new ArrayOperations();

        //invoke class to test
            testClass.innerUnionArrays(objectLeftArray, objectRightArray);
        }
        catch (MyException exception) {
            System.out.println("Caught NullPointerException because of: " + exception.getErrorCode());
        }
    }
}
