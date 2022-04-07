package com.company;

public class ShellSort implements Sort {

    @Override
    public double sort(int[] tab) {
        long tStart = System.currentTimeMillis();
        int n = tab.length;

        for (int gap = n/2; gap > 0; gap /= 2)
        {

            for (int i = gap; i < n; i += 1)
            {

                int temp = tab[i];

                int j;
                for (j = i; j >= gap && tab[j - gap] > temp; j -= gap)
                    tab[j] = tab[j - gap];

                tab[j] = temp;
            }
        }
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        double elapsedSeconds = tDelta / 1000.0;
        return elapsedSeconds;
    }
}
