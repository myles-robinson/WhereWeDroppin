package com.myles;

import java.util.*;

public class Main {

    private static List<Location> locations = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Hello");
        Scanner scanner = new Scanner(System.in);
        String selectedGame = scanner.nextLine();
        
//        getLocation(selectedGame);

        Map<String, Location> locationMap = new HashMap<>();

        locationMap.put("castle", new Location("Castle", 4));

        Location castle = new Location("Castle", 4);
        Location durrrBurger = new Location("Durrr Burger", 3);
        Location dustyDivot = new Location("Dusty Divot", 3);
        Location fatalFields = new Location("Fatal Fields",2);
        Location floatingIsland = new Location("Floating Island", 5);
        Location flushFactory = new Location("Flush Factory", 6);
        Location greasyGrove = new Location("Greasy Grove",1);
        Location hauntedHills = new Location("Haunted Hills",2);
        Location junkJunction = new Location("Junk Junction",2);
        Location lazyLinks = new Location("Lazy Links",3);
        Location lonelyLodge = new Location("Lonely Lodge",4);
        Location lootLake = new Location("Loot Lake",3);
        Location luckyLanding = new Location("Lucky Landing",2);
        Location paradisePalms = new Location("Paradise Palms",3);
        Location pleasantPark = new Location("Pleasant Park",4);
        Location retailRow = new Location("Retail Row",5);
        Location riskyReels = new Location("Risky Reels",3);
        Location saltySprings = new Location("Salty Springs",3);
        Location shiftyShafts = new Location("Shifty Shafts",2);
        Location snobbyShores = new Location("Snobby Shores",4);
        Location tiltedTowers = new Location("Tilted Towers",3);
        Location tomatoTemple = new Location("Tomato Temple",3);
        Location wailingWoods = new Location("Wailing Woods",6);

        Collections.addAll(locations, castle, durrrBurger, dustyDivot, fatalFields, floatingIsland,
                flushFactory, greasyGrove, hauntedHills, junkJunction, lazyLinks, lonelyLodge,
                lootLake, luckyLanding, paradisePalms, pleasantPark, retailRow, riskyReels, saltySprings,
                shiftyShafts, snobbyShores, tiltedTowers, tomatoTemple, wailingWoods);
        
        Random rand = new Random();
        Player player = new Player("Player 1", "pro");

        if (player.getSkillLevel().toLowerCase().equals("pro") && selectedGame.equalsIgnoreCase("Fortnite")) {
            locationMap.get("castle").setWeight(locationMap.get("castle").getWeight() * 5);
            locationMap.get("castle").setWeight(locationMap.get("castle").getWeight() * 5);
            locationMap.get("castle").setWeight(locationMap.get("castle").getWeight() * 5);
            locationMap.get("castle").setWeight(locationMap.get("castle").getWeight() * 5);
        }

        int totalWeight = 0;
        for (Location location : locations) {
            totalWeight += location.getWeight();
        }

        int index = -1;
        int result = rand.nextInt(totalWeight);

        for (int i = 0 ; i < locations.size(); i++) {
            result -= locations.get(i).getWeight();

            if (result <= 0) {
                index = i;
                break;
            }
        }

        System.out.println("Alright boys, we're dropping at: " + locations.get(index).getName());
    }

    private static List<Location> getLocation(String game) {

        if (game.toLowerCase().equals("Fortnite")) {

            Location castle = new Location("Castle", 4);
            Location durrrBurger = new Location("Durrr Burger", 3);
            Location dustyDivot = new Location("Dusty Divot", 3);
            Location fatalFields = new Location("Fatal Fields",2);
            Location floatingIsland = new Location("Floating Island", 5);
            Location flushFactory = new Location("Flush Factory", 6);
            Location greasyGrove = new Location("Greasy Grove",1);
            Location hauntedHills = new Location("Haunted Hills",2);
            Location junkJunction = new Location("Junk Junction",2);
            Location lazyLinks = new Location("Lazy Links",3);
            Location lonelyLodge = new Location("Lonely Lodge",4);
            Location lootLake = new Location("Loot Lake",3);
            Location luckyLanding = new Location("Lucky Landing",2);
            Location paradisePalms = new Location("Paradise Palms",3);
            Location pleasantPark = new Location("Pleasant Park",4);
            Location retailRow = new Location("Retail Row",5);
            Location riskyReels = new Location("Risky Reels",3);
            Location saltySprings = new Location("Salty Springs",3);
            Location shiftyShafts = new Location("Shifty Shafts",2);
            Location snobbyShores = new Location("Snobby Shores",4);
            Location tiltedTowers = new Location("Tilted Towers",3);
            Location tomatoTemple = new Location("Tomato Temple",3);
            Location wailingWoods = new Location("Wailing Woods",6);

            Collections.addAll(locations, castle, durrrBurger, dustyDivot, fatalFields, floatingIsland,
                    flushFactory, greasyGrove, hauntedHills, junkJunction, lazyLinks, lonelyLodge,
                    lootLake, luckyLanding, paradisePalms, pleasantPark, retailRow, riskyReels, saltySprings,
                    shiftyShafts, snobbyShores, tiltedTowers, tomatoTemple, wailingWoods);

        } else if (game.toLowerCase().equals("Blackout")) {
            
            Location estates = new Location("Estates", 4);
            Location constructionSite = new Location("Construction Site", 3);
            Location nuketownIsland = new Location("Nuketown Island", 3);
            Location array = new Location("Array",2);
            Location firingRange = new Location("Firing Range", 5);
            Location hydroDam = new Location("Hydro Dam", 6);
            Location asylum = new Location("Asylum",1);
            Location cargoDocks = new Location("Cargo Docks",2);
            Location factory = new Location("Factory",2);
            Location frackingTower = new Location("Fracking Tower",3);
            Location riverTown = new Location("River town",4);
            
            Collections.addAll(locations, estates, constructionSite, nuketownIsland, array, firingRange, hydroDam,
                    asylum, cargoDocks, factory, frackingTower, riverTown);
        }
        
        return locations;

    }
}
