package com.SimuladorCoches;

public class Audi extends Coche{

    public Audi(String modelo, double velocidadMaximaKMH) {
        super(modelo, velocidadMaximaKMH);
    }

    public Audi(String modelo, int dorsal, double velocidadMaximaKMH, Motor motor, Ruedas ruedas) {
        super(modelo, dorsal, velocidadMaximaKMH, motor, ruedas);
    }
}
