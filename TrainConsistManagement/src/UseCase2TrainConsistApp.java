package com.train.app;

import java.util.ArrayList;
import java.util.List;

public class UseCase2TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("   Train Consist Management App 🚆");
        System.out.println("=======================================\n");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display after adding
        System.out.println("Passenger bogies after addition:");
        System.out.println(passengerBogies);

        // Remove one bogie
        passengerBogies.remove("AC Chair");

        // Display after removal
        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // Check existence
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("\nDoes Sleeper exist? " + exists);

        // Final list
        System.out.println("\nFinal bogie list:");
        System.out.println(passengerBogies);

        System.out.println("\nApplication Running...");
    }
}