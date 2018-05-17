/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoautonomo;

import java.util.Scanner;

/**
 *
 * @author Israel
 */
/*
Ejercicio 1:
Elaborar un programa en lenguaje Java, que permita ingresar los valores de productos vendidos a un clinte, en un supermecado.
Los productos serán ingresados, hasta que el usuario lo decida.
Ejemplificar con los siguiente datos:
Información que necesita ingresar durante la ejecución del programa:
- Ingresar el nombre del cliente.
- Para cada artículo se debe ingresar:
	- Nombre del artículo.
	- Cantidad de artículos.
	- Precio unitario de cada artículo.
- Se debe generar el siguiente reporte
 */
public class Ejercicio1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        String nombreProc;
        int cantProd;
        double precioProc;
        boolean resp = true;
        double total;
        double sum = 0;
        String cadenaFinal = String.format("%s\t%s\t%s\t%s\n", "Artículo", "Cantidad", "Precio Unitario", "Precio Total");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre y apellido del cliente");
        nombre = entrada.nextLine();
        while (resp) {
            System.out.println("Ingrese el nombre del producto");
            nombreProc = entrada.nextLine();
            System.out.println("Ingrese la cantidad del producto");
            cantProd = entrada.nextInt();
            System.out.println("Ingrese el precio del artículo");
            precioProc = entrada.nextDouble();
            total = precioProc * cantProd;
            sum = sum + total;
            cadenaFinal = String.format("%s%s\t\t%d\t\t%.1f\t\t%.1f\n", cadenaFinal, nombreProc, cantProd, precioProc, total);
            entrada.nextLine();
            System.out.println("¿Desea ingresar un nuevo producto?");
            String resp2 = entrada.nextLine();
            if ("no".equals(resp2)) {
                resp = false;
            }
        }
        double iva = sum * 0.14;
        double totalReal = sum + iva;
        System.out.println("********* F A C T U R A *********");
        System.out.println("Supermercado: Todo a menor Precio");
        System.out.printf("Nombre del Cliente: %s \n", nombre);
        System.out.println(" ");
        System.out.println(cadenaFinal);
        System.out.printf("\t\t\t\tSubtotal \t%.1f\n", sum);
        System.out.printf("\t\t\t\tIVA 0.14 \t%.2f\n", iva);
        System.out.printf("\t\t\t\tTotal \t\t%.2f\n", totalReal);

        //  System.out.printf("El promedio final es %.2f\n", nombreProc);
    }

}
