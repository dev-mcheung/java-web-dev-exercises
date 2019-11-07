package excercises;

import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {
        String sentence;
        Scanner input;
        String term;

        input = new Scanner(System.in);
        sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println("Enter a search term to search for:");
        term = input.nextLine();
        input.close();

        sentence = sentence.toLowerCase();
        term = term.toLowerCase();
        System.out.println("The term you search for is in the sentence: " + sentence.contains(term));
    }
}
