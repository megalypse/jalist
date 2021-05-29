package main.sortings;

import main.contracts.Sorter;
import main.array_basics.ArrayBasics;

import java.util.ArrayList;
import java.util.List;

public class SelectionSorting extends ArrayBasics implements Sorter {
    public void sort(List<Integer> targetList) {
        final int size = targetList.size();

        for (var i = 0; i < size; i++) {
            var minimumIndex = findMinimum(targetList, i, (size - 1));
            move(targetList, minimumIndex, i);
        }
    }

    public static void main(String[] args) {
        var list = new ArrayList<>(List.of(833, 5, 3, 4, 2, 1, 99));
        var sorter = new SelectionSorting();

        sorter.sort(list);

        System.out.println(list);
    }
}
