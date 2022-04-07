package com.company;

public class SelectionSort implements Sort {


    @Override
    public double sort(int[] tab) {
        long tStart = System.currentTimeMillis();
        int n = tab.length;

        for (int i = 0; i < n-1; i++)
        {

            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (tab[j] < tab[min_idx])
                    min_idx = j;

            int temp = tab[min_idx];
            tab[min_idx] = tab[i];
            tab[i] = temp;
        }
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        double elapsedSeconds = tDelta / 1000.0;
        return elapsedSeconds;

    }
}
