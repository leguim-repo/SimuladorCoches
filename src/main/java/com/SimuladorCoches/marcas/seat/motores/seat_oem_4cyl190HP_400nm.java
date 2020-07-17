package main.SimuladorCoches.marcas.seat.motores;

import main.SimuladorCoches.Tools;
import main.SimuladorCoches.motor.Motor;

public class seat_oem_4cyl190HP_400nm extends Motor {
    public seat_oem_4cyl190HP_400nm() {
        this.torqueMax=400;
        this.masa=95;
    }

    @Override
    //de forma aleatoria se genera un fallo catastrofico de motor
    public boolean existsCatastrophicDamage() {
        double p = Tools.generadorFallos(1.0,100.0);
        if ( p  > 99.8134 ) {
            return true;
        }
        else {
            return false;
        }
    }
}
