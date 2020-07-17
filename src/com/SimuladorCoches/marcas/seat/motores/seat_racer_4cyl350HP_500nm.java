package com.SimuladorCoches.marcas.seat.motores;

import com.SimuladorCoches.Tools;
import com.SimuladorCoches.motor.Motor;

public class seat_racer_4cyl350HP_500nm extends Motor {
    public seat_racer_4cyl350HP_500nm() {
        this.masa = 75;
        this.torqueMax= 500;
    }

    @Override
    //de forma aleatoria se genera un fallo catastrofico de motor
    public boolean existsCatastrophicDamage() {
        double p = Tools.generadorFallos(1.0,100.0);
        if ( p  > 99.96 ) {
            return true;
        }
        else {
            return false;
        }
    }
}
