/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoautonomo_ciclo_for;

import java.util.Scanner;

/**
 *
 * @author Israel
 */
public class TrabajoAutonomo_Ciclo_For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre_est;
        String nombre_asig;
        String p_prom = "";
        int edad_est = 0;
        int tot_edad = 0;
        int n_asignaturas;
        int n_estudiantes;
        int totalEdFin;
        double promedio;
        double bim1;
        double bim2;
        double tot_bim;
        double tot_prom = 0;
        double promFinal;
        double prom_acum = 0;
        double promFinalEstu;
        String cadenaFinal = "";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el número de estudiantes");
        n_estudiantes = entrada.nextInt();
        for (int i = 1; i <= n_estudiantes; i++) {
            entrada.nextLine();
            String cadena = String.format("%-10s\t%s\t%s\t\t%s\n", "Asignatura", "Bim-1", "Bim-2", "Promedio");
            System.out.printf("Ingrese el nombre del estudiante : %d\n", i);
            nombre_est = entrada.nextLine();
            System.out.printf("Ingrese la edad del estudiante: %s\n", nombre_est);
            edad_est = entrada.nextInt();
            System.out.println("Ingrese el número de asignaturas");
            n_asignaturas = entrada.nextInt();

            for (int j = 1; j <= n_asignaturas; j++) {
                entrada.nextLine();
                System.out.printf("Ingrese el nombre de la asignatura : %d\n", j);
                nombre_asig = entrada.nextLine();
                System.out.printf("Ingrese la calificación del Bimestre: 1  de la asignatura: %s\n", nombre_asig);
                bim1 = entrada.nextDouble();
                System.out.printf("Ingrese la calificación del Bimestre: 2  de la asignatura: %s\n", nombre_asig);
                bim2 = entrada.nextDouble();
                tot_bim = bim1 + bim2;
                promedio = tot_bim / 2;
                cadena = String.format("%s%-10s\t%.2f\t%.2f\t\t%.2f\n", cadena, nombre_asig, bim1, bim2, promedio);
                tot_prom = tot_prom + promedio;
            }
            promFinal = tot_prom / n_asignaturas;
            if (promFinal >= 19) {
                p_prom = "Sobresaliente";
            } else if (promFinal >= 16 & promFinal < 19) {
                p_prom = "Muy Bueno";
            } else if (promFinal >= 13 & promFinal < 16) {
                p_prom = "Bueno";
            } else if (promFinal < 13) {
                p_prom = "Regular";
            }
            cadenaFinal = String.format("%sNombre del estudiante: %s\nEdad: %d\nNúmero de Asignaturas: %d\n%s\n\t\t\tPromedio\t%.2f\nEl estudiante: %s, tiene un promedio: %s\n\n",
                    cadenaFinal, nombre_est, edad_est, n_asignaturas, cadena, promFinal, nombre_est, p_prom);
            tot_edad = tot_edad + edad_est;
            prom_acum = prom_acum + promFinal;
        }
        totalEdFin = tot_edad / n_estudiantes;
        promFinalEstu = prom_acum / n_estudiantes;
        System.out.println("Reporte de calificaciones de estudiantes");
        System.out.println(cadenaFinal);
        System.out.println("-----------------------------");
        System.out.println("Información global de los estudiantes:");
        System.out.printf("Promedio de edad: %d\n", totalEdFin);
        System.out.printf("Promedio de notas de los estudiantes: %.2f\n", promFinalEstu);
    }
}
