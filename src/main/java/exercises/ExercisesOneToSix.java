package exercises;

import javax.xml.bind.ValidationException;
import java.util.logging.Logger;

public class ExercisesOneToSix {
    Logger logger = Logger.getLogger("logger");
    static final double PI = 3.1416;
    static final double IVA = 0.79;

    public String exerciseOneComparateNumbers(int number1, int number2){
        return (number1 > number2) ? (number1 + " es mayor que "+number2) :
                (number1 < number2) ? (number2 + " es mayor que " + number1) :
                        ("Los numeros son iguales");
    }

    public String exerciseTwoComparateNumbers(String number1, String number2){
        try {
            return exerciseOneComparateNumbers(Integer.parseInt(number1), Integer.parseInt(number2));
        }catch (NumberFormatException e){
            throw new NumberFormatException("Solo debe digitar numeros");
        }

    }

    public double exerciseThreeCalculateCircleArea(String radioCircle){
        try {
            return PI * Math.pow(Double.parseDouble(radioCircle),2);

        }catch (NumberFormatException e){
            throw new NumberFormatException("El radio del circulo debe ser un numero");
        }
    }

    public double exerciseFourCalculateFinalPrice(String priceInitial) throws ValidationException {
        try {
            double productPrice = Double.parseDouble(priceInitial);

            if (productPrice > 0){
                return productPrice * IVA;
            } else {
                throw new ValidationException("El precio del producto no puede ser menor a 0");
            }

        }catch (NumberFormatException e){
            throw new NumberFormatException("El precio inicial del producto debe ser un numero");
        }
    }

    public String nowIfAnumberIsPeerOrOdd(int num){
        return  (num % 2 == 0) ? "El número " + num + " es PAR" : "El número " + num + " es IMPAR";
    }

}

