package com.SimuladorCoches.motor;

import com.SimuladorCoches.Tools;

public class Motor {
    String modelo;
    public double torque;
    public double masa;


    public Motor(String modelo, double torque, double masa) {
        this.modelo = modelo;
        this.torque = torque;
        this.masa = masa;
    }

    //funcion desactivada esta siendo complejo regularlo de forma aleatoria
    public boolean existsCatastrophicDamage() {
        if ( Tools.randomConLimites(0,5) > 3 ) {
            return false;
        }
        else {
            return false;
        }

    }
}
