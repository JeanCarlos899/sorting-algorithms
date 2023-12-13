// Conjunto de dados: 100, 500, 1000, 5000, 30000, 80000, 10000, 150000 e 200000
// Algoritmos: Buble Sort, Selection Sort, Insertion Sort, Merge Sort, Quick Sort e Counting Sort

import scripts.BubleSort;
import scripts.CountingSort;
import scripts.InsertionSort;
import scripts.MergeSort;
import scripts.QuickSort;
import scripts.SelectionSort;
import scripts.SortingAlgorithms;
import util.GenerateData;

public class Main {
    public static void main(String[] args) {

        System.out.println("Selecione o tamanho do conjunto de dados:");
        int size = Integer.parseInt(System.console().readLine());

        int[] dataSet = GenerateData.generateRandomData(size);

        System.out.println("----------------------------------");
        System.out.println("Tempo de execução em milissegundos");
        System.out.println("----------------------------------");

        SortingAlgorithms bubleSort = new BubleSort();
        SortingAlgorithms selectionSort = new SelectionSort();
        SortingAlgorithms insertionSort = new InsertionSort();
        SortingAlgorithms mergeSort = new MergeSort();
        SortingAlgorithms quickSort = new QuickSort();
        SortingAlgorithms countingSort = new CountingSort();

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
        algorithm.sort(dataSet);
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        double timeElapsedInMs = timeElapsed / 1_000_000.0;

        System.out.printf("[%-13s] %f ms%n", algorithmName, timeElapsedInMs);
    }
}