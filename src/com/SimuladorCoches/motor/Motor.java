package com.SimuladorCoches.motor;

//Clase motor con sus variables
public abstract  class Motor implements Motor_Actions{
    public double torqueMax;
    public double masa;


    public Motor(double torqueMax, double masa) {
        this.torqueMax = torqueMax;
        this.masa = masa;
    }


}
