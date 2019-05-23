package org.launchcode.java.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class CollectionApp {
    public static void main(String[] args) {

        /*
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(6);
        myList.remove(Integer.valueOf(6));
        myList.remove(5);
        for (Integer x : myList) {
            System.out.println(x);
        }
        */

        HashMap<Integer, String> days = new HashMap<>();
        days.put(0, "Sunday");
        days.put(1, "Monday");
        days.put(2, "Tuesday");
        days.put(3, "Wednesday");
        days.put(4, "Thursday");
        days.put(5, "Friday");
        days.put(6, "Saturday");

        for (HashMap.Entry<Integer,String> entry: days.entrySet()) {
            System.out.println(entry.getKey().toString() + ", " + entry.getValue());

        }

        }

    }

