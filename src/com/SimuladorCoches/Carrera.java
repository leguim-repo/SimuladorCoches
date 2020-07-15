package com.SimuladorCoches;

import java.util.ArrayList;

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

public class Carrera {
    Circuito circuito;
    int numeroVueltas;
    double longitudCarrera;
    ArrayList<Coche> participantes;
    ArrayList<tiempo> tablaTiempos;


    public Carrera(Circuito circuito, int numeroVueltas, ArrayList<Coche> participantes) {
        this.circuito = circuito;
        this.numeroVueltas = numeroVueltas;
        this.participantes = participantes;
        this.longitudCarrera = numeroVueltas * circuito.longitud;
        this.tablaTiempos = new ArrayList<tiempo>();
    }

    void imprimirTiempos() {
        System.out.println("Tabla de tiempos");
        for (tiempo t: tablaTiempos) {
            System.out.println(t.marca+" "+t.dorsal+" "+t.crono);
        }
    }

    ArrayList<Coche> checkWinner(ArrayList<Coche> corredoresCopia,int crono) {
        for (Coche corredor: corredoresCopia) {
            if (corredor.odometro > this.longitudCarrera) {
                corredoresCopia.remove(corredor);
                this.tablaTiempos.add(new tiempo(corredor.marca,corredor.dorsal,crono));
                return corredoresCopia;
            }
        }
        return corredoresCopia;
    }

    public void simularCarrera(){
        //en esta simulacion corren los coches en paralelo
        int crono=0;
        ArrayList<Coche> corredoresCopia= new ArrayList<>(participantes); //copio el array de participantes

        do {
            for (Coche corredor: corredoresCopia) {
                corredor.correr();
                System.out.println(corredor.toString());
            }

            corredoresCopia=this.checkWinner(corredoresCopia,crono);
            crono +=1;
            System.out.println(crono);
        } while(!corredoresCopia.isEmpty());

        imprimirTiempos();
    }


    /*
    Pa borrar....primeras pruebas
    public void simularUnoaUno(){
        //bucle while de la carrera
        //calcular por longitud
        //longitud de la carrera = vueltas * longitud circuito
        //cada ciclo del bucle es 1 segundo
        //aqui el crono si me funciona bien
        //en esta simulacion los coches corren uno a uno
        int crono=0;
        int c=0;
        for (Coche corredor: participantes) {
            do {
                corredor.correr();
                System.out.println(corredor.toString());
                crono+=1;
            }while( corredor.odometro<this.longitudCarrera);
            tiempos[c][0]=corredor.marca;
            tiempos[c][1]=crono;
            crono=0;
            c+=1;
        }
        this.imprimirTiempos();
    }

     */
}




