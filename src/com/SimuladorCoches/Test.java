package com.SimuladorCoches;

public class Test {


    public static void main(String[] args) {
        Coche car;
        car = new Coche("Cupra",330);
        System.out.println(car.velocidadActual());

        Circuito cirCatalunya;
        Circuito cirCastelloli;
        Circuito cirNordschleife;

        cirCatalunya = new Circuito("Circuit de Catalunya", 4655, 14);
        cirCastelloli = new Circuito("Parcmotor Castelloli", 4113, 11);
        cirNordschleife = new Circuito("Nordschleife",20832,90);

        System.out.println(cirCatalunya);
        System.out.println(cirCastelloli.toString());

        Carrera competicion;
        competicion = new Carrera(cirCastelloli,5,Tools.crearParticipantes(5));
        competicion.simularCarrera();

        competicion = new Carrera(cirCastelloli,5,Tools.crearParticipantes(5));
        competicion.simularCarrera();

        competicion = new Carrera(cirNordschleife,5,Tools.crearParticipantes(5));
        competicion.simularCarrera();
    }
}
