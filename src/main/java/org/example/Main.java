package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Generic sınıf örneği oluşturma
        GenericClass<String> stringGenericClass = new GenericClass<>("Hello, world!");
        GenericClass<Integer> integerGenericClass = new GenericClass<>(123);

        // Generic alanı yazdırma
        stringGenericClass.printValue(); // Output: Value: Hello, world!
        integerGenericClass.printValue(); // Output: Value: 123

        // Bir koleksiyonu ve bulunacak bir öğeyi kabul eden bir metod
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // Metod çağrısı
        int result = CollectionUtils.findElement(numbers, 3);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Found at index: " + result);
        }
    }
}