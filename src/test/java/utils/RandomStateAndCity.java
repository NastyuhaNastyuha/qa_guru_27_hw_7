package utils;

import java.util.*;

import static utils.RandomUtils.getRandomItemFromArray;

public class RandomStateAndCity {
    public String state;
    public String city;

    public void getRandomStateAndCity() {
        Map<String, String[]> statesAndCities = new HashMap<>();
        statesAndCities.put("NCR", new String[] {"Delhi", "Gurgaon", "Noida"});
        statesAndCities.put("Uttar Pradesh", new String[] {"Agra", "Lucknow", "Merrut"});
        statesAndCities.put("Haryana", new String[] {"Karnal", "Panipat"});
        statesAndCities.put("Rajasthan", new String[] {"Jaipur", "Jaiselmer"});

        String[] states = statesAndCities.keySet().toArray(new String[0]);
        state = getRandomItemFromArray(states);
        city = getRandomItemFromArray(statesAndCities.get(state));
    }
}
