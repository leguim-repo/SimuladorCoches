package com.SimuladorCoches.carrera;

import com.SimuladorCoches.circuito.Circuito;
import com.SimuladorCoches.coche.Coche;

import java.util.ArrayList;
import java.util.Arrays;

class tiempo {
    String marca;
    int dorsal;
    double crono;
    public tiempo(String marca, int dorsal, double crono) {
        this.marca = marca;
        this.dorsal = dorsal;
        this.crono = crono;
    }
}
// Clase para controlar/gestionar la carrera
public class Carrera {
    Circuito circuito;
    int numeroVueltas;
    double longitudCarrera;
    ArrayList<Coche> participantes;
    private ArrayList<tiempo> tablaTiempos;
    private ArrayList<tiempo> tablaDNF; // corredores que no acaban la carrera por fallos mecanicos

    public Carrera(Circuito circuito, int numeroVueltas, ArrayList<Coche> participantes) {
        this.circuito = circuito;
        this.numeroVueltas = numeroVueltas;
        this.participantes = participantes;
        this.longitudCarrera = numeroVueltas * circuito.longitud;
        this.tablaTiempos = new ArrayList<tiempo>();
        this.tablaDNF = new ArrayList<tiempo>();

    }

    void imprimirTiempos() {
        System.out.println("\n\nTabla de tiempos");
        for (tiempo t: tablaTiempos) {
            System.out.println(t.marca+" "+t.dorsal+" "+t.crono);
        }
        System.out.println("\nCorredores que no han acabado");
        for (tiempo t: tablaDNF) {
            System.out.println(t.marca+" "+t.dorsal+" "+t.crono);
        }
    }

    // comprobacion si ha llegado a la meta
    ArrayList<Coche> checkWinner(ArrayList<Coche> corredoresCopia,int crono) {
        for (Coche corredor: corredoresCopia) {
            if (corredor.odometro > this.longitudCarrera) {
                corredoresCopia.remove(corredor);
                this.tablaTiempos.add(new tiempo(corredor.modelo,corredor.dorsal,crono));
                return corredoresCopia;
            }
        }
        return corredoresCopia;
    }

    // generacion de fallos mecanicos
    ArrayList<Coche> generarFallosMecanicos(ArrayList<Coche> corredores,int crono) {
        ArrayList<Coche> siguenEnCarrera= new ArrayList<>(); //copio el array de participantes
        for (Coche corredor: corredores) {
            if (Arrays.asList( corredor.ruedas.existsCatastrophicDamage(),corredor.motor.existsCatastrophicDamage() ).contains(true)){
                //este se pasa a lista que no acaban
                this.tablaDNF.add(new tiempo(corredor.modelo,corredor.dorsal,0));
                }
            else {
                //lista corredores que siguen en pie
                siguenEnCarrera.add(corredor);
            }
            }
        return siguenEnCarrera;
    }

    public void simularCarrera(){
        //en esta simulacion corren los coches en paralelo
        int crono=0;
        // la simulacion la realizo con una copia de la lista de participantes
        ArrayList<Coche> corredoresCopia= new ArrayList<>(participantes); //copio el array de participantes

        do {
            for (Coche corredor: corredoresCopia) {
                corredor.correr(crono);
                System.out.println(corredor.toString());
            }

            corredoresCopia=this.checkWinner(corredoresCopia,crono);
            corredoresCopia=this.generarFallosMecanicos(corredoresCopia,crono);

            crono +=1;
            System.out.println("crono: "+crono+" s");
        } while(!corredoresCopia.isEmpty());

        imprimirTiempos();
    }
}



