package com.SimuladorCoches;

import com.SimuladorCoches.carrera.Carrera;
import com.SimuladorCoches.circuito.Circuito;
import com.SimuladorCoches.coche.Coche;
import com.SimuladorCoches.marcas.seat.Seat;

import java.util.zip.CheckedOutputStream;

public class Test {

    enum Tipo {
        OEM,
        CUPRA,
        RACER
    }
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

        competicion = new Carrera(cirCatalunya,2,Tools.crearParticipantes(5));
        competicion.simularCarrera();

        //competicion = new Carrera(cirCastelloli,5,Tools.crearParticipantes(5));
        //competicion.simularCarrera();

        //Este es durisimo no lo aguantan
        //competicion = new Carrera(cirNordschleife,1,Tools.crearParticipantes(10));
        //competicion.simularCarrera();


        //pruebas.....para generar tipos de coches diferentes y asignar el motor de forma automatica
        /*
        System.out.println("enum");
        System.out.println(Tipo.CUPRA);
        System.out.println((int)Tools.randomConLimites(0,Tipo.values().length));
        */
        for (int x=0; x < 5; x++) {

            //System.out.println(Tipo.values()[(int) Tools.randomConLimites(0, Tipo.values().length)]);
            //Coche cc = new Seat(Coche.Tipo.values()[(int) Tools.randomConLimites(0, Coche.Tipo.values().length)]);
            Coche cc = new Seat(Coche.Tipo.OEM);
            System.out.println(cc.tipo);

        }



    }
}
