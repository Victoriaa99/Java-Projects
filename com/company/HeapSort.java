package com.company;

public class HeapSort implements Sort {

    @Override
    public double sort(int[] tab) {
        long tStart = System.currentTimeMillis();
        int n = tab.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(tab, n, i);

        for (int i = n - 1; i > 0; i--) {

            int temp = tab[0];
            tab[0] = tab[i];
            tab[i] = temp;

            heapify(tab, i, 0);
        }
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        double elapsedSeconds = tDelta / 1000.0;
        return elapsedSeconds;
    }


    void heapify(int tab[], int n, int i)
    {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;


        if (l < n && tab[l] > tab[largest])
            largest = l;


        if (r < n && tab[r] > tab[largest])
            largest = r;


        if (largest != i) {
            int swap = tab[i];
            tab[i] = tab[largest];
            tab[largest] = swap;


            heapify(tab, n, largest);
        }


    }

    }

