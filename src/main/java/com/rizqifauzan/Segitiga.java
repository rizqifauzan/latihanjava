package com.rizqifauzan;

public class Segitiga {
    private int alas;
    private int tinggi;

    public Segitiga() {
    }

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getLuas(){
        return this.alas * this.tinggi / 2f;
    }
}
