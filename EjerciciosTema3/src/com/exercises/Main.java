package com.exercises;

public class Main {

    public static void main(String[] args) {
        System.out.println("====================1ra parte=============================================");
        Main main = new Main();
        int resultado = main.suma(20, 1, 2);
        System.out.println("Resultado: "+ resultado);


        System.out.println("====================2da parte=============================================");
        Coche miCoche=new Coche();
        miCoche.agregarPuerta(3);
        miCoche.agregarPuerta(3);
        miCoche.agregarPuerta(3);
        System.out.println("Nro de puertas agregadas: "+miCoche.numeroPuertas);

    }

    private int suma(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }
}
