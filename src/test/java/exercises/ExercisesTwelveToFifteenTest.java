package exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ExercisesTwelveToFifteenTest {
    ExercisesTwelveToFifteen exercisesTwelveToFifteen;

    @BeforeEach
    void setUp() {

        exercisesTwelveToFifteen = new ExercisesTwelveToFifteen();
    }

    @Nested
    @DisplayName("Exercise Twelve")
    class ExerciseTwelve{

        @Test
        void souldCompareTwoTextEquals(){
            String textInitial = "Casa";
            String textFinal = "CAsa";
            assertEquals("el texto "+textInitial+ " y el texto "+ textFinal + " Son iguales", exercisesTwelveToFifteen.exercisesTwelveComparateToText(textInitial, textFinal));
        }


        @Test
        void souldCompareTwoTextDiferents(){
            String textInitial = "hola";
            String textFinal = "como estas?";
            assertEquals("el texto "+textInitial+" y el texto "+textFinal+" NO son iguales, tienen los siguientes caracteres diferentes: [c, h, m,  , e, s, t, ?, l]", exercisesTwelveToFifteen.exercisesTwelveComparateToText(textInitial, textFinal));
        }

    }
    @Nested
    @DisplayName("Exercise Thirteen")
    class ExerciseThirteen{

        @Test
        void souldReturnActualDateInSpecificFormat(){
            Date fecha = new Date(Calendar.getInstance().getTimeInMillis());
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            String fechaTexto = formatter.format(fecha);
            assertEquals(fechaTexto, exercisesTwelveToFifteen.exercisesThirteenGetActualDate());


        }

    }

}