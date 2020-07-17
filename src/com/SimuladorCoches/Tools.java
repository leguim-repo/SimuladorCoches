package com.SimuladorCoches;

import com.SimuladorCoches.coche.Coche;
import com.SimuladorCoches.marcas.seat.Seat;
import com.SimuladorCoches.marcas.seat.motores.seat_oem_4cyl190HP_400nm;
import com.SimuladorCoches.marcas.seat.motores.seat_cupra_4cyl300HP_450nm;
import com.SimuladorCoches.marcas.seat.neumaticos.Neumaticos_serie;
import com.SimuladorCoches.motor.Motor;

import java.util.ArrayList;
import java.util.Random;

//Clase con herramientas y otras cosas
public class Tools {

    public static String getTimeMinutes(int time){
        return String.format("%02d'%02d\"",((time % 3600) / 60), (time % 60));
    }

    public static double generadorFallos(double rangeMin, double rangeMax) {
        Random r = new Random();
        double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        return randomValue;
    }

    public static int dorsalesRandom(int max) {
        Random objGenerator = new Random();
        int randomNumber = objGenerator.nextInt(max);
        return randomNumber;
    }

    public static double randomConLimites(double lower, double upper) {
        return (Math.random() * (upper - lower)) + lower;
    }


    // metodo para crear un arraylist de motores automaticamente
    static ArrayList<Motor> crearMotores(int numero) {
        ArrayList<Motor> listamotores = new ArrayList<Motor>();
        while(listamotores.size()<numero) {
            //seat_cupra_4cyl300HP_450nm motor_seat = new seat_cupra_4cyl300HP_450nm(400,90);
            seat_cupra_4cyl300HP_450nm seat_motor_cupra = new seat_cupra_4cyl300HP_450nm();
            seat_oem_4cyl190HP_400nm seat_motor_oem = new seat_oem_4cyl190HP_400nm();
            listamotores.add(seat_motor_oem);

            //listamotores.add(seat_motor_cupra);
        }
        return listamotores;
    }

    // metodo para generar los participantes automaticamente
    static ArrayList<Coche> crearParticipantes(int numero) {

        String[] modelos = {"Seat Leon", "Seat Leon Cupra", "Seat Ibiza", "Seat Ibiza Cupra"};

        ArrayList<Coche> participantes = new ArrayList<Coche>();
        Coche car;

        Neumaticos_serie neumaticos = new Neumaticos_serie(80);

        while(participantes.size()<numero) {
            car= new Seat(modelos[(int)(Math.random()*modelos.length)],
                    dorsalesRandom(20),
                    330,
                    crearMotores(numero).get((int) randomConLimites(0,numero)),
                    neumaticos);
            participantes.add(car);
        }
        return participantes;
    }
    public static double kmh2ms(double kmh) {
        return kmh/3.6;
    }
}