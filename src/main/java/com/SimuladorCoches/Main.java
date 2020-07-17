package com.SimuladorCoches;

import main.SimuladorCoches.carrera.Carrera;
import main.SimuladorCoches.circuito.Circuito;

public class Main {

    public static void main(String[] args) {
        //Variables para la simulacion
        //circuito
        Circuito cirCatalunya;
        cirCatalunya = new Circuito("Circuit de Catalunya", 4655, 14);

        //competicion
        Carrera competicion;

        competicion = new Carrera(cirCatalunya,2, main.SimuladorCoches.Tools.crearParticipantes(5));
        competicion.simularCarrera();
    }
}
