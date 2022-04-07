package com.company2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static int[] spot(List<Integer> a, int target){
        for(int i = 0; i < a.size()-1; i++){
            for(int j = i + 1; j < a.size(); j++){
                if(a.get(i) + a.get(j) == target){
                    return new int[] {i, j};
                }
            }

        }
        return new int[]{};
    }
    public static void zadanie(){
        List<Integer> lista = new ArrayList<>(Arrays.asList(9, 3, 1, 5, 8, 10));
        int target = 15;
        int[] tab = spot(lista, target);
        if(tab.length == 0){
            throw new IllegalArgumentException("Nie ma takich wartosci!");
        }
        System.out.println(tab[0]); //i
        System.out.println(tab[1]); //j
    }
    public static void main(String[] args) {
        zadanie();
    }
}
