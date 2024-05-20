package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ProductThread extends Thread{
    private String name;
    ProductThread(String name){
        super(name);
    }

    public ProductThread() {
    }

    public void run(String name, PriorityQueue<Product> pq){

        File file = new File("ThreadsExercises/" + name + ".txt");
        Scanner input = null;
        try {
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (input.hasNext()) {
            String name1 = input.next();
            String type = input.next();
            int price = input.nextInt();
            Product product = new Product(name1, type, price);
            pq.add(product);
        }

        input.close();
    }
}
