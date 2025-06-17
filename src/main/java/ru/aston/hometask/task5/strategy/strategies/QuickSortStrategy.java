package ru.aston.hometask.task5.strategy.strategies;

import ru.aston.hometask.task5.strategy.SortingStrategy;

public class QuickSortStrategy implements SortingStrategy {

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int partition = (low - 1);
        for (int index = low; index < high; index++) {
            if (array[index] <= pivot) {
                partition++;
                int temp = array[partition];
                array[partition] = array[index];
                array[index] = temp;
            }
        }
        int temp = array[partition + 1];
        array[partition + 1] = array[high];
        array[high] = temp;

        return partition + 1;
    }

    public void sort(int[] array, int start, int end) {
        if (start < end) {
            int partition = partition(array, start, end);

            sort(array, start, partition - 1);
            sort(array, partition + 1, end);
        }
    }

    @Override
    public void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }
}
