package main.sortings;

import main.contracts.Sorter;
import main.array_basics.ArrayBasics;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort extends ArrayBasics implements Sorter {
    public void sort(List<Integer> listToSort) {
        for (var i = 1; i < listToSort.size(); i++) {
            for (var j = 0; j <= i; j ++) {
                if (listToSort.get(i) < listToSort.get(j)) {
                    move(listToSort, i, j);
                }
            }
        }
    }

    public void sort(List<Integer> listToSort, Integer start, Integer end) {
        for (var i = start; i <= end; i++) {
            for (var j = 0; j <= i; j ++) {
                if (listToSort.get(i) < listToSort.get(j)) {
                    move(listToSort, i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        var sorter = new InsertionSort();
        List<Integer> numbers = new ArrayList<>(List.of(1098273,9, 6, 5, 0, 8, 2, 7, 1, 3, 4, 999));

        sorter.sort(numbers, 0, 0);

        System.out.print(numbers.toString());
    }
}
