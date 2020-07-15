package com.SimuladorCoches;

import java.util.ArrayList;
import java.util.Random;

class Tools {

    static int dorsalesRandom(int max) {
        Random objGenerator = new Random();
        int randomNumber = objGenerator.nextInt(max);
        return randomNumber;
    }

    static double randomConLimites(double lower, double upper) {
        return (Math.random() * (upper - lower)) + lower;
    }

    // metodo para crear motores
    static ArrayList<Motor> crearMotores(int numero,double torqueMin, double torqueMax) {
        ArrayList<Motor> listamotores = new ArrayList<Motor>();
        while(listamotores.size()<numero) {
            Motor m = new Motor("2cyl300hp",Tools.randomConLimites(torqueMin,torqueMax),90);
            listamotores.add(m);
        }
        return listamotores;
    }

    // metodo para generar los participantes
    static ArrayList<Coche> crearParticipantes(int numero) {
        String[] marcas = {"Cupra", "Seat", "Audi", "VW", "Skoda"};
        ArrayList<Coche> participantes = new ArrayList<Coche>();
        Coche car;

        Ruedas ruedas = new Ruedas(80);

        while(participantes.size()<numero) {
            car= new Coche(marcas[(int)(Math.random()*marcas.length)],
                    dorsalesRandom(20),
                    330,
                    crearMotores(numero,300,400).get((int) randomConLimites(0,numero)),
                    ruedas);
            participantes.add(car);
        }
        return participantes;
    }
    static double kmh2ms(double kmh) {
        return kmh/3.6;
    }
}
