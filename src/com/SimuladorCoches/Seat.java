package com.SimuladorCoches;

public class Seat extends Coche {
    public Seat(String modelo, double velocidadMaximaKMH) {
        super(modelo, velocidadMaximaKMH);
    }

    public Seat(String modelo, int dorsal, double velocidadMaximaKMH, Motor motor, Ruedas ruedas) {
        super(modelo, dorsal, velocidadMaximaKMH, motor, ruedas);
    }
}
