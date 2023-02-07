import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Wa6_main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Hangman game!");
        WordList wordList = new WordList("WordList.txt");
        System.out.println("Give the number of guesses > ");
        int guessNumber = readInt();
        Hangman game = new Hangman(wordList.giveWords(), guessNumber);
        String word = game.word();
        List <Character> guessList = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            guessList.add('_');
        }
        printWord(guessList);
        
        while (game.guessesLeft() > 0) {
            System.out.print("Enter your guess > ");
            char character = readChar();
            if (game.guesses().contains(character)) {
                System.out.println("Same guess, please enter another character > ");
                continue;
            } else {
                boolean ok = game.guess(character);
                if (!ok) {
                    System.out.println("Wrong guess!");
                    System.out.println("Guess remain: " + game.guessesLeft());
                } else {
                    for (int i = 0; i < word.length(); i++) {
                        if (character == word.charAt(i)) {
                            guessList.set(i, character);
                        }
                    }
                    printWord(guessList);
                    System.out.println("Guess remain: " + game.guessesLeft());
                    if (game.theEnd()) {
                        break;
                    }
                }
            }
        }
        if (game.theEnd()) {
            System.out.println("Victory!");
        } else {
            System.out.println("Game over!");
            System.out.println("Correct word: " + word);
        }
        //Bonus
        System.out.println("Enter the number of characters in the word > ");
        int characterNum = readInt();
        WordList wordList1 = wordList.theWordsOfLength(characterNum);
        WordList wordList2 = wordList.theWordsWithCharacters("_a_e_");
        System.out.println(wordList1.printWordList());
        System.out.println(wordList2.printWordList());
    }    
    
    public static int readInt() {
        boolean ok = false;
        int value = 0;
        do {
            try {
                value = scanner.nextInt();
                scanner.nextLine();
                if (value > 0)  {
                    ok = true;
                    break;
                } else {
                    System.out.println("Negative value error, please try again > ");
                }
            } catch (InputMismatchException ime) {
                scanner.nextLine();
                System.out.println("Error, please try again > ");
            }
        } while (!ok);
        return value;  
    }
    public static char readChar() {
        boolean ok = false;
        String character = "";
        do {
            character = scanner.nextLine();
            if (character.length() != 1) {
                System.out.println("Error, please just enter 1 letter > ");
                continue;
            } else {
                int ascii = (int) character.toLowerCase().charAt(0);
                if (ascii > 96 && ascii < 123) {
                    ok = true;
                    break;
                } else {
                    System.out.println("Error, please try again > ");
                }
            }
        } while (!ok);
        return character.toLowerCase().charAt(0);
    }

    public static void printWord(List <Character> characterList) {
        String word = "";
        for (char character : characterList) {
            word += character;
        }
        System.out.println("Word: " + word);
    }
}
