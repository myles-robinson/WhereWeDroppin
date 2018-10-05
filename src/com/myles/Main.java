package com.myles;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Location> places = new ArrayList<>();

        Location tiltedTowers = new Location("Tilted Towers", 5);
        Location moistyMire = new Location("Moisty Mire", 3);
        Location snobbyShores = new Location("Snobby Shores", 1);
        Location dustyDepot = new Location("Dusty Depot", 5);

        places.add(tiltedTowers);
        places.add(moistyMire);
        places.add(snobbyShores);
        places.add(dustyDepot);

        int result = (int) Math.round(Math.random() * places.size());

        System.out.println("Your random location is: " + places.get(result).getName());
    }
}
