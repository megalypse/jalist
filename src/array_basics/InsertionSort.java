package array_basics;

import java.util.List;

public class InsertionSort extends Move {
    public void sort(List<Integer> listToSort) {
        for (var i = 1; i < listToSort.size(); i++) {
            for (var j = 0; j <= i; j ++) {
                if (listToSort.get(i) < listToSort.get(j)) {
                    move(listToSort, i, j);
                }
            }
        }
    }

    public Integer module(Integer number) {
        if (number < 0) {
            return number * (-1);
        }

        return number;
    }
}
