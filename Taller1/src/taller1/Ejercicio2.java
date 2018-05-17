/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

import java.util.Scanner;

/**
 *
 * @author Israel
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int hijos;
        int nFamilias;
        String nomPadre;
        double salario;
        double pasajes;
        double salidas;
        double bar;
        double tot_pasajes = 0;
        double tot_bar = 0;
        double tot_salidas = 0;
        double tot_gastos = 0;
        String con;
        String cadenaFinal = "";

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el número de familias");
        nFamilias = entrada.nextInt();
        for (int i = 1; i <= nFamilias; i++) {
            String cadena = String.format("%-10s\t%s\t\t%-10s\t%s\n", "Hijos", "Pasajes", "Bar", "Salidas");
            entrada.nextLine();
            System.out.printf("Ingrese el nombre del padre %d\n", i);
            nomPadre = entrada.nextLine();
            System.out.println("Ingrese el salario del Padre");
            salario = entrada.nextDouble();
            System.out.println("Ingrese el número de hijos");
            hijos = entrada.nextInt();
            for (int j = 1; j <= hijos; j++) {
                entrada.nextLine();
                System.out.printf("Ingrese los gastos del hijo: %d\n", j);
                System.out.println("Monto de Pasajes");
                pasajes = entrada.nextDouble();
                tot_pasajes = tot_pasajes + pasajes;
                System.out.println("Monto de Bar");
                bar = entrada.nextDouble();
                tot_bar = tot_bar + bar;
                System.out.println("Monto de Salidas");
                salidas = entrada.nextDouble();
                tot_salidas = tot_salidas + salidas;
                tot_gastos = tot_pasajes + tot_salidas + tot_bar;
                cadena = String.format("%sHijo%-10d\t%-10.0f\t%-10.0f\t%-10.0f\n", cadena, j, pasajes, bar, salidas);
            }

            if (salario > tot_gastos) {
                con = "Al padre de familia le sobra dinero";
            } else {
                con = "Al padre de familia le falta dinero";
            }
            cadenaFinal = String.format("%sNombre del padre de Familia: %s\nSueldo semanal: %.1f\n"
                    + "Número de hijos: %d\n%s\nTotales\t\t%.1f\t\t%.1f\t\t%.1f\nEl padre de familia: %s, %s\n\n", cadenaFinal, nomPadre, salario, hijos, cadena, tot_pasajes, tot_bar, tot_salidas, nomPadre, salario);
            entrada.nextLine();
            cadena = "";
        }

        System.out.println("REPORTE DE GASTOS");
        System.out.println(cadenaFinal);
    }
}
