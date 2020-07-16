package com.SimuladorCoches.coche;

import com.SimuladorCoches.neumaticos.Neumaticos;
import com.SimuladorCoches.Tools;
import com.SimuladorCoches.motor.Motor;

public abstract class Coche {

    public String modelo;
    private double velocidadMaximaKMH;
    public double odometro=0;
    double velocidadActualKMH =0;
    double aceleracion=0;
    double masaTotal;
    double masaChasis=1200;
    public int dorsal;
    public Motor motor;
    public Neumaticos ruedas;

    public Coche(String modelo, double velocidadMaximaKMH) {
        this.modelo = modelo;
        this.velocidadMaximaKMH = velocidadMaximaKMH;
    }

    public Coche(String modelo, int dorsal, double velocidadMaximaKMH, Motor motor, Neumaticos ruedas) {
        this.modelo = modelo;
        this.dorsal = dorsal;
        this.velocidadMaximaKMH = velocidadMaximaKMH;
        this.motor = motor;
        this.ruedas= ruedas;
        this.masaTotal = masaChasis+motor.masa+ruedas.masa;
    }

    public double velocidadActual(double crono) {
        //aqui podemos calcular la acceleracion
        // a = ( Vfinal - Vinicial ) / t
        // puesto que t = 1 s -> a = Vfinal - Vinicial
        double a = this.motor.torqueMax / this.masaTotal;
        double Vactual = 0;
        double t = crono;
        double Vfinal = Vactual + a * t;
        //double vfinal = Tools.randomConLimites(0,this.velocidadMaximaKMH);
        //this.aceleracion = Vfinal - this.velocidadActualKMH;
        this.aceleracion = a;
        if (Vfinal > this.velocidadMaximaKMH) {
            Vfinal = this.velocidadMaximaKMH;
        }
        else {
            this.velocidadActualKMH = Vfinal;
        }
        return velocidadActualKMH;
    }

    public void correr(double crono) {
        //Aqui convierto los Km/H a m/s
        this.odometro += Tools.kmh2ms(this.velocidadActual(crono));
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + modelo + '\'' +
                ", velocidadMaximaKMH=" + velocidadMaximaKMH +
                ", odometro=" + odometro +
                ", velocidadActualKMH=" + velocidadActualKMH +
                ", aceleracion=" + aceleracion +
                ", masaTotal=" + masaTotal +
                ", masaChasis=" + masaChasis +
                ", dorsal=" + dorsal +
                ", motor.torque=" + motor.torqueMax +
                '}';
    }
}
