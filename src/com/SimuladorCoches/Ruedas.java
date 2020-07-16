package com.SimuladorCoches;

public class Ruedas {
    String modelo;
    double masa;
    double calidad; // probabilidad de que explote
    int tipo;


    public Ruedas(double masa) {
        this.masa = masa;
        this.calidad = Tools.randomConLimites(0,100);
    }

    //de forma aleatoria explotan las ruedas
    boolean existsCatastrophicDamage() {
        double p = Tools.generadorFallos(1.0,100.0);
        if ( p  > 99.65577 ) {
            return true;
        }
        else {
            return false;
        }

    }
}
