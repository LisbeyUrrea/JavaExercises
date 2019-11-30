package exercises;
import javax.xml.bind.ValidationException;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    ExercisesOneToSix exercisesOneToSix = new ExercisesOneToSix();
    ExercisesSevenToEleven exercisesSevenToEleven = new ExercisesSevenToEleven();
    ExercisesTwelveToFifteen exercisesTwelveToFifteen = new ExercisesTwelveToFifteen();
    Logger logger = Logger.getLogger("logger");
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();

         main.menu();

    }

    void menu(){
        logger.log(Level.INFO,"Por favor digite el numero del ejercicio que quiere correr (solo 1 al 17)");
        String exerciseNumber = scanner.next();
        try {
            int number = Integer.parseInt(exerciseNumber);
            if(number > 0 && number < 18){
                switch (number){
                    case 1 :
                        this.exerciseOneComparateNumbers();
                        break;
                    case 2 :
                        this.exerciseTwoComparateNumbers();
                        break;
                    case 3 :
                        this.exerciseThreeCalculateCircleArea();
                        break;
                    case 4 :
                        this.exerciseFourCalculateFinalPrice();
                        break;
                    case 5 :
                        this.exerciseFiveNumbersPeersAndOdd();
                        break;
                    case 6 :
                        this.exerciseSixNumbersPeersAndOdd();
                        break;
                    case 7 :
                        this.exerciseSevenComparateOneNumber();
                        break;
                    case 8 :
                        this.exerciseEightNowIfADayIsWeekend();
                        break;
                    case 9 :
                        this.exerciseNineReplaceCarater();
                        break;
                    case 10 :
                        this.exerciseTenRemoveBlancks();
                        break;
                    case 11 :
                        this.exerciseEleven();
                        break;
                    case 12 :
                    	 scanner = new Scanner(System.in);
                    	 logger.log(Level.INFO,() -> "Digite un frase");
                         String textOne = scanner.nextLine();
                         logger.log(Level.INFO,() -> "Digite un frase");
                         String textTwo = scanner.nextLine();
                         logger.log(Level.INFO, exercisesTwelveToFifteen.exercisesTwelveComparateToText(textOne, textTwo));
                        break;
                    case 13 :
                    	 logger.log(Level.INFO, exercisesTwelveToFifteen.exercisesThirteenGetActualDate());
                        break;  
                    case 14 :
                    	 logger.log(Level.INFO,() -> "digite un numero menor de 1000");
                    	 String numberToCalcuate = scanner.next();
                    	 String message = "Los numeros para completar 1000 son : "+ exercisesTwelveToFifteen.exercisesFourteen(numberToCalcuate);
                    	 logger.log(Level.INFO, message);
                    	 break;
                    case 15 :
                   	   this.exerciseFifteen();
                       break;
                    	   
                    default:
                        break;

                }
            }else {
                throw new ValidationException("El numero digitado no corresponde a ningun ejercicio");
            }

        }catch (NumberFormatException | ValidationException e){
            throw new NumberFormatException("El caracter digitado no es un número");
        }

    }

    void exerciseOneComparateNumbers(){
        String result = exercisesOneToSix.exerciseOneComparateNumbers(1,4);
        logger.log(Level.INFO, result);
    }

    void exerciseTwoComparateNumbers(){
        String num1;
        String num2;
        logger.log(Level.INFO,"Digite un numero");
        num1=scanner.next();
        logger.log(Level.INFO,"Digite otro numero");
        num2=scanner.next();
        String result = exercisesOneToSix.exerciseTwoComparateNumbers(num1, num2);
        logger.log(Level.INFO, result);

    }

    void  exerciseThreeCalculateCircleArea(){
        String radioCircle;
        logger.log(Level.INFO,"Digite el radio del circulo");
        radioCircle=scanner.next();

        String circleArea = "El area del circulo con un radio de "+radioCircle+" es: "+ exercisesOneToSix.exerciseThreeCalculateCircleArea(radioCircle);

        logger.log(Level.INFO,  circleArea);
    }

    void exerciseFourCalculateFinalPrice() throws ValidationException {
        String productPrice;
        logger.log(Level.INFO,"Digite el rprecio del producto");
        productPrice=scanner.next();

        String finalProductPrice = "el precio final producto con el 21% de descuento es de: "+ exercisesOneToSix.exerciseFourCalculateFinalPrice(productPrice);

        logger.log(Level.INFO,  finalProductPrice);
    }

    public void exerciseFiveNumbersPeersAndOdd(){
        int i = 1;
        while (i <= 100) {
            String mensaje = exercisesOneToSix.nowIfAnumberIsPeerOrOdd(i);
            logger.log(Level.INFO, mensaje);
        }
    }

    public void exerciseSixNumbersPeersAndOdd(){
        int i = 1;
        for(i=1; i <= 100; i++){
            String mensaje = exercisesOneToSix.nowIfAnumberIsPeerOrOdd(i);
            logger.log(Level.INFO, mensaje);

        }
    }

    void exerciseSevenComparateOneNumber(){
        logger.log(Level.INFO,"Digite un numero mayor o igual que cero.");
        String mensaje;
        do {
            String number = scanner.next();
            mensaje = exercisesSevenToEleven.exerciseSevenComparateOneNumber(number);
            if (mensaje.equals("MENOR")){
                logger.log(Level.INFO,"El número digitado es menor a 0, por favor digita otro numero que sea mayor o igual a O");
            }else {
                logger.log(Level.INFO,mensaje);
            }

        }while ( mensaje.equals("MENOR") );


    }

    void exerciseEightNowIfADayIsWeekend() throws ValidationException {
        logger.log(Level.INFO,"Por favor digita un numero (1-7) para saber si es Fin de semana o semana \n1. Lunes \n 2. Martes \n 3. Miercoles \n 4. Jueves \n 5. Viernes \n 6. Sabado \n 7. Domingo");
        String dayOfWeek = scanner.next();
         String result = exercisesSevenToEleven.exerciseEightNowIfADayIsWeekend(dayOfWeek);
        logger.log(Level.INFO, result);

    }

    void exerciseNineReplaceCarater(){
        logger.log(Level.INFO,"Digite una frase");
        scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();

        String fraseToChange = "La sonrisa sera la mejor arma contra la tristeza";
        String sentenceCanged = exercisesSevenToEleven.exerciseNineReplaceCarater(fraseToChange) + " "+ sentence;
        logger.log(Level.INFO,sentenceCanged);
    }

    void exerciseTenRemoveBlancks(){
        logger.log(Level.INFO,() -> "Digite un texto");
        scanner = new Scanner(System.in);
        String texto = scanner.nextLine();

        String textWhitoutBlanks = exercisesSevenToEleven.exerciseTenRemoveBlancks(texto);

        logger.log(Level.INFO,textWhitoutBlanks);
    }

    void exerciseEleven(){
        logger.log(Level.INFO,() -> "Digite un frase");
        scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        Map<String,Object> cantVowels = exercisesSevenToEleven.exerciseElevenKnowVowelsOfText(texto);
        String message = "La frase tiene una longitud de "+exercisesSevenToEleven.exerciseElevenKnowThelengthOfText(texto) + " Caracteres \n "+
                "Cantidad de vocales en la frase\n"+
                " A -> "+cantVowels.get("A")+"\n"+
                " E -> "+cantVowels.get("E")+"\n"+
                " I -> "+cantVowels.get("I")+"\n"+
                " O -> "+cantVowels.get("O")+"\n"+
                " U -> "+cantVowels.get("U")+"\n";

        logger.log(Level.INFO,message);


    }
    
    void exerciseFifteen(){
    	String message = "Digite un numero de la siguiente lista. \n"+
    			"*****GESTION CINEMATOGR�FICA***** \n"+
                "1-NUEVO ACTOR\n"+
                "2-BUSCAR ACTOR\n"+
                "3-ELIMINAR ACTOR \n"+
                "4-MODIFICAR ACTOR \n"+
                "5-VER TODOS LOS ACTORES \n"+
                "6- VER PELICULAS DE LOS ACTORES \n"+
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES \n"+
                "8-SALIR \n";
    	
        logger.log(Level.INFO,message);
        String number = null;
        do {
            number = scanner.next();
            boolean validate = number.equals("1") || number.equals("2") || number.equals("3") || number.equals("4") || number.equals("5") || number.equals("6") || number.equals("7") || number.equals("8");
            if(!validate) {
            	logger.log(Level.INFO,"OPCION INCORRECTA.");
            	logger.log(Level.INFO,message);
            }else {
            	logger.log(Level.INFO,"Digito la Opcion "+number);
            }

        }while (!number.equals("8"));

        logger.log(Level.INFO,"SALIO EXITOSAMENTE.");
    }
}
