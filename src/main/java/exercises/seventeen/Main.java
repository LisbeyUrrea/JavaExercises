package exercises.seventeen;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    Logger logger = Logger.getLogger("logger");
    Scanner scanner = new Scanner(System.in);
    Persona persona = new Persona();

    public static void main(String[] args) {
    Main main = new Main();
    main.getDataUser();
    }

    private void getDataUser(){
        logger.log(Level.INFO,"Por favor digite su nombre");
        String name = scanner.nextLine();

        logger.log(Level.INFO,"Por favor digite su edad");
        Integer yearsOld = scanner.nextInt();

        logger.log(Level.INFO,"Por favor digite su genero (F ó M)");
        String gender = scanner.nextLine();

        logger.log(Level.INFO,"Por favor digite su peso en KG");
        double weight = scanner.nextDouble();

        logger.log(Level.INFO,"Por favor altura su peso CM");
        double height = scanner.nextDouble();

        Persona personOne = new Persona();
        personOne.setGender(gender);
        personOne.setName(name);
        personOne.setWeight(weight);
        personOne.setHeight(height);
        personOne.setYearsOld(yearsOld);

        Persona personTwo = new Persona();
        personTwo.setGender(gender);
        personTwo.setName(name);
        personTwo.setYearsOld(yearsOld);

        Persona personThree = new Persona();
        personThree.setGender(gender);
        personThree.setName(name);
        personThree.setWeight(weight);
        personThree.setHeight(height);
        personThree.setYearsOld(yearsOld);

        Integer haveIdealWeightPersonOne = personOne.calculateIMC();
        String haveIdealWeightPerson1 = "la persona 1 tiene "+this.personHaveIdealWeight(haveIdealWeightPersonOne);
        logger.log(Level.INFO,haveIdealWeightPerson1);
        logger.log(Level.INFO,this.isAdult(personOne));


        Integer haveIdealWeightPersonTwo = personTwo.calculateIMC();
        String haveIdealWeightPerson2 = "la persona 2 tiene "+this.personHaveIdealWeight(haveIdealWeightPersonTwo);
        logger.log(Level.INFO,haveIdealWeightPerson2);
        logger.log(Level.INFO,this.isAdult(personTwo));



        Integer haveIdealWeightPersonThree = personThree.calculateIMC();
        String haveIdealWeightPerson3 = "la persona 3 tiene "+this.personHaveIdealWeight(haveIdealWeightPersonThree);
        logger.log(Level.INFO,haveIdealWeightPerson3);
        logger.log(Level.INFO,this.isAdult(personThree));


    }

    public String personHaveIdealWeight(Integer personResult){

        if(personResult==-1){
            return "bajo de peso.";
        }else if(personResult == 0){
            return"peso ideal.";
        }else if(personResult == 1){
            return "sobrepeso.";
        }
        return "";
    }

    public String isAdult(Persona person){
        boolean isAdultThePerson = persona.esMayorDeEdad();
        if(isAdultThePerson){
            return "Es mayor de edad";
        }else {
            return "Es menor de edad";
        }
    }

}
