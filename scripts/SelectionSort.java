package scripts;

public class SelectionSort implements SortingAlgorithms {
    @Override
    public int[] sort(int[] dataSet) {
        
        int[] sortedDataSet = dataSet.clone();
        int n = dataSet.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (sortedDataSet[j] < sortedDataSet[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = sortedDataSet[minIndex];
            sortedDataSet[minIndex] = sortedDataSet[i];
            sortedDataSet[i] = temp;
        }

        return sortedDataSet;
    }
}
