package com.SimuladorCoches;

import com.SimuladorCoches.carrera.Carrera;
import com.SimuladorCoches.circuito.Circuito;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Variables para la simulacion
        //circuito
        Circuito cirCatalunya;
        cirCatalunya = new Circuito("Circuit de Catalunya", 4655, 14);

        //competicion
        Carrera competicion;

        competicion = new Carrera(cirCatalunya,2,Tools.crearParticipantes(5));
        competicion.simularCarrera();
    }
}
