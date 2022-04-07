package com.comapny5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static int reorderDigits(int num, String s){
        //515
        String current;
        List<Integer> lista = new ArrayList<>();
        current = String.valueOf(num); //"515"
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
        num = 0;
        int pom = lista.size()-1;
        for(int k = 0; k < lista.size(); k++){
            num += lista.get(k)*Math.pow(10, pom); // (1) tab[i] = 5 * 10^2    (2)  tab[i] = 5 * 10^2+ 5 * 10^1
            pom--;
        }
        lista.clear();
        return num;

    }
    public static int kaprekar(int a){
        int counter=0;
        int ros;
        int mal;
        while(a != 6174){
            while(a < 1000)
                a *= 10;
            ros = reorderDigits(a, "asc");
            mal = reorderDigits(a, "desc");
            System.out.println("od "+a+" do "+mal+" - "+ros);
            a = mal - ros;
            counter++;
        }
        return counter;

    }
    public static void main(String[] args) {
        System.out.println(kaprekar(100));
    }
}
