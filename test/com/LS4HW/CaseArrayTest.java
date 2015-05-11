package com.LS4HW;

import org.junit.Assert;
import org.junit.Test;

public class CaseArrayTest {
    private static int[] leftArray = {1,5,4,23,65,32,78};
    private static int[] rightArray = {3,5,24,4,1,2,34,45,32,5};

    @Test
    public void testLeftArray() {
        ArrayElement[] objectLeftArray = Main.generateObjectArray(leftArray);
        Assert.assertNotEquals(objectLeftArray.length, 0);
        Assert.assertNotNull(objectLeftArray);
    }

    @Test
    public void testRightArray() {
        ArrayElement[] objectRightArray = Main.generateObjectArray(rightArray);
        Assert.assertNotEquals(objectRightArray.length, 0);
        Assert.assertNotNull(objectRightArray);
    }

    @Test
    public void testDublicatElements() {
        ArrayElement[] objectLeftArray = Main.generateObjectArray(leftArray);
        ArrayElement[] objectRightArray = Main.generateObjectArray(rightArray);

        ArrayOperations testingArrays = new ArrayOperations();
        ArrayElement[] objectResultArray = testingArrays.mergeArrays(objectLeftArray, objectRightArray);
        for (int i = 1; i < objectResultArray.length; i++) {
            Assert.assertNotEquals(objectResultArray[i-1], objectResultArray[i]);
        }
    }

}
