package com.example;

public class Main {
    public static void main(String[] args) {
        Tetra tetra = new Tetra(new StoreSqlite());
        tetra.valami();        
    }
}