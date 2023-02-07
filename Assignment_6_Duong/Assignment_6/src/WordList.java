import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class WordList {
    private List <String> wordList = new ArrayList<>();

    public WordList (String fileName) {
        try (BufferedReader file = new BufferedReader (new InputStreamReader(Hangman.class.getResourceAsStream(fileName)))) {
            String line;
            while ((line = file.readLine()) != null) {
                wordList.add(line.toLowerCase());
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    //Getter of wordList
    public List <String> giveWords() {
        return wordList;
    }
    public void setWordList(List<String> wordList) {
        this.wordList = wordList;
    }

    //Bonus
    public WordList (List <String> wordList) {
        this.wordList = wordList;
    }
    public WordList theWordsOfLength(int length) {
        List <String> choosenWord = new ArrayList <>();
        for (String word : wordList) {
            if (word.length() == length) {
                choosenWord.add(word);
            }
        }
        return new WordList (choosenWord);
    }
    public WordList theWordsWithCharacters(String someString) {
        List <String> choosenWord = new ArrayList<>();
        for (String word : wordList) {
            boolean ok = true;
            if (word.length() == someString.length()) {
                for (int i = 0; i < someString.length(); i++) {
                    if (someString.charAt(i) != '_' && someString.charAt(i) != word.charAt(i)) {
                        ok = false;
                        break;
                    }
                }
            } else {
                ok = false;
                continue;
            }
            if (ok) {
                choosenWord.add(word);
            }
        }
        return new WordList(choosenWord);
    }
    public String printWordList() {
        return "Suitable word: " + wordList;
    }
}