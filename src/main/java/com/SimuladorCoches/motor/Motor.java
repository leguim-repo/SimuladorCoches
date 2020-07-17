package main.SimuladorCoches.motor;

//Clase motor con sus variables
public abstract  class Motor implements Motor_Actions{
    public String descripcion;
    public double torqueMax;
    public double masa;

    //constructor
    public Motor() {

    }
    //constructor de pruebas
    public Motor(double torqueMax, double masa) {
        this.torqueMax = torqueMax;
        this.masa = masa;
    }

}
