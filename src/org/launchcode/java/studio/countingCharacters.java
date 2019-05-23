package org.launchcode.java.studio;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.lang.Character;
import java.nio.file.Paths;
import java.nio.file.Files;

import static java.nio.file.Files.*;

public class countingCharacters {

// ============ TEXT INPUT METHODS ============
    static String userInput(){
        System.out.println("===============================\nPlease enter a text below \nand I'll count the number of \ntimes" +
                " that you used each letter. \n===============================");
        System.out.print("Start here: >> ");
        Scanner scnr = new Scanner(System.in);
        String text = scnr.nextLine();
        return text;
    }

    static String fixedText() {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at " +
                "sagittis augue. Praesent quis rhoncus justo. Aliquam erat " +
                "volutpat. Donec sit amet suscipit metus, non lobortis massa. " +
                "Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. " +
                "Donec nec velit non ligula efficitur luctus.";

        return text;
    }

    static String readFromFile() throws IOException {
        Scanner in = new Scanner(new FileReader("resources/sample.txt"));
        StringBuilder sb = new StringBuilder();
        while(in.hasNext()) {
            sb.append(in.next());
        }
        in.close();
        return sb.toString();
    }


// ============ FUNCTIONS ============

    static void arrayListMethod(String text) {
        ArrayList<Integer> counts = new ArrayList<>();

        // create an array of size 128 with all ZERO's
        for (int i = 0; i<128; i++) {
            counts.add(0);
        }

        // read from the list of characters and increment
        for (char c : text.toCharArray()) {
            Integer new_count = counts.get(c) + 1;
            counts.set(c, new_count);
        }

        // ready to print out
        for (char c=0; c <128; c++ ) {
            if (counts.get(c) > 0) {
                System.out.println(c + ": " + counts.get(c));
            }
        }
    }

    static void hashMapMethod(String text) {
        TreeMap <Character, Integer> myDic = new TreeMap<>();
        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)){
                // Investigate the lowercase
                character = Character.toLowerCase(character);
                int currentVal = myDic.getOrDefault(character, 0);
                myDic.put(character, currentVal + 1);

            }
        }
        for (Map.Entry <Character,Integer> iter: myDic.entrySet() ) {
            System.out.println(iter.getKey()+": "+iter.getValue());
        }
    }

    static void arrayMethod(String text) {
        //initiate the array
        int[] counts = new int[128];

        for (char c : text.toCharArray()) {
            Integer new_count = counts[c] + 1;
            counts[c] = new_count;
        }

        for (char c = 0; c < 128; c++) {
            if (counts[c]>0) {
                System.out.println(c + ": " + counts[c]);
            }
        }

    }

// ================ M A I N ====================

    public static void main (String[] args) throws IOException {

        System.out.println("-------------------------"  );
        System.out.println("Here is your options:"      );
        System.out.println("-------------------------"  );
        System.out.println("1 - Read from file"         );
        System.out.println("2 - Use the fixed TEXT"     );
        System.out.println("3 - Enter the text here"    );

        Scanner userPrompt = new Scanner(System.in);
        String choice = userPrompt.next();
        String text = "";

        switch (choice) {
            case "1":
                text = readFromFile();
                break;
            case "2":
                text = fixedText();
                break;
            case "3":
                text = userInput();
                break;
            default:
                text =  "No text is selected";
        }




        arrayMethod(text);

    }

}
