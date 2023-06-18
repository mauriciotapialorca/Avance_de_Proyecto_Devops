package com.kibernumacademy.miapp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static int calculateSum(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n * 2)
                .sum();
    }

    public static List<String> convertToUpperCase(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("La suma es: " + calculateSum(numbers));

        List<String> strings = Arrays.asList("hola", "mundo", "java", "8");
        System.out.println("Las palabras en mayúsculas son: " + convertToUpperCase(strings));
    }
}




import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
   
    @Test
    void testCalculateSum() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(60, App.calculateSum(numbers));
    }

    @Test
    void testConvertToUpperCase() {
        List<String> strings = Arrays.asList("hola", "mundo", "java", "8");
        assertEquals(Arrays.asList("HOLA", "MUNDO", "JAVA", "8"), App.convertToUpperCase(strings));
    }
}
