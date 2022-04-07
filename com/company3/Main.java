package com.company3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static int[] missingNum(List<Integer> a, int max){
        Collections.sort(a);
        List<Integer> missingList = new ArrayList<>();
        for(int i = 0; i < max; i++){
            if(i >= a.size()){
                missingList.add(i+1);
            }
            else if(a.get(i) != i + 1){
                a.add(i, i + 1);
                missingList.add(i + 1);
            }
        }
        int[] tab = new int[missingList.size()];
        for(int i = 0; i < tab.length; i++){
            tab[i] = missingList.get(i);

        }
        return tab;
    }
    public static void zadanie(){
        List<Integer> lista = new ArrayList<>(Arrays.asList(9, 3, 1, 5, 8, 10));
        int max = 1;
        int[] tab = missingNum(lista,max);
        for(int i = 0; i < tab.length; i++)
            System.out.print(tab[i]+" ");
    }
    public static void main(String[] args) {
        zadanie();
    }
}
