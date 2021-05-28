package array_basics;

import java.util.List;

public class Move extends InsertAt {
    public void move(List<Integer> targetList, Integer from, Integer to) {
            var value = targetList.get(from);
            targetList.remove(value);

            insertAt(targetList, value, to);
    }
}
