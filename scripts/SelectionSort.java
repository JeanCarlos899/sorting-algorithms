package scripts;

public class SelectionSort implements SortingAlgorithms {
    @Override
    public int[] sort(int[] dataSet) {
        int n = dataSet.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (dataSet[j] < dataSet[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = dataSet[minIndex];
            dataSet[minIndex] = dataSet[i];
            dataSet[i] = temp;
        }

        return dataSet;
    }
}
