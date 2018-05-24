/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_do_while;

import java.util.Scanner;

/**
 *
 * @author Israel
 */
public class Ejercicios_Do_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombreJugador;
        int nJugadores;
        int nPases;
        int nGoles;
        int nPartidos;
        int totGoles = 0;
        int totPases = 0;
        int totEqPases = 0;
        int totEqGoles = 0;
        int promPases;
        int promGoles;
        String nivel = "";
        String nombreEquipo;
        String str = "";
        String cadena = "";
        String cadenaPartidos = "";
        String cadenaFinal = "";
        boolean salida = true;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del equipo");
        nombreEquipo = entrada.nextLine();
        do {
            String cadenaInicio = String.format("%-18s\t\t\t%-15s\t\t%-11s\t%s\n", "Nombre Jugador", "Total Pases", "Total Goles", "Nivel Jugador");
            System.out.println("Ingrese el número de jugadores");
            nJugadores = entrada.nextInt();
            System.out.println("Ingrese el número de partidos jugados");
            nPartidos = entrada.nextInt();
            entrada.nextLine();
            for (int i = 1; i <= nJugadores; i++) {
                System.out.printf("Ingrese el nombre del jugador %d\n", i);
                nombreJugador = entrada.nextLine();
                for (int j = 1; j <= nPartidos; j++) {
                    System.out.printf("Ingrese el número de pases del jugador: %s del partido: %d\n", nombreJugador, j);
                    nPases = entrada.nextInt();
                    System.out.printf("Ingrese el número de goles del jugador: %s del partido: %d\n", nombreJugador, j);
                    nGoles = entrada.nextInt();
                    totPases = totPases + nPases;
                    totGoles = totGoles + nGoles;

                    cadena = String.format("%s\t\t\t\tP%d: %d\t\t\tP%d: %d\n\t", cadena, j, nPases, j, nGoles);
                    entrada.nextLine();
                }
                totEqPases = totEqPases + totPases;
                totEqGoles = totEqGoles + totGoles;
                if (totPases >= 100) {
                    nivel = "Excelente";
                } else if (totPases <= 99 && totPases >= 80) {
                    nivel = "Muy Bueno";
                } else if (totPases <= 79 && totPases >= 60) {
                    nivel = "Bueno";
                } else if (totPases <= 59) {
                    nivel = "Regular";
                }
                str = String.format("%s%s%s\t\n", cadenaInicio, nombreJugador, cadena);
                cadenaPartidos = String.format("\t\t\t\t\tTotal: %d\t\tTotal: %d\t%s\n", totPases, totGoles, nivel);
                cadenaFinal = String.format("%s\n%s\n%s", cadenaFinal, str, cadenaPartidos);
                cadena = "";
                totGoles = 0;
                totPases = 0;
            }
            promPases = totEqPases / nPartidos;
            promGoles = totEqGoles / nPartidos;
            salida = false;
        } while (salida);
        System.out.println("");
        System.out.printf("Reporte de Jugadores del Equipo: '%s'\n", nombreEquipo);
        System.out.println(cadenaFinal);
        System.out.println("\nDatos Finales");
        System.out.println("Jugadores Analizados: " + nJugadores);
        System.out.println("Promedio de Pases del equipo: " + promPases);
        System.out.println("Promedio de Goles del equipo: " + promGoles);
    }

}
