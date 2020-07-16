package com.SimuladorCoches.marcas.seat.motores;

import com.SimuladorCoches.motor.Motor;
import com.SimuladorCoches.motor.Motor_Actions;

public class seat_4cyl330HP_400nm extends Motor {
    public seat_4cyl330HP_400nm(double torque, double masa) {
        super(torque, masa);
    }

    @Override
    public boolean existsCatastrophicDamage() {
        return false;
    }
}


/*
    //funcion desactivada esta siendo complejo regularlo de forma aleatoria
    public boolean existsCatastrophicDamage() {
        if ( Tools.randomConLimites(0,5) > 3 ) {
            return false;
        }
        else {
            return false;
        }

    }
 */