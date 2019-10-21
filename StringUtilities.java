
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String result = "";
        for (int i = valueToBeReversed.length() - 1; i>=0; i--){
            result =result + valueToBeReversed.charAt(i);
        }
        return result;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        char result = word.charAt((word.length() - 1)/2);
        return result;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        for(int i = 0; i < value.length(); i++){
            if(value.charAt(i) == charToRemove){
                String value1 = value.substring(0 , i);
                String value2 = value.substring(i + 1);
                value = value1 + value2;
            }
        }
        //return value.replace(charToRemove, "");
        return value;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        
        String result = "";
        
        for(int i = sentence.length()-1; i >= 0; i--){
            String currentchar = "" + sentence.charAt(i);
            if(currentchar.equals(" ")){
                result = sentence.substring(i+1);

                return result;  
            }
        
        }
    return result;
    }
}
    