package com.SimuladorCoches;

import com.SimuladorCoches.carrera.Carrera;
import com.SimuladorCoches.circuito.Circuito;
import com.SimuladorCoches.coche.Coche;
import com.SimuladorCoches.marcas.Seat;

public class Test {

    public static void main(String[] args) {
        Coche car;
        car = new Seat("Cupra",330);

        Circuito cirCatalunya;
        Circuito cirCastelloli;
        Circuito cirNordschleife;

        cirCatalunya = new Circuito("Circuit de Catalunya", 4655, 14);
        cirCastelloli = new Circuito("Parcmotor Castelloli", 4113, 11);
        cirNordschleife = new Circuito("Nordschleife",20832,90);

        System.out.println(cirCatalunya);
        System.out.println(cirCastelloli.toString());

        Carrera competicion;

        competicion = new Carrera(cirCatalunya,1,Tools.crearParticipantes(2));
        competicion.simularCarrera();

        //competicion = new Carrera(cirCastelloli,5,Tools.crearParticipantes(5));
        //competicion.simularCarrera();

        //competicion = new Carrera(cirNordschleife,5,Tools.crearParticipantes(5));
        //competicion.simularCarrera();
    }
}
