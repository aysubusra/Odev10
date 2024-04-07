package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Generic sınıf örneği oluşturma
        GenericClass<String> stringGenericClass = new GenericClass<>("Hello, world!");
        GenericClass<Integer> integerGenericClass = new GenericClass<>(123);

        // Generic alanı yazdırma
        stringGenericClass.printValue(); // Output: Value: Hello, world!
        integerGenericClass.printValue(); // Output: Value: 123

        // Bir koleksiyonu ve bulunacak bir öğeyi kabul eden bir metod
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Optional<Integer> result = findElement(numbers, 3);
        result.ifPresentOrElse(
                value -> System.out.println("Found: " + value),
                () -> System.out.println("Element not found")
        );
    }

    // Bir koleksiyonu ve bulunacak bir öğeyi kabul eden bir metod
    public static <T> Optional<T> findElement(List<T> list, T element) {
        return list.stream()
                .filter(e -> e.equals(element))
                .findFirst();
    }
}