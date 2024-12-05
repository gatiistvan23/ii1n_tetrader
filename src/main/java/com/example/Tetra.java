package com.example;

public class Tetra {  
    final int MAX = 35;
    public double volume;
    private double area;
    Store store;
    public Tetra(Store store) {
        this.store = store;
    }
        

    public double calcVolume(double area, double height) {
        return area * height / 3;
    } 
    public void valami() {
        /*
            StoreFile store = new StoreFile();
            store.storeFile(30);
        */
        store.storeContent(30);
    }   
}
