package sorting;

import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        String[] algos = {"hello", "test"};
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(120);
        }
        GUI g = new GUI(algos, arr);
        // Sorter ss = new SelectionSort(arr, g);
        Sorter ms = new MergeSort(arr, g);
        Thread.sleep(2000);
        ms.sort();
    }
}
