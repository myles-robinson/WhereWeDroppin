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

public class blackoutActivity extends AppCompatActivity {

    private static Map<Integer, Location> locationMap = new LinkedHashMap<>();
    TextView spot;
    Button letsLand;
    int index;
    Spinner sItems;
    List<String> spinnerArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blackout);
        spinnerArray =  new ArrayList<String>();

        spot = findViewById(R.id.blackoutSpotLabel);
        letsLand = findViewById(R.id.blackoutWhereButton);

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
                    locationMap.get(5).setWeight(locationMap.get(5).getWeight() * 2);
                    locationMap.get(10).setWeight(locationMap.get(10).getWeight() * 2);
                    locationMap.get(4).setWeight(locationMap.get(4).getWeight() * 2);
                    locationMap.get(11).setWeight(locationMap.get(11).getWeight() * 2);
                }

                else if (sItems.getSelectedItem().toString().equalsIgnoreCase("beginner")) {
                    locationMap.get(6).setWeight(locationMap.get(6).getWeight() * 2);
                    locationMap.get(1).setWeight(locationMap.get(1).getWeight() * 2);
                    locationMap.get(8).setWeight(locationMap.get(8).getWeight() * 2);
                    locationMap.get(7).setWeight(locationMap.get(7).getWeight() * 2);
                    locationMap.get(9).setWeight(locationMap.get(9).getWeight() * 2);
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

    private static void getLocation(){

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
