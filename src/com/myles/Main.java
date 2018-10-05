package com.myles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<Location> locationsFromMap = Arrays.asList(new Location("Castle (POI)", 4),
            new Location("Durrr Burger", 3),
            new Location("Dusty Divot", 3),
            new Location("Fatal Fields",2),
            new Location("Floating Island", 5),
            new Location("Flush Factory", 6),
            new Location("Greasy Grove",1),
            new Location("Haunted Hills",2),
            new Location("Junk Junction",2),
            new Location("Lazy Links",3),
            new Location("Lonely Lodge",4),
            new Location("Loot Lake",3),
            new Location("Lucky Landing",2),
            new Location("Paradise Palms",3),
            new Location("Pleasant Park",4),
            new Location("Retail Row",5),
            new Location("Risky Reels",3),
            new Location("Salty Springs",3),
            new Location("Shifty Shafts",2),
            new Location("Snobby Shores",4),
            new Location("Tilted Towers",3),
            new Location("Tomato Temple",3),
            new Location("Wailing Woods",6)
        );

        Random rand = new Random();

        int totalWeight = 0;
        for (int i = 0 ; i < locationsFromMap.size(); i++) {
            totalWeight += locationsFromMap.get(i).getWeight();
        }

        int index = -1;
        int result = rand.nextInt(totalWeight);

        for (int i = 0 ; i < locationsFromMap.size(); i++) {
            result -= locationsFromMap.get(i).getWeight();

            if (result <= 0) {
                index = i;
                break;
            }
        }

        System.out.println("Your random location is: " + locationsFromMap.get(index).getName());
    }
}
