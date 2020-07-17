package main.SimuladorCoches.marcas.audi.motores;

import main.SimuladorCoches.motor.Motor;

public class audi_4cyl330HP_450nm extends Motor {
    public audi_4cyl330HP_450nm(double torque, double masa) {
        super(torque, masa);
    }

    @Override
    public boolean existsCatastrophicDamage() {
        return false;
    }
}
