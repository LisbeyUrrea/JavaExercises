package exercises;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class ExercisesTwelveToFifteen {
    Logger logger = Logger.getLogger("logger");

    public String exercisesTwelveComparateToText(String textInitial, String textFinal) {
        if(textInitial.equalsIgnoreCase(textFinal)) {
            return "el texto " + textInitial + " y el texto " + textFinal + " Son iguales";
        }else {
           // String letrasDiferentes = datos.forEach((k,v) -> System.out.println("Key: " + k + ": Value: " + v));
            return "el texto " + textInitial + " y el texto " + textFinal + " NO son iguales, tienen los siguientes caracteres diferentes: " + lettersDiferent(textInitial, textFinal);
        }
    }

    public List<String> lettersDiferent(String textInitial, String textFinal) {
        List<String> letterNoRepeted = new ArrayList<>();

        for (int i = 0; i < textInitial.length(); i++) {
            for (int j = 0; j < textFinal.length(); j++) {
                String letra = Character.toString(textFinal.charAt(j));
                if (!textInitial.contains(letra)){
                    letterNoRepeted.add(letra);
                }

                String letra2 = Character.toString(textInitial.charAt(i));
                if (!textFinal.contains(letra2)){
                    letterNoRepeted.add(letra2);
                }
            }
        }

        return letterNoRepeted.stream().distinct().collect(Collectors.toList());

    }

    public String exercisesThirteenGetActualDate() {

        Date fecha = new Date(Calendar.getInstance().getTimeInMillis());
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return formatter.format(fecha);
    }
}
