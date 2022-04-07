package com.company;

public class Sortowania {
    private Sort strategia;

    public Sortowania(Sort strategia) {
        this.strategia = strategia;
    }
    public double sort(int[] tab){
        return strategia.sort(tab);
    }
    public void zmienStrategie(Sort innaStrategia){ // np gdy zmieniamy bubble sort na selection sort
        this.strategia = innaStrategia;
    }

}
