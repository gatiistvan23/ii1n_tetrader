package com.example;

public class StoreSqlite implements Store {

    @Override
    public void storeContent(double area) {
        System.out.println("Tárolás Sqlite-ban...");
    }
    
}
