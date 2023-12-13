package scripts;

import java.util.Arrays;

public class MergeSort implements SortingAlgorithms {

    @Override
    public int[] sort(int[] dataSet) {
        mergeSort(dataSet, 0, dataSet.length - 1);
        return dataSet;
    }

    private void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    private void merge(int[] arr, int left, int middle, int right) {
        int[] leftArray = Arrays.copyOfRange(arr, left, middle + 1);
        int[] rightArray = Arrays.copyOfRange(arr, middle + 1, right + 1);

        int i = 0, j = 0, k = left;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftArray.length) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightArray.length) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}