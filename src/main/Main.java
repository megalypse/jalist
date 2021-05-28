package main;

import array_basics.InsertionSort;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var sorter = new InsertionSort();
        List<Integer> numbers = new ArrayList<>(List.of(1098273,9, 6, 5, 0, 8, 2, 7, 1, 3, 4, 999));

        sorter.sort(numbers);

        System.out.printf(numbers.toString());
    }
}
