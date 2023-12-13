// Conjunto de dados: 100, 500, 1000, 5000, 30000, 80000, 10000, 150000 e 200000
// Algoritmos: Buble Sort, Selection Sort, Insertion Sort, Merge Sort, Quick Sort e Counting Sort

import scripts.*;
import util.GenerateData;

public class Main {
    public static void main(String[] args) {

        SortingAlgorithms bubleSort = new BubbleSort();
        SortingAlgorithms selectionSort = new SelectionSort();
        SortingAlgorithms insertionSort = new InsertionSort();
        SortingAlgorithms mergeSort = new MergeSort();
        SortingAlgorithms quickSort = new QuickSort();
        SortingAlgorithms countingSort = new CountingSort();

        int size = Integer.parseInt(System.console().readLine());
        int[] dataSet = GenerateData.generateRandomData(size);

        System.out.println("----------------------------------");
        System.out.println("Tempo de execução em milissegundos");
        System.out.println("----------------------------------");

        runTest(dataSet, bubleSort);
        runTest(dataSet, selectionSort);
        runTest(dataSet, insertionSort);
        runTest(dataSet, mergeSort);
        runTest(dataSet, quickSort);
        runTest(dataSet, countingSort);

        System.out.println("----------------------------------");
    }

    public static void runTest(int[] dataSet, SortingAlgorithms algorithm) {
        String algorithmName = algorithm.getClass().getSimpleName();
        long startTime = System.nanoTime();
        algorithm.sort(dataSet.clone());
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        double timeElapsedInMs = timeElapsed / 1_000_000.0;

        System.out.printf("[%-13s] %.3f ms%n", algorithmName, timeElapsedInMs);
    }
}