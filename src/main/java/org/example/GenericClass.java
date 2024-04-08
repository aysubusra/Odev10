package org.example;

class GenericClass<T> {
    private final T value;

    // Constructor
    public GenericClass(T value) {
        this.value = value;
    }

    // Generic alanı yazdıran metod
    public void printValue() {
        System.out.println("Value: " + value);
    }
}