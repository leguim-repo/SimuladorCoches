package com.SimuladorCoches;

public class Motor {
    String modelo;
    double torque;
    double masa;


    public Motor(String modelo, double torque, double masa) {
        this.modelo = modelo;
        this.torque = torque;
        this.masa = masa;
    }

    //funcion desactivada esta siendo complejo regularlo de forma aleatoria
    boolean existsCatastrophicDamage() {
        if ( Tools.randomConLimites(0,5) > 3 ) {
            return false;
        }
        else {
            return false;
        }

    }
}
