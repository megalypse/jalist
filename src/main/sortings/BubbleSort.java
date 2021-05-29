package main.sortings;

import main.contracts.Sorter;
import main.array_basics.ArrayBasics;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort extends ArrayBasics implements Sorter {
    @Override
    public void sort(List<Integer> list) {
        for (var j = 0; j < list.size(); j++) {
            for (var i = 0; i < list.size(); i++) {
                if ((i < list.size() - 1) && (list.get(i + 1) < list.get(i))) {
                    swap(list, i);
                }
            }
        }
    }

    public void recursiveSort(List<Integer> list) {
        var swapped = false;
        for (var i = 0; i < list.size(); i++) {
            if (i < list.size() - 1 && list.get(i + 1) < list.get(i)) {
                swapped = true;
                move(list, (i + 1), i);
            }
        }

        if (swapped) {
            recursiveSort(list);
        }
    }

    public static void main(String[] args) {
        var list = new ArrayList<>(List.of(7, 533, 101, 3, 2, 1, 99));

        new BubbleSort().recursiveSort(list);

        System.out.println(list);
    }
}
