package com.myles;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        System.out.println("Please enter a game");
//        Scanner scanner = new Scanner(System.in);
//        String selectedGame = scanner.nextLine();
        
//        getLocation(selectedGame);

        Map<Integer, Location> locationMap = new LinkedHashMap<>();

        locationMap.put(1, new Location("Castle", 4));
        locationMap.put(2, new Location("Durrr Burger", 3));
        locationMap.put(3, new Location("Dusty Divot", 3));
        locationMap.put(4, new Location("Castle", 4));
        locationMap.put(5, new Location("Durrr Burger", 3));
        locationMap.put(6, new Location("Dusty Divot", 3));
        locationMap.put(7, new Location("Fatal Fields",2));
        locationMap.put(8, new Location("Floating Island", 5));
        locationMap.put(9, new Location("Flush Factory", 6));
        locationMap.put(10, new Location("Greasy Grove",1));
        locationMap.put(11, new Location("Haunted Hills",2));
        locationMap.put(12, new Location("Junk Junction",2));
        locationMap.put(13, new Location("Lazy Links",3));
        locationMap.put(14, new Location("Lonely Lodge",4));
        locationMap.put(15, new Location("Loot Lake",3));
        locationMap.put(16, new Location("Lucky Landing",2));
        locationMap.put(17, new Location("Paradise Palms",3));
        locationMap.put(18, new Location("Pleasant Park",4));
        locationMap.put(19, new Location("Retail Row",5));
        locationMap.put(20, new Location("Risky Reels",3));
        locationMap.put(21, new Location("Salty Springs",3));
        locationMap.put(22, new Location("Shifty Shafts",2));
        locationMap.put(23, new Location("Snobby Shores",4));
        locationMap.put(24, new Location("Tilted Towers",3));
        locationMap.put(25, new Location("Tomato Temple",3));
        locationMap.put(26, new Location("Wailing Woods",6));
        
        Random rand = new Random();
        Player player = new Player("Player 1", "pro");

        if (player.getSkillLevel().toLowerCase().equals("pro")) {
            locationMap.get(1).setWeight(locationMap.get(1).getWeight() * 5);
            locationMap.get(2).setWeight(locationMap.get(2).getWeight() * 5);
            locationMap.get(3).setWeight(locationMap.get(3).getWeight() * 5);
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

//    private static List<Location> getLocation(String game) {
//
//        if (game.toLowerCase().equals("Fortnite")) {
//
//            Location castle = new Location("Castle", 4);
//            Location durrrBurger = new Location("Durrr Burger", 3);
//            Location dustyDivot = new Location("Dusty Divot", 3);
//            Location fatalFields = new Location("Fatal Fields",2);
//            Location floatingIsland = new Location("Floating Island", 5);
//            Location flushFactory = new Location("Flush Factory", 6);
//            Location greasyGrove = new Location("Greasy Grove",1);
//            Location hauntedHills = new Location("Haunted Hills",2);
//            Location junkJunction = new Location("Junk Junction",2);
//            Location lazyLinks = new Location("Lazy Links",3);
//            Location lonelyLodge = new Location("Lonely Lodge",4);
//            Location lootLake = new Location("Loot Lake",3);
//            Location luckyLanding = new Location("Lucky Landing",2);
//            Location paradisePalms = new Location("Paradise Palms",3);
//            Location pleasantPark = new Location("Pleasant Park",4);
//            Location retailRow = new Location("Retail Row",5);
//            Location riskyReels = new Location("Risky Reels",3);
//            Location saltySprings = new Location("Salty Springs",3);
//            Location shiftyShafts = new Location("Shifty Shafts",2);
//            Location snobbyShores = new Location("Snobby Shores",4);
//            Location tiltedTowers = new Location("Tilted Towers",3);
//            Location tomatoTemple = new Location("Tomato Temple",3);
//            Location wailingWoods = new Location("Wailing Woods",6);
//
//            Collections.addAll(locations, castle, durrrBurger, dustyDivot, fatalFields, floatingIsland,
//                    flushFactory, greasyGrove, hauntedHills, junkJunction, lazyLinks, lonelyLodge,
//                    lootLake, luckyLanding, paradisePalms, pleasantPark, retailRow, riskyReels, saltySprings,
//                    shiftyShafts, snobbyShores, tiltedTowers, tomatoTemple, wailingWoods);
//
//        } else if (game.toLowerCase().equals("Blackout")) {
//
//            Location estates = new Location("Estates", 4);
//            Location constructionSite = new Location("Construction Site", 3);
//            Location nuketownIsland = new Location("Nuketown Island", 3);
//            Location array = new Location("Array",2);
//            Location firingRange = new Location("Firing Range", 5);
//            Location hydroDam = new Location("Hydro Dam", 6);
//            Location asylum = new Location("Asylum",1);
//            Location cargoDocks = new Location("Cargo Docks",2);
//            Location factory = new Location("Factory",2);
//            Location frackingTower = new Location("Fracking Tower",3);
//            Location riverTown = new Location("River town",4);
//
//            Collections.addAll(locations, estates, constructionSite, nuketownIsland, array, firingRange, hydroDam,
//                    asylum, cargoDocks, factory, frackingTower, riverTown);
//        }
//
//        return locations;
//
//    }
}
