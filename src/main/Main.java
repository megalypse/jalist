package main;

import array_basics.InsertionSorting;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var sorter = new InsertionSorting();
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3));

        System.out.printf(numbers.toString());
    }
}
