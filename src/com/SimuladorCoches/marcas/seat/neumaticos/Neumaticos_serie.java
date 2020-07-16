package com.SimuladorCoches.marcas.seat.neumaticos;

import com.SimuladorCoches.Tools;
import com.SimuladorCoches.neumaticos.Neumaticos;

public class Neumaticos_serie extends Neumaticos {
    public Neumaticos_serie(double masa) {
        super(masa);
    }

    @Override
    //de forma aleatoria explotan las ruedas
    public boolean existsCatastrophicDamage() {
        double p = Tools.generadorFallos(1.0,100.0);
        if ( p  > 99.65577 ) {
            return true;
        }
        else {
            return false;
        }

    }
}
