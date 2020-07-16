package com.SimuladorCoches.motor;

import com.SimuladorCoches.Tools;
//Clase motor con sus variables
public abstract  class Motor implements Motor_Actions{
    public double torque;
    public double masa;


    public Motor(double torque, double masa) {
        this.torque = torque;
        this.masa = masa;
    }


}
