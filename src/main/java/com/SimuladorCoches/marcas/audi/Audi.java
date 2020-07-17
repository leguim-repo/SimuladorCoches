package main.SimuladorCoches.marcas.audi;

import main.SimuladorCoches.coche.Coche;
import main.SimuladorCoches.motor.Motor;
import main.SimuladorCoches.neumaticos.Neumaticos;

public class Audi extends Coche {

    public Audi(String modelo, double velocidadMaximaKMH) {
        super(modelo, velocidadMaximaKMH);
    }

    public Audi(String modelo, int dorsal, double velocidadMaximaKMH, Motor motor, Neumaticos ruedas) {
        super(modelo, dorsal, velocidadMaximaKMH, motor, ruedas);
    }
}
