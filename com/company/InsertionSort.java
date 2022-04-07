package com.company;

public class InsertionSort implements Sort{

    @Override
    public double sort(int[] tab){
        long tStart = System.currentTimeMillis();
            int n = tab.length;
            for (int i = 1; i < n; ++i) {
                int key = tab[i];
                int j = i - 1;

                while (j >= 0 && tab[j] > key) {
                    tab[j + 1] = tab[j];
                    j = j - 1;
                }
                tab[j + 1] = key;
            }
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        double elapsedSeconds = tDelta / 1000.0;
        return elapsedSeconds;
    }
}
