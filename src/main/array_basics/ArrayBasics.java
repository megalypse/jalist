package main.array_basics;

import java.util.List;

public class ArrayBasics {
    // O(N)
    /**
     * This function inserts the received value in the given index, moving all positions bigger than or equal the
     * received index to the right.
     * */
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
    /**
     * This function remove and store the value at the 'from' index, and use the {@link ArrayBasics} insertAt method
     * to insert the stored value in the 'to' index.
     *
     * @param targetList the list that contains the elements to be manipulated
     * @param from the index of the element that wil be moved
     * @param to the index to where the element will be moved
     * */
    public void move(List<Integer> targetList, Integer from, Integer to) {
        var value = targetList.get(from);
        targetList.remove(value);

        insertAt(targetList, value, to);
    }

    /**
     * Return the index of the minimum value found within the received list.
     *
     * @param targetList the list containing the elements to be evaluated
     * @param from the inclusive start of the range to be evaluated
     * @param to the inclusive end of the range to be evaluated
     * */
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
     * It swaps positions of the received index with the next index. This function does nothing if the received index
     * is equal or bigger than last index of the received list.
     *
     * @param list the list containing the target index
     * @param index the index to be position swapped with it's right neighbour
     * */
    public void swap(List<Integer> list, Integer index) {
        if (index < (list.size() - 1)) {
            var firstValue = list.get(index);
            list.set(index, list.get(index + 1));
            list.set((index + 1), firstValue);
        }
    }

    /**
     * Different from the swap method, this one exchange positions of indexes located anywhere in the received
     * list.
     *
     * @param list the list containing the received indexes
     * @param firstIndex the index of the value that will be stored in the position of the secondIndex
     * @param secondIndex the index of the value that will be stored in the position of the firtIndex
     */
    public void exchange(List<Integer> list, Integer firstIndex, Integer secondIndex) {
        var firstValue = list.get(firstIndex);
        var secondValue = list.get(secondIndex);

        list.set(firstIndex, secondValue);
        list.set(secondIndex, firstValue);
    }

    // O(n)
    /**
     * This function return the amount of items contained within the received range. Inclusive in both ends.
     */
    public Integer fromToLength(Integer from, Integer to) {
        var length = 0;

        for (var i = from; i <= to; i++) {
            length += 1;
        }

        return length;
    }
}
