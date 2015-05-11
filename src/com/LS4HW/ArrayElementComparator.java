package com.LS4HW;

import java.util.Comparator;

public class ArrayElementComparator implements Comparator<ArrayElement> {

    @Override
    public int compare(ArrayElement element0, ArrayElement element1) {
        return element0.hashCode() - element1.hashCode();
    }
}
