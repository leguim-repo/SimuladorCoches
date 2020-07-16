package com.SimuladorCoches.marcas.seat.motores;

import com.SimuladorCoches.motor.Motor;

public class seat_4cyl190HP_400nm extends Motor {
    public seat_4cyl190HP_400nm() {
        this.torqueMax=400;
        this.masa=95;
    }

    @Override
    public boolean existsCatastrophicDamage() {
        return false;
    }
}
