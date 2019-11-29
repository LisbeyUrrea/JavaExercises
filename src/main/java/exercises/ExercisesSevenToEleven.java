package exercises;

import javax.xml.bind.ValidationException;
import java.util.HashMap;
import java.util.Map;

public class ExercisesSevenToEleven {

    public String exerciseSevenComparateOneNumber(String numberToCompare){
        try {
            return Integer.parseInt(numberToCompare) < 0 ?  "MENOR" :
                    Integer.parseInt(numberToCompare) > 0 ? "El numero "+numberToCompare+" es Mayor a 0"  :
                            "El numero "+numberToCompare+" es IGUAL a 0";
        }catch (NumberFormatException e){
            throw new NumberFormatException("Error: el caracter digitado no es un numero");
        }
    }

    public String exerciseEightNowIfADayIsWeekend(String day) throws ValidationException {
        try {
            int dayOfWeek = Integer.parseInt(day);
            if(dayOfWeek > 0 && dayOfWeek < 8){
                return dayOfWeek == 6 || dayOfWeek == 7 ? "Es un dia del fin de semana" : "Es dia de la semana";
            }else {
                throw new ValidationException("El caracter digitado no es un número de la lista.");
            }

        }catch (NumberFormatException e){
            throw new NumberFormatException("El caracter digitado no es un número");
        }

    }

    public  String exerciseNineReplaceCarater(String text){
        return (text.replace('a', 'e'));
    }

    public  String exerciseTenRemoveBlancks(String text){
        return text.replace(" ","");
    }

    public  int exerciseElevenKnowThelengthOfText(String text){
        return text.length();
    }

    public  Map<String,Object> exerciseElevenKnowVowelsOfText(String text){
        Map<String,Object> cantByVowels = new HashMap<>();
        String textLowerCase = text.toLowerCase();
        int cantLetterA = 0;
        int cantLetterE = 0;
        int cantLetterI = 0;
        int cantLetterO = 0;
        int cantLetterU = 0;
        for(int x=0;x<textLowerCase.length();x++) {

            if (textLowerCase.charAt(x)=='a'){
                cantLetterA++;
            }
            if  (textLowerCase.charAt(x)=='e') {
                cantLetterE++;
            }
            if  (textLowerCase.charAt(x)=='i') {
                cantLetterI++;
            }
            if (textLowerCase.charAt(x)=='o') {
                cantLetterO++;
            }
            if  (textLowerCase.charAt(x)=='u') {
                cantLetterU++;
            }
        }
        cantByVowels.put("A",cantLetterA);
        cantByVowels.put("E",cantLetterE);
        cantByVowels.put("I",cantLetterI);
        cantByVowels.put("O",cantLetterO);
        cantByVowels.put("U",cantLetterU);

        return cantByVowels;
    }

}
