package exercises.seventeen;

import java.util.Random;

public class Persona {
    private String name= Constans.STRING_VACIO;
    private Integer yearsOld=Constans.NUMBER_DEDEFAULT;
    private String DNI;
    private String gender=Constans.GENDER_DEFAULT;
    private double weight=Constans.DOUBLE_DEDEFAULT;
    private double height=Constans.DOUBLE_DEDEFAULT;


    public Persona() {
        this.generarDNI();
    }

    public Persona(String name, Integer yearsOld, String gender) {
        this.name = name;
        this.yearsOld = yearsOld;
        this.gender = gender;
    }

    public Persona(String name, Integer yearsOld, String DNI, String gender, double weight, double height) {
        this.name = name;
        this.yearsOld = yearsOld;
        this.DNI = DNI;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }

    public Integer calculateIMC(){
        double imc = this.weight /  Math.pow(this.height, 2);
        if(imc < 20) {
            return -1;
        }else if(imc >=20 && imc <= 25){
            return 0;
        }else {
            return 1;
        }
    }

    public boolean esMayorDeEdad(){
        return yearsOld>=Constans.MAYOR_EDAD ? true : false;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", yearsOld=" + yearsOld +
                ", DNI='" + DNI + '\'' +
                ", gender='" + gender + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    private void generarDNI(){
        String [] abecedario = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                "K", "L", "M","N","O","P","Q","R","S","T","U","V","W", "X","Y","Z" };
        int numRandon = (int) Math.round(Math.random() * 26 ) ;
        Random ramdom = new Random();
        int numumberDNI = ramdom.nextInt(10000000)+1;
        this.DNI = abecedario[numRandon] + numumberDNI ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearsOld(Integer yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
