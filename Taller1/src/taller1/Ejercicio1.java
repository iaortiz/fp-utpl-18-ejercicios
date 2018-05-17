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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int hijos;
        double salario;
        double pasajes;
        double salidas;
        double bar;
        double tot_pasajes = 0;
        double tot_bar = 0;
        double tot_salidas = 0;
        double tot_gastos = 0;
        String cadena = String.format("%-10s\t%s\t\t%-10s\t%s\n", "Hijos", "Pasajes", "Bar", "Salidas");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el salario del Padre");
        salario = entrada.nextDouble();
        System.out.println("Ingrese el número de hijos");
        hijos = entrada.nextInt();
        for (int i = 1; i <= hijos; i++) {
            System.out.printf("Ingrese los gastos del hijo: %d\n", i);
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
            cadena = String.format("%sHijo%-10d\t%-10.0f\t%-10.0f\t%.0f\n",cadena,i, pasajes,bar,salidas);
        }
        System.out.println("***** G A S T O S   F A M I L I A *****");
        System.out.println(cadena);
        System.out.printf("Totales\t\t%-10.0f\t%-10.0f\t%.0f\n",tot_pasajes,tot_bar,tot_salidas);
        if (salario > tot_gastos) {
            System.out.println("Al padre de familia le sobra dinero");
        } else {
            System.out.println("Al padre de familia le falta dinero");
        }
    }

}
