package exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import javax.xml.bind.ValidationException;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ExercisesSevenToElevenTest {
    ExercisesSevenToEleven exercisesSevenToEleven;

    @BeforeEach
    void setUp() {
        exercisesSevenToEleven = new ExercisesSevenToEleven();
    }

    @Nested
    @DisplayName("Exercise Seven")
    class ExerciseOne{

        @Test
        void souldReturnMessageNegativeNumber() {
            assertEquals("MENOR",exercisesSevenToEleven.exerciseSevenComparateOneNumber("-8"));
        }

        @Test
        void souldReturnMessagePosiviveNumber() {
            String numberToCompare = "5";
            assertEquals("El numero "+numberToCompare+" es Mayor a 0",exercisesSevenToEleven.exerciseSevenComparateOneNumber(numberToCompare));
        }

        @Test
        void souldReturnMessageIqualToCero() {
            String numberToCompare = "0";
            assertEquals("El numero "+numberToCompare+" es IGUAL a 0",exercisesSevenToEleven.exerciseSevenComparateOneNumber(numberToCompare));
        }


    }

    @Nested
    @DisplayName("Exercise Eight")
    class ExerciseEight{

        @Test
        void souldBeADeyOfWeek() throws ValidationException {
            assertEquals("Es dia de la semana", exercisesSevenToEleven.exerciseEightNowIfADayIsWeekend("1"));
        }

        @Test
        void souldBeADeyOfWeekend() throws ValidationException {
            assertEquals("Es un dia del fin de semana", exercisesSevenToEleven.exerciseEightNowIfADayIsWeekend("7"));
        }

        @Test
        void souldretournValidationException() throws ValidationException {
            assertThrows(ValidationException.class, () -> exercisesSevenToEleven.exerciseEightNowIfADayIsWeekend("15"));
        }
        @Test
        void souldretournNumberFormatException() throws ValidationException {
            assertThrows(NumberFormatException.class, () -> exercisesSevenToEleven.exerciseEightNowIfADayIsWeekend("w"));
        }

    }

    @Nested
    @DisplayName("Exercise Nine")
    class ExerciseNine{

        @Test
        void shouldReplaceAToB(){
            String fraseToChange = "La sonrisa sera la mejor arma contra la tristeza";
           assertEquals("Le sonrise sere le mejor erme contre le tristeze", exercisesSevenToEleven.exerciseNineReplaceCarater(fraseToChange));
        }
    }

    @Nested
    @DisplayName("Exercise Ten")
    class ExerciseTen{

        @Test
        void shouldRemoveBlanks(){
            String fraseToChange = "La sonrisa sera la mejor arma contra la tristeza";
            assertEquals("Lasonrisaseralamejorarmacontralatristeza", exercisesSevenToEleven.exerciseTenRemoveBlancks(fraseToChange));
        }

    }

    @Nested
    @DisplayName("Exercise Eleven")
    class ExerciseEleven{

        @Test
        void souldReturnLengOfSentence(){
            assertEquals(52,exercisesSevenToEleven.exerciseElevenKnowThelengthOfText("Esta es una frace que cuenta las vocales - a e i o u"));
        }

        @Test
        void souldCountNumberOfVowels(){
            Map<String,Object> cantByVowels = new HashMap<>();
            cantByVowels.put("A",7);
            cantByVowels.put("E",7);
            cantByVowels.put("I",1);
            cantByVowels.put("O",2);
            cantByVowels.put("U",4);
            assertEquals(cantByVowels,exercisesSevenToEleven.exerciseElevenKnowVowelsOfText("Esta es una frace que cuenta las vocales - a e i o u"));
        }

    }
}