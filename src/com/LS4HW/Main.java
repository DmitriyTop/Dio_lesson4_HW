package com.LS4HW;

public class Main {
    private static int[] leftArray = {1,5,4,23,65,32,78};
    private static int[] rightArray = {3,5,24,4,1,2,34,45,32,5};

    public static void main(String[] args) {
        ArrayElement[] objectLeftArray = generateObjectArray(leftArray);
        ArrayElement[] objectRightArray = generateObjectArray(rightArray);

        System.out.println("Left array: ");
        printObjectArray(objectLeftArray);
        System.out.println("Right array: ");
        printObjectArray(objectRightArray);

        ArrayOperations arrayOperations = new ArrayOperations();

        ArrayElement[] objectMergeArrayResult = arrayOperations.mergeArrays(objectLeftArray, objectRightArray);
        System.out.println("Merged array: ");
        printObjectArray(objectMergeArrayResult);

        ArrayElement[] objectInnerUnionArrayResult = arrayOperations.innerUnionArrays(objectLeftArray, objectRightArray);
        System.out.println("InnerUnion array: ");
        printObjectArray(objectInnerUnionArrayResult);

        ArrayElement[] objectOuterUnionArrayResult = arrayOperations.outerUnionArrays(objectLeftArray, objectRightArray);
        System.out.println("OuterUnion array: ");
        printObjectArray(objectOuterUnionArrayResult);

    }

    /* array generation method implementation */
    public static ArrayElement[] generateObjectArray (int[] intArray) {
        if (intArray == null) {
            throw new MyException("intArray is NULL.");
        }
        ArrayElement[] objectArray = new ArrayElement[intArray.length]; // create our array of objects
        for (int i = 0; i < intArray.length; i++) {                     // cycle to define every array element
            objectArray[i] = new ArrayElement("Index " + i, intArray[i]);                        // define type of element as object-type
//            objectArray[i].setElementName(String.valueOf(intArray[i])); // redefine Name as String from int array
//            objectArray[i].setElementValue(intArray[i]);                // assign name to array object
        }
        return objectArray;
    }

    /* array output method implementation */
    public static void printObjectArray(ArrayElement[] objectArray) {
        System.out.print("{ ");
        for (ArrayElement value: objectArray) {
            System.out.print(value.getElementValue());
            System.out.print(" ");
        }
        System.out.println("}");
    }
}
