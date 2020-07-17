package main.SimuladorCoches.circuito;
class Curvas {
    int numeroCurva;
    int tipoCurva;
    double puntoInicioCurva;
    double puntoFinalCurva;


}
public class Circuito {
    public String nombre;
    public double longitud;
    int numerocurvas;
    /*
     Por el momento las curvas no intervienen en la simulacion

     Las curvas quizas se podrian clasificar, ya que no todas las curvas son iguales
     suave, moderada, fuerte, neutra y aplicar o bien un factor de frenada o un limite de velocidad
     por otro lado deberiamos saber la longitud de la cuerva de la curva
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
