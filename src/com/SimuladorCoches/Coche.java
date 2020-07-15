package com.SimuladorCoches;

public class Coche {

    String marca;

    public Coche(String marca, double velocidadMaximaKMH) {
        this.marca = marca;
        this.velocidadMaximaKMH = velocidadMaximaKMH;
    }

    private double velocidadMaximaKMH;
    double odometro=0;
    double velocidadActualKMH =0;
    double aceleracion=0;
    double masaTotal;
    double masaChasis=800;
    int dorsal;
    Motor motor;
    Ruedas ruedas;



    public Coche(String marca,int dorsal, double velocidadMaximaKMH, Motor motor, Ruedas ruedas) {
        this.marca = marca;
        this.dorsal = dorsal;
        this.velocidadMaximaKMH = velocidadMaximaKMH;
        this.motor = motor;
        this.ruedas= ruedas;
        this.masaTotal = masaChasis+motor.masa+ruedas.masa;
    }

    public double velocidadActual() {
        //aqui podemos calcular la acceleracion
        // a = ( Vfinal - Vinicial ) / t
        // puesto que t = 1 s -> a = Vfinal - Vinicial
        double vfinal = Tools.randomConLimites(0,this.velocidadMaximaKMH);
        this.aceleracion = vfinal - this.velocidadActualKMH;
        this.velocidadActualKMH = vfinal;
        return velocidadActualKMH;
    }

    public void correr() {
        //Aqui convierto los Km/H a m/s
        this.odometro += Tools.kmh2ms(this.velocidadActual());
    }


    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", velocidadMaximaKMH=" + velocidadMaximaKMH +
                ", odometro=" + odometro +
                ", velocidadActualKMH=" + velocidadActualKMH +
                ", aceleracion=" + aceleracion +
                '}';
    }
}
