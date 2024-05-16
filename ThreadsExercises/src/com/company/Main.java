package com.company;

public class Main {

    public static void main(String[] args) {
	    ProductThread guess = new ProductThread();
        ProductThread calvinKlein = new ProductThread();
        ProductThread trussadi = new ProductThread();
        guess.start();
        calvinKlein.start();
        trussadi.start();

    }
}
