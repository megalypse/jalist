package array_basics;

import java.util.List;

public class InsertAt {
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
}
