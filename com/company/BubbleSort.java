package com.company;

public class BubbleSort implements Sort {


    @Override
    public double sort(int[] tab) {
        long tStart = System.currentTimeMillis();
        int n = tab.length;
        for(int i = 0; i < n-1; i++){
            for(int j =0; j < n-i-1; j++){
                if(tab[j] > tab[j+1]){
                    int tmp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = tmp;
                }
            }
        }
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        double elapsedSeconds = tDelta / 1000.0;
        return elapsedSeconds;
    }

}
