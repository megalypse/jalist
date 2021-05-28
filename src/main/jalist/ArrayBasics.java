package main.jalist;

import java.util.ArrayList;
import java.util.List;

public class ArrayBasics {
    // O(N)
    public void insertAt(List<Integer> targetList, Integer value, Integer index) {
        if (index > targetList.size()) {
            throw new IndexOutOfBoundsException("Unexistent received index");
        } else if (index == targetList.size()) {
            targetList.add(value);
        } else {
            var i = targetList.size() - 1;

            targetList.add(0);
            while (i >= index) {
                if (i == index) {
                    targetList.set(i + 1, targetList.get(i));
                    targetList.set(i, value);
                } else {
                    targetList.set(i + 1, targetList.get(i));
                }

                i--;
            }
        }

    }

    // O(N)
    public void move(List<Integer> targetList, Integer from, Integer to) {
        var value = targetList.get(from);
        targetList.remove(value);

        insertAt(targetList, value, to);
    }

    /**
     * Return the index of the minimum value found
     * */
    // O(N)
    public Integer findMinimum(List<Integer> targetList, Integer from, Integer to) {
        var minimum = from;

        for (var i = from; i <= to; i++) {
            if (targetList.get(i) < targetList.get(minimum)) {
                minimum = i;
            }
        }

        return minimum;
    }

    /**
     * It swaps the received index with the next index;
     * If the last index or bigger is received, the last item will be swapped with the penultimate one.
     * */
    public void swap(List<Integer> list, Integer index) {
        if (index >= (list.size() - 1)) {
            var last = list.size() - 1;
            var penultimate = last - 1;
            var firstValue = list.get(penultimate);

            list.set(penultimate, list.get(last));
            list.set(last, firstValue);
        } else {
            var firstValue = list.get(index);
            list.set(index, list.get(index + 1));
            list.set((index + 1), firstValue);
        }
    }

    public static void main(String[] args) {
        var number = new ArrayList<>(List.of(1, 2, 3));

        new ArrayBasics().swap(number, 2);

        System.out.println(number.toString());
    }
}
