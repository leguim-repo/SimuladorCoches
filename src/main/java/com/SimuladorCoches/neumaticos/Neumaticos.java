package main.SimuladorCoches.neumaticos;

import main.SimuladorCoches.Tools;

public abstract class Neumaticos implements Neumaticos_Actions {
    String modelo;
    public double masa;
    double calidad; // probabilidad de que explote
    int tipo;


    public Neumaticos(double masa) {
        this.masa = masa;
        this.calidad = Tools.randomConLimites(0,100);
    }


}
