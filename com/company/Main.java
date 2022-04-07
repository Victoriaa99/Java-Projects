package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static int[] optimTab(){
        int n = 10000;
        int[] tab = new int[n];
        for(int i = 0; i < n; i++){
            tab[i] = i;
        }
        return tab;
    }
    public static int[] pesymTab(){
        int n = 10000;
        int[] tab = new int[n];
        for(int i = n - 1; i >= 0; i--){
            tab[i] = i;
        }
        return tab;
    }
    public static int[] randomTab(){
        int n = 10000;
        int[] tab = new int[n];
        Random random = new Random();
        for(int i = 0; i < n; i++){
            tab[i] = random.nextInt(n);




        }
        return tab;
    }
    public static void zadanie(){
        double czas;
        int[] rTab = randomTab();
        int[] copyOfrTab = Arrays.copyOf(rTab, rTab.length);
        //Bubble Sort
        Sortowania lab = new Sortowania(new BubbleSort());
        System.out.println("Bubble sort");
        //Optymistyczna wersja
        czas = lab.sort(optimTab());
        System.out.println("Optymistyczna wersja: "+czas+"s");
        //Pesymistyczna wersja
        czas = lab.sort(pesymTab());
        System.out.println("Pesymistyczna wersja: "+czas+"s");
        //Oczekiwana wersja
        czas = lab.sort(copyOfrTab);
        System.out.println("Oczekiwana wersja: "+czas+"s");

        //Zmiana strategii
        lab.zmienStrategie(new SelectionSort());
        copyOfrTab = Arrays.copyOf(rTab, rTab.length);

        //Selection Sort
        System.out.println("Selection sort");
        //Optymistyczna wersja
        czas = lab.sort(optimTab());
        System.out.println("Optymistyczna wersja: "+czas+"s");
        //Pesymistyczna wersja
        czas = lab.sort(pesymTab());
        System.out.println("Pesymistyczna wersja: "+czas+"s");
        //Oczekiwana wersja
        czas = lab.sort(copyOfrTab);
        System.out.println("Oczekiwana wersja: "+czas+"s");

        //Zmiana strategii
        lab.zmienStrategie(new InsertionSort());
        copyOfrTab = Arrays.copyOf(rTab, rTab.length);

        //Insertion Sort
        System.out.println("Insertion sort");
        //Optymistyczna wersja
        czas = lab.sort(optimTab());
        System.out.println("Optymistyczna wersja: "+czas+"s");
        //Pesymistyczna wersja
        czas = lab.sort(pesymTab());
        System.out.println("Pesymistyczna wersja: "+czas+"s");
        //Oczekiwana wersja
        czas = lab.sort(copyOfrTab);
        System.out.println("Oczekiwana wersja: "+czas+"s");

        //Zmiana strategii
        lab.zmienStrategie(new ShellSort());
        copyOfrTab = Arrays.copyOf(rTab, rTab.length);

        //Shell Sort
        System.out.println("Shell sort");
        //Optymistyczna wersja
        czas = lab.sort(optimTab());
        System.out.println("Optymistyczna wersja: "+czas+"s");
        //Pesymistyczna wersja
        czas = lab.sort(pesymTab());
        System.out.println("Pesymistyczna wersja: "+czas+"s");
        //Oczekiwana wersja
        czas = lab.sort(copyOfrTab);
        System.out.println("Oczekiwana wersja: "+czas+"s");

        //Zmiana strategii
        lab.zmienStrategie(new HeapSort());
        copyOfrTab = Arrays.copyOf(rTab, rTab.length);

        //Heap Sort
        System.out.println("Heap sort");
        //Optymistyczna wersja
        czas = lab.sort(optimTab());
        System.out.println("Optymistyczna wersja: "+czas+"s");
        //Pesymistyczna wersja
        czas = lab.sort(pesymTab());
        System.out.println("Pesymistyczna wersja: "+czas+"s");
        //Oczekiwana wersja
        czas = lab.sort(copyOfrTab);
        System.out.println("Oczekiwana wersja: "+czas+"s");






    }

    public static void main(String[] args) {
        zadanie();
    }
}
