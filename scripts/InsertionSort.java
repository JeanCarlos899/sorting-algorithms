package scripts;

public class InsertionSort implements SortingAlgorithms {
    @Override
    public int[] sort(int[] dataSet) {
        int n = dataSet.length;

        for (int i = 1; i < n; i++) {
            int key = dataSet[i];
            int j = i - 1;

            while (j >= 0 && dataSet[j] > key) {
                dataSet[j + 1] = dataSet[j];
                j = j - 1;
            }

            dataSet[j + 1] = key;
        }
        return dataSet;
    }
}
