/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoautonomo;

import java.util.Scanner;

/**
 *
 * @author Israel Ejercicio 2: Se necesita generar una solución que permita
 * ingresa los datos de varios autos importados, el número de autos a ingresar
 * se debe solicitar al usuario de manera previa. Por cada automóvil, se tiene
 * que ingresar: marca, origen y costo. Información para los cálculos: - Se
 * genera un impuesto en función del país de origen, en función del costo del
 * automóvil: - Si es Argentina el impuesto es del 20% - Si es Colombia el
 * impuesto es del 25% - Si es Chile el impuesto es del 30% - Cualquier otro
 * país, el impuesto es de 40% - El precio de venta es igual a la suma del costo
 * del automóvil más el impuesto - Se debe imprimir el total de autos
 * importados. - Se debe imprimir el total de impuestos generados. - Se debe
 * imprimit el total de los precios de venta de los autos. - Se debe generar e
 * imprimir el total de autos de los países de origen:
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int nAutos;
        String marca;
        String origen;
        double costo;
        double impuesto;
        double precvent;
        double totimp = 0;
        double totVent = 0;
        int cont = 1;
        int nArg = 0;
        int nChile = 0;
        int nPais = 0;
        int nColombia = 0;
        String cadena = String.format("%s\t\t%s\t\t%s\t\t%s\t%s\n", "Marca", "Origen", "Costo", "Impuesto", "Precio Venta");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el número de autos");
        nAutos = entrada.nextInt();
        entrada.nextLine();
        while (cont <= nAutos) {
            System.out.println("Ingrese la marca del auto,use 10 caracteres,use espacio si es necesario");
            marca = entrada.nextLine();
            System.out.println("Ingrese el origen del auto");
            origen = entrada.nextLine();
            System.out.println("Ingrese el costo del vehiculo");
            costo = entrada.nextDouble();
            switch (origen) {
                case "Argentina":
                    impuesto = costo * 0.2;
                    nArg = nArg + 1;
                    break;
                case "Colombia":
                    impuesto = costo * 0.25;
                    nColombia = nColombia + 1;
                    break;
                case "Chile":
                    impuesto = costo * 0.3;
                    nChile = nChile + 1;
                    break;
                default:
                    impuesto = costo * 0.4;
                    nPais = nPais + 1;
                    break;
            }
            cont = cont + 1;

            precvent = costo + impuesto;
            totimp = totimp + impuesto;
            totVent = totVent + precvent;
            cadena = String.format("%s%-10s\t%-10s\t%.0f\t\t%.0f\t\t%.0f\n", cadena, marca, origen, costo, impuesto, precvent);
            
            entrada.nextLine();

        }
        System.out.println(" ");
        System.out.println("* * * * * * * * * * * R E P O R T E   D E   A U T O S   I M P O R T A D O S * * * * * * * * * * *");
        System.out.println(cadena);
        System.out.printf("Total Autos: %d\t   Tot.  Imp.:  %-10.0f\tTot.  PV:       %-10.0f\n", nAutos, totimp, totVent);
        System.out.println(" ");
        System.out.println("Argentina:  " + nArg);
        System.out.println("Chile:      " + nChile);
        System.out.println("Colombia:   " + nColombia);
        System.out.println("Otro Pais:  " + nPais);
    }

}
