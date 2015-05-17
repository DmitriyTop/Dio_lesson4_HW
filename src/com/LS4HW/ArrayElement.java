package com.LS4HW;

public class ArrayElement {

    //local code review (vtegza): try with final fields @ 11.05.15
    private final String elementName;
    private final int elementValue;

    public ArrayElement(String elementName, int elementValue) {
        this.elementName = elementName;
        this.elementValue = elementValue;
    }

    public String getElementName() {
        return elementName;
    }
//    public void setElementName(String elementName) {
//        this.elementName = elementName;
//    }
    public int getElementValue() {
        return elementValue;
    }
//    public void setElementValue(int elementValue) {
//        this.elementValue = elementValue;
//    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArrayElement that = (ArrayElement) o;

        if (elementValue != that.elementValue) return false;
        //return !(elementName != null ? !elementName.equals(that.elementName) : that.elementName != null);
        return getElementName().equals(that.getElementName());
    }
    @Override
    public int hashCode() {
        int result = elementName != null ? elementName.hashCode() : 0;
        result = 31 * result + elementValue;
        return result;
    }
}
