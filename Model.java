package sample;

import java.util.Locale;

public class Model {

    private String inputString;

    public Model()
    {

    }

    public Model(String inputString){
        this.inputString = inputString;
    }

    public void validateInput() throws Exception{
        char[] arrayInput = inputString.toLowerCase().toCharArray();
        int vowelsCount = 0;
        for (int i =0; i<inputString.length(); i++)
        {
            if(arrayInput[i] == 'a' || arrayInput[i] == 'e' || arrayInput[i] == 'i' || arrayInput[i] == 'o' || arrayInput[i] == 'u') {
                vowelsCount++;
            }
        }

        if(inputString.isEmpty()){
            throw new IllegalArgumentException("Please write something ~!");
        }
        else if (inputString.length() < 2){
            throw new IllegalArgumentException("Tooo Small, Write More to Score More !!");
        }
        else if (inputString.length() > 8){
            throw new IllegalArgumentException("Way BBIIIIGGGGGG !!");
        }
        else if (vowelsCount == 0){
            throw new IllegalArgumentException("No Vowel !! Get me One!");
        }
        else {
            throw new IllegalArgumentException("Bang !!");
        }
    }

    public void validateTreasureBox(int i){
        if(i<=0){

        }
    }
}
