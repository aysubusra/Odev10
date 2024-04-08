package org.example;

import java.util.List;
import java.util.Optional;

class CollectionUtils {
    public static <T> int findElement(List<T> list, T element) {
        Optional<T> result = list.stream()
                .filter(e -> e.equals(element))
                .findFirst();
        return result.map(list::indexOf).orElse(-1);
    }
}