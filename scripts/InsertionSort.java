package scripts;

public class InsertionSort implements SortingAlgorithms {
    @Override
    public int[] sort(int[] dataSet) {
        int[] sortedDataSet = dataSet.clone();
        int n = sortedDataSet.length;

        for (int i = 1; i < n; i++) {
            int key = sortedDataSet[i];
            int j = i - 1;

            while (j >= 0 && sortedDataSet[j] > key) {
                sortedDataSet[j + 1] = sortedDataSet[j];
                j = j - 1;
            }

            sortedDataSet[j + 1] = key;
        }
        return sortedDataSet;
    }
}
