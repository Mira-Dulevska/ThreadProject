package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	    ProductThread guess = new ProductThread();
        ProductThread calvinKlein = new ProductThread();
        ProductThread trussardi = new ProductThread();
        guess.start();
        calvinKlein.start();
        trussardi.start();

        PriorityQueue<Product> pq = new PriorityQueue<>();

        guess.run("guess", pq);
        calvinKlein.run("calvinKlein", pq);
        trussardi.run("trussardi", pq);

        File file = new File("shoppingList.txt");
        if (file.exists()) {
            System.exit(1);
        }
        PrintWriter output = new PrintWriter(file);

        for(int i=0; i<10; i++){
            output.print(pq.poll());
        }
        output.close();
    }
}
