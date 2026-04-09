package com.train.app;

import java.util.*;
import java.util.stream.*;

public class UseCase10TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogie list (reuse same pattern)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("First Class", 80));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));

        // 🔥 MAIN PART (UC10 - REDUCE)
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // Display result
        System.out.println("\nTotal Seating Capacity: " + totalSeats);

        System.out.println("\nApplication Running...");
    }
}