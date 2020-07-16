package com.SimuladorCoches;

import com.SimuladorCoches.coche.Coche;
import com.SimuladorCoches.marcas.seat.Seat;
import com.SimuladorCoches.marcas.seat.motores.seat_4cyl330HP_400nm;
import com.SimuladorCoches.marcas.seat.neumaticos.Neumaticos_serie;
import com.SimuladorCoches.motor.Motor;

import java.util.ArrayList;
import java.util.Random;

public class Tools {

    public static double generadorFallos(double rangeMin, double rangeMax) {
        Random r = new Random();
        double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        return randomValue;
    }

    static int dorsalesRandom(int max) {
        Random objGenerator = new Random();
        int randomNumber = objGenerator.nextInt(max);
        return randomNumber;
    }

    public static double randomConLimites(double lower, double upper) {
        return (Math.random() * (upper - lower)) + lower;
    }

    // metodo para crear motores automaticamente
    static ArrayList<Motor> crearMotores(int numero, double torqueMin, double torqueMax) {
        ArrayList<Motor> listamotores = new ArrayList<Motor>();
        while(listamotores.size()<numero) {
            //Motor m = new Motor("2cyl300hp",Tools.randomConLimites(torqueMin,torqueMax),90);
            seat_4cyl330HP_400nm m = new seat_4cyl330HP_400nm(400,90);
            listamotores.add(m);
        }
        return listamotores;
    }

    // metodo para generar los participantes automaticamente
    static ArrayList<Coche> crearParticipantes(int numero) {
        String[] modelos = {"Seat Leon", "Seat Cupra Leon", "Seat Ibiza", "Seat Cupra Ibiza"};

        ArrayList<Coche> participantes = new ArrayList<Coche>();
        Coche car;

        Neumaticos_serie ruedas = new Neumaticos_serie(80);

        while(participantes.size()<numero) {
            car= new Seat(modelos[(int)(Math.random()*modelos.length)],
                    dorsalesRandom(20),
                    330,
                    crearMotores(numero,300,400).get((int) randomConLimites(0,numero)),
                    ruedas);
            participantes.add(car);
        }
        return participantes;
    }
    public static double kmh2ms(double kmh) {
        return kmh/3.6;
    }
}
