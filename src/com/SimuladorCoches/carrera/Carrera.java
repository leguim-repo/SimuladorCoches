package com.SimuladorCoches.carrera;

import com.SimuladorCoches.circuito.Circuito;
import com.SimuladorCoches.coche.Coche;

import java.util.ArrayList;
import java.util.Arrays;

class tiempo {
    String marca;
    int dorsal;
    double crono;
    String motivo;

    public tiempo(String marca, int dorsal, double crono) {
        this.marca = marca;
        this.dorsal = dorsal;
        this.crono = crono;
    }

    public tiempo(String marca, int dorsal, double crono, String motivo) {
        this.marca = marca;
        this.dorsal = dorsal;
        this.crono = crono;
        this.motivo = motivo;
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
        //esta funcion imprime los tiempos de los que han acabado y de los que no han finalizado la carrera
        //deberia existir solo una funcion con el for y pasarle el ArrayList
        System.out.print("\n\nTabla de tiempos\n----------------\n");
        for (tiempo t: tablaTiempos) {
            System.out.println("Vehiculo: "+t.marca+" Dorsal: "+t.dorsal+" Tiempo: "+t.crono+" s");
        }
        System.out.print("\n\nTabla de DNF\n----------------\n");
        for (tiempo t: tablaDNF) {
            System.out.println("Vehiculo: "+t.marca+" Dorsal: "+t.dorsal+" Motivo DNF: "+t.motivo);
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
        boolean falloNeumatico;
        boolean falloMotor;
        String razonFallo="";
        ArrayList<Coche> siguenEnCarrera= new ArrayList<>(); //copio el array de participantes
        for (Coche corredor: corredores) {

            falloNeumatico=corredor.ruedas.existsCatastrophicDamage();
            falloMotor=corredor.motor.existsCatastrophicDamage();

            if (Arrays.asList( falloNeumatico, falloMotor ).contains(true)){
                if (falloNeumatico) {
                    razonFallo="Fallo Neumaticos";
                }
                else if (falloMotor) {
                    razonFallo+="Fallo Motor";
                }
                //el coche ha tenido un fallo catastrofico se pasa a lista que no acaban
                this.tablaDNF.add(new tiempo(corredor.modelo,corredor.dorsal,0,razonFallo));
                }
            else {
                //lista corredores que siguen en pie
                siguenEnCarrera.add(corredor);
            }
            razonFallo="";
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
        } while(!corredoresCopia.isEmpty());
        System.out.println("Simulacion finalizada. Tiempo total de simulacion "+crono+" segundos");
        imprimirTiempos();
    }
}




