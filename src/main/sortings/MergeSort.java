package main.sortings;

import main.contracts.Sorter;
import main.jalist.ArrayBasics;

import java.util.ArrayList;
import java.util.List;

public class MergeSort extends ArrayBasics implements Sorter {
    private static final InsertionSort insertionSorter = new InsertionSort();

    @Override
    public void sort(List<Integer> list) {
        var lastIndex = list.size() - 1;
        mergeSort(list, 0, lastIndex);
    }

    public void mergeSort(List<Integer> list, Integer start, Integer end) {
        if (end > start) {
            var half = (start + end) / 2;

            mergeSort(list, start, half);
            mergeSort(list, (half + 1), end);

            merge(list, start, end);
        }
    }

    public void merge(List<Integer> list, Integer start, Integer end) {
        if (start > 0) {
            insertionSorter.sort(list, (start - 1), end);
        } else {
            insertionSorter.sort(list, start, end);
        }
    }

    public static void main(String[] args) {
        var numbers = new ArrayList<>(List.of(1523, 2725, 999, 1, 12, 11, 13, 5, 6, 799999));

        new MergeSort().sort(numbers);

        System.out.println(numbers);
    }
}
