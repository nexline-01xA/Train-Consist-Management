package com.train.app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Bogie class
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " -> " + capacity;
    }
}

public class UseCase7TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("   Train Consist Management App 🚆");
        System.out.println("=======================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // Sort by capacity (ascending)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display sorted bogies
        System.out.println("Bogies sorted by capacity:\n");

        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nApplication Running...");
    }
}