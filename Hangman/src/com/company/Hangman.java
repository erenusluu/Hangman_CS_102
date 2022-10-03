package com.company;
import java.util.Random;

public class Hangman {

    private StringBuffer secretWord;
    private StringBuffer knownSoFar;
    private int numberOfIncorrectTries;
    private final int MAX_ALLOWED_INCORRECT_TRIES = 6;


    public Hangman(){

        //variables
        numberOfIncorrectTries = 0;
        StringBuffer allLetters = new StringBuffer("abcdefghijklmnopqrstuvwxyz");
        StringBuffer usedLetters = new StringBuffer("");
        numberOfIncorrectTries = 7;
    }

    private StringBuffer chooseSecretWord()
    {
        //Potential secret words stored in an array.
        String[] secretWordList = {"EMBARRASSMENT","FLUORESCENT", "ACCOMODATE","PSYCHIATRIST", "angry", "apple", "brother", "home", "homework", "sister", "street", "truth", "QUESTIONNAIRE","NECESSARY","MISCHEVIOUS","OCCASIONALLY","PNEUMONIA","RESTAURANT", "MILLENNIUM","RIDICULOUS","PHENOMENON", "SIXTH","RURAL", "COLONEL", "IRONIC","IRREGARDLESS", "LIEUTENANT", "DIDACTIC", "FEBRUARY","BEHAVIOUR", "DEVELOPMENT" };
        // creating a random object and choosing the index number of a word
        Random rand = new Random();
        int chosenIndex = rand.nextInt(secretWordList.length); // which word is chosen from the wordList as an index number
        StringBuffer result = new StringBuffer(secretWordList[chosenIndex]); // secret word as the type of a StringBuffer
        return result;
    }



    public  void hangmanImage() {
        if ( numberOfIncorrectTries == 1) {
            System.out.println("Wrong guess, try again");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("___|___");
            System.out.println();
        }
        if (numberOfIncorrectTries == 2) {
            System.out.println("Wrong guess, try again");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (numberOfIncorrectTries == 3) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   | ");
            System.out.println("___|___");
        }
        if (numberOfIncorrectTries == 4) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (numberOfIncorrectTries == 5) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (numberOfIncorrectTries == 6) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
        }
        if (numberOfIncorrectTries == 7) {
            System.out.println("GAME OVER!");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |          _|_");
            System.out.println("   |         / | \\");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
            System.out.println("GAME OVER! The word was " + secretWord);
        }
    }
}
