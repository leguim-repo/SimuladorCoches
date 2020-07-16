package com.SimuladorCoches.circuito;

public class Circuito {
    String nombre;
    public double longitud;
    int numerocurvas;
    /*
     Las curvas quizas se podrian clasificar, ya que no todas las curvas son iguales
     suave, moderada, fuerte, neutra
     y aplicar un factor de frenada
     */

    public Circuito(String nombre, double longitud,int numerocurvas) {
        this.nombre = nombre;
        this.longitud = longitud;
        this.numerocurvas = numerocurvas;
    }

    @Override
    public String toString() {
        return "Circuito{" +
                "nombre='" + nombre + '\'' +
                ", longitud=" + longitud +
                '}';
    }
}
