package com.SimuladorCoches.marcas.seat.motores;

import com.SimuladorCoches.Tools;
import com.SimuladorCoches.motor.Motor;

public class seat_4cyl330HP_400nm extends Motor {
    public seat_4cyl330HP_400nm(double torque, double masa) {
        super(torque, masa);
    }

    @Override
    //de forma aleatoria se genera un fallo catastrofico de motor
    public boolean existsCatastrophicDamage() {
        double p = Tools.generadorFallos(1.0,100.0);
        if ( p  > 99.91 ) {
            return true;
        }
        else {
            return false;
        }
    }
}
