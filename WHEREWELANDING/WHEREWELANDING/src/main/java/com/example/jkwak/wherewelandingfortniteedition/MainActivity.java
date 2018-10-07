package com.example.jkwak.wherewelandingfortniteedition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private static Map<Integer, Location> locationMap = new LinkedHashMap<>();
    TextView spot;
    Button letsLand;
    int index;
    Spinner sItems;
    List<String> spinnerArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_welcome);


        spinnerArray =  new ArrayList<String>();

        spot = findViewById(R.id.spotLabel);
        letsLand = findViewById(R.id.whereButton);

        spinnerArray.add("Pro");
        spinnerArray.add("Beginner");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, spinnerArray);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sItems = (Spinner) findViewById(R.id.spinner);
        sItems.setAdapter(adapter);
        sItems.setSelection(0);

        getLocation();

        index = 0;

        letsLand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int totalWeight = 0;
                int index = 0;

                if (sItems.getSelectedItem().toString().equalsIgnoreCase("pro")) {
                    locationMap.get(24).setWeight(locationMap.get(24).getWeight() * 2);
                    locationMap.get(21).setWeight(locationMap.get(21).getWeight() * 2);
                    locationMap.get(19).setWeight(locationMap.get(19).getWeight() * 2);
                    locationMap.get(17).setWeight(locationMap.get(17).getWeight() * 2);
                }

                if (sItems.getSelectedItem().toString().equalsIgnoreCase("beginner")) {
                    locationMap.get(16).setWeight(locationMap.get(16).getWeight() * 2);
                    locationMap.get(9).setWeight(locationMap.get(9).getWeight() * 2);
                    locationMap.get(23).setWeight(locationMap.get(23).getWeight() * 2);
                    locationMap.get(11).setWeight(locationMap.get(11).getWeight() * 2);
                    locationMap.get(20).setWeight(locationMap.get(20).getWeight() * 2);
                }

                for (Location location : locationMap.values()) {
                    totalWeight += location.getWeight();
                }

                int result = rand.nextInt(totalWeight);

                for (Integer key : locationMap.keySet()) {
                    result -= locationMap.get(key).getWeight();
                    if (result <= 0) {
                        index = key;
                        break;
                    }
                }
                spot.setText(locationMap.get(index).getName());
            }
        });

    }

    private static void getLocation() {

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

    }
}
