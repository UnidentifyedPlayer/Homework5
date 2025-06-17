package ru.aston.hometask.task5.strategy.strategies;

import ru.aston.hometask.task5.strategy.SortingStrategy;

public class MergeSortStrategy implements SortingStrategy {

    void merge(int[] array, int start, int middle, int end) {

        int leftCount = middle - start + 1;
        int rightCount = end - middle;
        int[] leftArray = new int[leftCount];
        int[] rightArray = new int[rightCount];

        System.arraycopy(array, start, leftArray, 0, leftCount);
        System.arraycopy(array, middle + 1, rightArray, 0, rightCount);

        int leftIndex = 0, rightIndex = 0;
        int arrayIndex = start;

        while (leftIndex < leftCount && rightIndex < rightCount) {
            if (leftArray[leftIndex] <= rightArray[rightIndex]) {
                array[arrayIndex] = leftArray[leftIndex];
                leftIndex++;
            } else {
                array[arrayIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            arrayIndex++;
        }

        while (leftIndex < leftCount) {
            array[arrayIndex] = leftArray[leftIndex];
            leftIndex++;
            arrayIndex++;
        }
        while (rightIndex < rightCount) {
            array[arrayIndex] = rightArray[rightIndex];
            rightIndex++;
            arrayIndex++;
        }
    }

    void sort(int[] array, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            sort(array, start, middle);
            sort(array, middle + 1, end);
            merge(array, start, middle, end);
        }
    }

    @Override
    public void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }
}
