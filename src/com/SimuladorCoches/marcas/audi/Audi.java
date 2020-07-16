package com.SimuladorCoches.marcas.audi;

import com.SimuladorCoches.coche.Coche;
import com.SimuladorCoches.motor.Motor;
import com.SimuladorCoches.neumaticos.Neumaticos;

public class Audi extends Coche {

    public Audi(String modelo, double velocidadMaximaKMH) {
        super(modelo, velocidadMaximaKMH);
    }

    public Audi(String modelo, int dorsal, double velocidadMaximaKMH, Motor motor, Neumaticos ruedas) {
        super(modelo, dorsal, velocidadMaximaKMH, motor, ruedas);
    }
}
