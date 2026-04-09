package com.train.app;

import java.util.HashMap;
import java.util.Map;

public class UseCase6TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("   Train Consist Management App 🚆");
        System.out.println("=======================================\n");

        // Create HashMap for bogie-capacity mapping
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Add bogie capacities
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 24);

        // Display capacities
        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nApplication Running...");
    }
}