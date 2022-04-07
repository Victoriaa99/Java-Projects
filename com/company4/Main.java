package com.company4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void reorderDigits(int[] tab, String s){
        //515, 341, 98, 44, 211
        String current;
        List<Integer> lista = new ArrayList<>();
        for(int i = 0; i < tab.length; i++){
            current = String.valueOf(tab[i]); //"551"
            for(int j = 0; j < current.length(); j++) {
                lista.add(Character.getNumericValue(current.charAt(j))); //current.charAt(j) = '5'
            }
            //lista = [5, 1, 5]
            if(s.equals("asc"))
                Collections.sort(lista); //lista = [1, 5, 5]
            else if(s.equals("desc")){
                Collections.sort(lista);    //lista = [1, 5, 5]
                Collections.reverse(lista); //lista = [5, 5, 1]
            }
            tab[i] = 0;
            int pom = lista.size()-1;
            for(int k = 0; k < lista.size(); k++){
                tab[i] += lista.get(k)*Math.pow(10, pom); // (1) tab[i] = 5 * 10^2    (2)  tab[i] = 5 * 10^2+ 5 * 10^1
                pom--;
            }
            lista.clear();
        }


    }
    public static void printArray(int[] tab){
        for(int i = 0; i < tab.length; i++) {
            if (i == tab.length - 1)
                System.out.print(tab[i] + " ");
            else
                System.out.print(tab[i] + ", ");
        }
        System.out.println();

    }
    public static void zadanie(){
        int[] tab = {515, 341, 98, 44, 211};
        reorderDigits( tab, "asc");
        printArray(tab);
        reorderDigits(tab, "desc");
        printArray(tab);
        int[] tab2 = {63251, 78221};
        reorderDigits(tab2, "asc");
        printArray(tab2);
        reorderDigits(tab2, "desc");
        printArray(tab2);
    }
    public static void main(String[] args) {
        zadanie();
    }

}
