package com.train.app;

import java.util.ArrayList;
import java.util.List;

public class UseCase1TrainConsistApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=======================================");
        System.out.println("   Train Consist Management App 🚆");
        System.out.println("=======================================\n");

        // Initialize Train Consist (Empty List)
        List<String> trainConsist = new ArrayList<>();

        // Display Initial Bogie Count
        System.out.println("Train consist initialized successfully.");
        System.out.println("Initial number of bogies: " + trainConsist.size());

        System.out.println("\nApplication Running...");
        System.out.println("---------------------------------------");
    }
}