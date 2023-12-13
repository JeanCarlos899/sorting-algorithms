package scripts;

public class BubbleSort implements SortingAlgorithms {
    @Override
    public int[] sort(int[] dataSet) {
        int[] sortedDataSet = dataSet.clone();

        for (int i = 0; i < sortedDataSet.length - 1; i++) {
            for (int j = 0; j < sortedDataSet.length - 1 - i; j++) {
                if (sortedDataSet[j] > sortedDataSet[j + 1]) {
                    int aux = sortedDataSet[j];
                    sortedDataSet[j] = sortedDataSet[j + 1];
                    sortedDataSet[j + 1] = aux;
                }
            }
        }
        return sortedDataSet;
    }
}