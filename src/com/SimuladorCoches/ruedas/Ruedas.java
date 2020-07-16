package com.SimuladorCoches.ruedas;

import com.SimuladorCoches.Tools;

public class Ruedas {
    String modelo;
    public double masa;
    double calidad; // probabilidad de que explote
    int tipo;


    public Ruedas(double masa) {
        this.masa = masa;
        this.calidad = Tools.randomConLimites(0,100);
    }

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
