/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author Israel
 */
//Crear un programa que permita ingresar una califcacion por teclado
//si la calificacion ingresada es mayor o igual a 5 y la calificacion es menor a 10 se debe presentar un mensaje que diga 
// usted esta en supletorio, de lo contrario se presenta un mensaje con el valor de la calificacion
//dividido para 2
public class Ejemplo2 {
    public static void main(String[] args) {
        Double calificacion;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la calificación");
        calificacion = entrada.nextDouble();
        
        if (calificacion >= 5 && calificacion < 10) {
            System.out.println("Usted está en supletorio");
            
        }else{
            //calificacion = calificacion/2;
           // System.out.println(calificacion);
            System.out.printf("%s\n", calificacion/2);
        }
    }
}
