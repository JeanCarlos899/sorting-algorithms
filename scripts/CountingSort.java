package scripts;

public class CountingSort implements SortingAlgorithms {
    @Override
    public int[] sort(int[] dataSet) {
        countingSort(dataSet);
        return dataSet;
    }

    private void countingSort(int[] arr) {
        int n = arr.length;

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] count = new int[max + 1];

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }
}
