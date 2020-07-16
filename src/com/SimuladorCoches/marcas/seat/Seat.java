package com.SimuladorCoches.marcas.seat;

import com.SimuladorCoches.coche.Coche;
import com.SimuladorCoches.motor.Motor;
import com.SimuladorCoches.neumaticos.Neumaticos;

public class Seat extends Coche {
    public Seat(String modelo, double velocidadMaximaKMH) {
        super(modelo, velocidadMaximaKMH);
    }

    public Seat(String modelo, int dorsal, double velocidadMaximaKMH, Motor motor, Neumaticos ruedas) {
        super(modelo, dorsal, velocidadMaximaKMH, motor, ruedas);
    }
}
