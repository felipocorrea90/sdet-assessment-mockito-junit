import java.util.ArrayList;
import java.util.List;

public class Dictionary {

    private DictionaryService dictService;

    public void setDictionaryService(DictionaryService dictService){
        this.dictService = dictService;
    }

    /**
     * Represents the getDictionary function
     * @return
     */
    public List<String> getDictionary() {
        return dictService.getDictionary();
    }

    /**
     * Represents the isEnglishWord function
     * @param word
     * @return
     */
    public boolean isEnglishWord(String word) {
        return dictService.isEnglishWord(word);
    }

    /**
     * Find all possible words in a given string
     * @param input
     * @return
     */
    public List<String> findPossibleWords(String input) {
        ArrayList <String> matches = new ArrayList <String> ();
        List<String> dictionary = getDictionary();
        input = input.toLowerCase();

        // for each word in dictionary
        for (String word : dictionary) {
            //System.out.println(word);

            // match flag
            Boolean nonMatch = true;

            for (char chWord : word.toCharArray()) {
                String w = Character.toString(chWord);

                // if the count of chW in word is equal to its count in input,
                // then, they are match
                if (word.length() - word.replace(w, "").length() !=
                        input.length() - input.replace(w, "").length()) {
                    nonMatch = false;
                    break;
                }
            }
            if (nonMatch) {
                matches.add(word);
            }
        }
        System.out.println(matches);
        return matches;
    }
}
