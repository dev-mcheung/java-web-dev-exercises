package studio.three;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        String theString = "If the product of two terms is zero then common sense says at least" +
                " one of the two terms has to be zero to start with. So if you move all the" +
                " terms over to one side, you can put the quadratics into a form that can" +
                " be factored allowing that side of the equation to equal zero. Once you’ve" +
                " done that, it’s pretty straightforward from there.";
        Scanner input = new Scanner(System.in);
        String newString;
        System.out.println("Enter in a string:");
        newString = input.nextLine();
        if (!newString.equals("")) {
            theString = newString;
            input.close();
        }
        char[] charactersInString = theString.toCharArray();
        HashMap<Character, Integer> characters;
        characters = new HashMap<>();

        for (int i = 0; i < charactersInString.length; i++) {
            if (!characters.containsKey(charactersInString[i])) {
                characters.put(charactersInString[i], 1);
            } else {
                characters.put(charactersInString[i], characters.get(charactersInString[i]) + 1);
            }
        }

        for (Map.Entry<Character, Integer> character : characters.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}