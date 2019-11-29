package exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import javax.xml.bind.ValidationException;

import static org.junit.jupiter.api.Assertions.*;

class ExercisesOneToSixTest {
    ExercisesOneToSix exercisesOneToSix;
    @BeforeEach
    void setUp() {
        exercisesOneToSix = new ExercisesOneToSix();
    }

    @Nested
    @DisplayName("Exercise One")
    class ExerciseOne{

        @Test
        void shouldBeHigherNumberOne() {
            int number1 = 10;
            int number2 = 5;
            String mensaje = exercisesOneToSix.exerciseOneComparateNumbers(number1,number2);

            assertEquals(number1 + " es mayor que "+number2, mensaje);
        }
        @Test
        void shouldBeHigherNumberTwo() {
            int number1 = 10;
            int number2 = 55;
            String mensaje = exercisesOneToSix.exerciseOneComparateNumbers(number1,number2);

            assertEquals(number2 + " es mayor que "+number1, mensaje);
        }

        @Test
        void shouldBeEquals() {
            String mensaje = exercisesOneToSix.exerciseOneComparateNumbers(10,10);
            assertEquals("Los números son iguales", mensaje);
        }

    }

    @Nested
    @DisplayName("Exercise Two")
    class ExerciseTwo{
        @Test
        void shouldBeHigherNumberOne() {
            String number1 = "10";
            String number2 = "5";
            String mensaje = exercisesOneToSix.exerciseTwoComparateNumbers(number1,number2);

            assertEquals(number1 + " es mayor que "+number2, mensaje);
        }
        @Test
        void shouldBeHigherNumberTwo() {
            String number1 = "10";
            String number2 = "55";
            String mensaje = exercisesOneToSix.exerciseTwoComparateNumbers(number1,number2);

            assertEquals(number2 + " es mayor que "+number1, mensaje);
        }

        @Test
        void shouldBeEquals() {
            String mensaje = exercisesOneToSix.exerciseTwoComparateNumbers("10","10");
            assertEquals("Los números son iguales", mensaje);
        }
        @Test
        void shouldReturnNumberFormatException() {
            assertThrows(NumberFormatException.class, ()-> exercisesOneToSix.exerciseTwoComparateNumbers("l","10"));
        }

    }

    @Nested
    @DisplayName("Exercise Three")
    class ExerciseThree{

        @Test
        void shouldCalculateCircleArea(){
            assertEquals(706.86, exercisesOneToSix.exerciseThreeCalculateCircleArea("15"));
        }

        @Test
        void shouldReturnNumberFormatException(){
            assertThrows(NumberFormatException.class, () -> exercisesOneToSix.exerciseThreeCalculateCircleArea("w"));
        }
    }

    @Nested
    @DisplayName("Exercise Four")
    class ExerciseFour{

        @Test
        void souldCalculateNewProductPriceWith21PorcentOfDescount() throws ValidationException {
            assertEquals(79000.0, exercisesOneToSix.exerciseFourCalculateFinalPrice("100000"));
        }

        @Test
        void souldReturnValidationException(){
            assertThrows(ValidationException.class,()-> exercisesOneToSix.exerciseFourCalculateFinalPrice("-100000"));
        }

        @Test
        void souldReturNumberFormatException(){
            assertThrows(NumberFormatException.class,()-> exercisesOneToSix.exerciseFourCalculateFinalPrice("l"));
        }
    }

    @Nested
    @DisplayName("Exercise Five and Six")
    class ExerciseFiveAndSix{

        @Test
        void shouldReturnPeer(){
            int number = 6;
            assertEquals("El número " + number + " es PAR",exercisesOneToSix.nowIfAnumberIsPeerOrOdd(number) );
        }

        @Test
        void shouldReturnOdd(){
            int number = 5;
            assertEquals("El número " + number + " es IMPAR",exercisesOneToSix.nowIfAnumberIsPeerOrOdd(number) );
        }
    }
}