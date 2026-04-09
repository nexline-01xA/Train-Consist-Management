package com.train.app;

import java.util.LinkedHashSet;

public class UseCase5TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("   Train Consist Management App 🚆");
        System.out.println("=======================================\n");

        // Create LinkedHashSet for train formation
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Attempt duplicate
        train.add("Sleeper");

        // Display final formation
        System.out.println("Final Train Formation (Insertion Order Preserved):");
        System.out.println(train);

        System.out.println("\nTotal bogies: " + train.size());

        System.out.println("\nApplication Running...");
    }
}