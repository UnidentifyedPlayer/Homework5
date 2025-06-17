import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.aston.hometask.task5.strategy.SortingContext;
import ru.aston.hometask.task5.strategy.strategies.BubbleSortStrategy;
import ru.aston.hometask.task5.strategy.strategies.MergeSortStrategy;
import ru.aston.hometask.task5.strategy.strategies.QuickSortStrategy;

import java.util.Arrays;

public class StrategyTests {

    @Test
    public void SortingStrategyTest() {

        int[] unsortedArray = {5, 2, 9, 1, 5};
        int arrayLength = unsortedArray.length;
        int[] sortedArray = Arrays.stream(unsortedArray).sorted().toArray();
        int[] tempArray = new int[arrayLength];

        SortingContext sortingContext = new SortingContext(new BubbleSortStrategy());
        System.arraycopy(unsortedArray, 0, tempArray, 0, arrayLength);
        sortingContext.performSort(tempArray);
        Assertions.assertArrayEquals(tempArray, sortedArray);

        sortingContext = new SortingContext(new QuickSortStrategy());
        System.arraycopy(unsortedArray, 0, tempArray, 0, arrayLength);
        sortingContext.performSort(tempArray);
        Assertions.assertArrayEquals(tempArray, sortedArray);

        sortingContext = new SortingContext(new MergeSortStrategy());
        System.arraycopy(unsortedArray, 0, tempArray, 0, arrayLength);
        sortingContext.performSort(tempArray);
        Assertions.assertArrayEquals(tempArray, sortedArray);
    }
}
