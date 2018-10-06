package com.myles;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Location> locationMap = new LinkedHashMap<>();


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean gameIsValid = false;
        boolean skillLevelIsValid = false;
        String selectedGame;
        String skillLevel;


        //Asks for a game until a valid game input is provided.
        do {
            System.out.println("Enter a game: (Fortnite or Blackout):");
            selectedGame = scanner.nextLine();
            if(selectedGame.equalsIgnoreCase("fortnite") || selectedGame.equalsIgnoreCase("blackout"))
                gameIsValid = true;
        } while(!gameIsValid);

        //Asks for a skill level until a valid skill level is provided.
        do {
            System.out.println("Enter your skill level (Pro or Rookie)");
            skillLevel = scanner.nextLine();
            if(skillLevel.equalsIgnoreCase("pro") || skillLevel.equalsIgnoreCase("rookie"))
                skillLevelIsValid = true;
        } while(!skillLevelIsValid);



        getLocation(selectedGame);

        Random rand = new Random();

        if (skillLevel.equalsIgnoreCase("pro")
                && selectedGame.equalsIgnoreCase("fortnite")) {
            locationMap.get(24).setWeight(locationMap.get(24).getWeight() * 5);
            locationMap.get(21).setWeight(locationMap.get(21).getWeight() * 5);
            locationMap.get(19).setWeight(locationMap.get(19).getWeight() * 5);
            locationMap.get(17).setWeight(locationMap.get(17).getWeight() * 5);
        }

        if (skillLevel.equalsIgnoreCase("rookie")
                && selectedGame.equalsIgnoreCase("fortnite")) {
            locationMap.get(16).setWeight(locationMap.get(16).getWeight() * 5);
            locationMap.get(9).setWeight(locationMap.get(9).getWeight() * 5);
            locationMap.get(23).setWeight(locationMap.get(23).getWeight() * 5);
            locationMap.get(11).setWeight(locationMap.get(11).getWeight() * 5);
            locationMap.get(20).setWeight(locationMap.get(20).getWeight() * 5);
        }

        if (skillLevel.equalsIgnoreCase("pro")
                && selectedGame.equalsIgnoreCase("blackout")) {
            locationMap.get(5).setWeight(locationMap.get(5).getWeight() * 5);
            locationMap.get(10).setWeight(locationMap.get(10).getWeight() * 5);
            locationMap.get(4).setWeight(locationMap.get(4).getWeight() * 5);
            locationMap.get(11).setWeight(locationMap.get(11).getWeight() * 5);
        }

        if (skillLevel.equalsIgnoreCase("rookie")
                && selectedGame.equalsIgnoreCase("blackout")) {
            locationMap.get(6).setWeight(locationMap.get(6).getWeight() * 5);
            locationMap.get(1).setWeight(locationMap.get(1).getWeight() * 5);
            locationMap.get(8).setWeight(locationMap.get(8).getWeight() * 5);
            locationMap.get(7).setWeight(locationMap.get(7).getWeight() * 5);
            locationMap.get(9).setWeight(locationMap.get(9).getWeight() * 5);
        }

        int totalWeight = 0;
        for (Location location : locationMap.values()) {
            totalWeight += location.getWeight();
        }

        int index = 0;
        int result = rand.nextInt(totalWeight);

        for (Integer key : locationMap.keySet()) {
            result -= locationMap.get(key).getWeight();
            if (result <= 0) {
                index = key;
                break;
            }
        }

        System.out.println("Alright boys, we're dropping at: " + locationMap.get(index).getName());
    }

    private static void getLocation(String game) {

        if (game.equalsIgnoreCase("Fortnite")) {

            locationMap.put(1, new Location("Castle", 4));
            locationMap.put(2, new Location("Durrr Burger", 3));
            locationMap.put(3, new Location("Dusty Divot", 3));
            locationMap.put(4, new Location("Castle", 4));
            locationMap.put(5, new Location("Durrr Burger", 3));
            locationMap.put(6, new Location("Dusty Divot", 3));
            locationMap.put(7, new Location("Fatal Fields", 2));
            locationMap.put(8, new Location("Floating Island", 5));
            locationMap.put(9, new Location("Flush Factory", 6));
            locationMap.put(10, new Location("Greasy Grove", 1));
            locationMap.put(11, new Location("Haunted Hills", 2));
            locationMap.put(12, new Location("Junk Junction", 2));
            locationMap.put(13, new Location("Lazy Links", 3));
            locationMap.put(14, new Location("Lonely Lodge", 4));
            locationMap.put(15, new Location("Loot Lake", 3));
            locationMap.put(16, new Location("Lucky Landing", 2));
            locationMap.put(17, new Location("Paradise Palms", 3));
            locationMap.put(18, new Location("Pleasant Park", 4));
            locationMap.put(19, new Location("Retail Row", 5));
            locationMap.put(20, new Location("Risky Reels", 3));
            locationMap.put(21, new Location("Salty Springs", 3));
            locationMap.put(22, new Location("Shifty Shafts", 2));
            locationMap.put(23, new Location("Snobby Shores", 4));
            locationMap.put(24, new Location("Tilted Towers", 3));
            locationMap.put(25, new Location("Tomato Temple", 3));
            locationMap.put(26, new Location("Wailing Woods", 6));

        } else if (game.equalsIgnoreCase("Blackout")) {

            locationMap.put(1, new Location("Estates", 4));
            locationMap.put(2, new Location("Construction Site", 3));
            locationMap.put(3, new Location("Nuketown Island", 3));
            locationMap.put(4, new Location("Array", 2));
            locationMap.put(5, new Location("Firing Range", 5));
            locationMap.put(6, new Location("Hydro Dam", 6));
            locationMap.put(7, new Location("Asylum", 1));
            locationMap.put(8, new Location("Cargo Docks", 2));
            locationMap.put(9, new Location("Factory", 2));
            locationMap.put(10, new Location("Fracking Tower", 3));
            locationMap.put(11, new Location("River town", 4));
        }
    }
}
