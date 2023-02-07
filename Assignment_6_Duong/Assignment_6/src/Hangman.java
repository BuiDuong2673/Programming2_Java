import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hangman {
    private String word = null;
    private int guessNumber = 0;
    private List <Character> wordCharacters;
    private List <Character> guessedCharacters;
    private Random random = new Random();

    public Hangman(List <String> wordList, int guessNumber) {
        setGuessNumber(guessNumber);
        wordCharacters = new ArrayList<>();
        guessedCharacters = new ArrayList<>();
        word = wordList.get(random.nextInt(wordList.size()));
        for (int i = 0; i < word.length(); i++) {
            boolean ok = wordCharacters.contains(word.charAt(i));
            if (!ok) {
                wordCharacters.add(word.charAt(i));
            }
        }
    }

    public boolean guess (Character chr) {
        boolean ok = wordCharacters.contains(chr);
        if (!ok) {
            guessNumber -= 1;
        }
        guessedCharacters.add(chr);
        return ok;
    }
    public boolean theEnd() {
        boolean ok = true;
        for (int i = 0; i < wordCharacters.size(); i++) {
            ok = guessedCharacters.contains(wordCharacters.get(i));
            if (!ok) {
                break;
            }
        }
        return ok;
    }

    //Getter of guessedCharacters
    public List<Character> guesses() {
        return guessedCharacters;
    }
    //Getter of guessNumber
    public int guessesLeft() {
        return guessNumber;
    }
    //Getter of word
    public String word() {
        return word;
    }
    public void setWord(String word) {
        if (word != null && word.length() > 0) {
            this.word = word;
        }
    }
    public void setGuessNumber(int guessNumber) {
        if (guessNumber > 0) {
            this.guessNumber = guessNumber;
        }
    }
    public List<Character> getWordCharacters() {
        return wordCharacters;
    }
    public void setWordCharacters(List<Character> wordCharacters) {
        this.wordCharacters = wordCharacters;
    }
    public void setGuessedCharacters(List<Character> guessedCharacters) {
        this.guessedCharacters = guessedCharacters;
    }

    
}
