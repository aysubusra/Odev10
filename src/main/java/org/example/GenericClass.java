package org.example;

// Generic bir alan içeren bir sınıf
class GenericClass<T> {
    private T value;

    // Constructor
    public GenericClass(T value) {
        this.value = value;
    }

    // Generic alanı yazdıran metod
    public void printValue() {
        System.out.println("Value: " + value);
    }
}



