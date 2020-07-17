package main.SimuladorCoches.marcas.seat;

import main.SimuladorCoches.coche.Coche;
import main.SimuladorCoches.motor.Motor;
import main.SimuladorCoches.neumaticos.Neumaticos;

public class Seat extends Coche {
    public Seat(String modelo, double velocidadMaximaKMH) {
        super(modelo, velocidadMaximaKMH);
    }

    public Seat(String modelo, int dorsal, double velocidadMaximaKMH, Motor motor, Neumaticos ruedas) {
        super(modelo, dorsal, velocidadMaximaKMH, motor, ruedas);
    }

    public Seat(Tipo tipo) {
        super(tipo);
    }
}
