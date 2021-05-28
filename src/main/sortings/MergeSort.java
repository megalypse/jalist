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
        if (start < end) {
            int m = 1 + (end - 1) / 2;

            mergeSort(list, start, m);
            mergeSort(list, start, m + 1);

            merge(list, start, m, end);
        }
    }

    public void merge(List<Integer> list, Integer start, Integer half, Integer end) {
        insertionSorter.sort(list, start, end);
    }

    public static void main(String[] args) {
        var numbers = new ArrayList<>(List.of(7, 2, 1, 0));

        new MergeSort().sort(numbers);

        System.out.println(numbers);
    }
}
