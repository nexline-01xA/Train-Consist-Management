package com.train.app;

import java.util.*;
import java.util.stream.Collectors;

public class UseCase9TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC9) ===");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 80));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));

        Map<String, List<Bogie>> grouped =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        System.out.println("\nGrouped Bogies:");

        for (String type : grouped.keySet()) {
            System.out.println("\n" + type + ":");

            for (Bogie b : grouped.get(type)) {
                System.out.println("  " + b);
            }
        }

        System.out.println("\nApplication Running...");
    }
}