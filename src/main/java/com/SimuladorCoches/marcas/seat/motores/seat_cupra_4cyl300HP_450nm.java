package main.SimuladorCoches.marcas.seat.motores;

import main.SimuladorCoches.Tools;
import main.SimuladorCoches.motor.Motor;

public class seat_cupra_4cyl300HP_450nm extends Motor {

    public seat_cupra_4cyl300HP_450nm() {
        this.torqueMax=450;
        this.masa=80;
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
