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
public class NewClass {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String asignatura1;
        int numAsignaturas;
        double bimestre1 = 0;
        double bimestre2 = 0;
        double promedio = 0;
        double edadEstudiante;
        double promedioTotal = 0;
        double totalEdad = 0;
        double promedioFinal = 0;
        double promedioAcum = 0;
        double totalEdadFinal = 0;
        double promedioEstudiantesTotal = 0;
        int numEstudiantes;
        int contador = 1;
        String cadenaFinal2 = "";
        String conclusion = "";
        System.out.println("Ingrese el numero de reporte de calificaciones a ingresar: ");
        numEstudiantes = entrada.nextInt();
        entrada.nextLine();
        String cadenaFinal = String.format("%-10s\t%-10s\t%s\t\t%s\n", "Asignatura", "Bim-1", "Bim-2", "Promedio");
        for (int j = 1; j <= numEstudiantes; j++) {
            /*Inicialización de variables dentro del ciclo*/
            promedio = 0;
            bimestre2 = 0;
            bimestre1 = 0;
            promedio = 0;
            promedioTotal = 0;
            cadenaFinal = String.format("%-10s\t%s\t%s\t\t%s\n", "Asignatura", "Bim-1", "Bim-2", "Promedio");
            System.out.println("Ingrese el nombre del estudiante " + j);
            String estudiante = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante ");
            edadEstudiante = entrada.nextDouble();
            System.out.println("Ingrese el número de materias que tiene el estudiante: ");
            numAsignaturas = entrada.nextInt();
            /*Ciclo para ingreso de datos de materias y procesos de cálculo dentro del ciclo*/
            for (int i = 1; i <= numAsignaturas; i++) {
                entrada.nextLine();
                System.out.println("Ingrese el nombre de la materia: " + i);
                asignatura1 = entrada.nextLine();
                System.out.println("Ingrese la nota del primer bimestre: ");
                bimestre1 = entrada.nextDouble();
                System.out.println("Ingrese la nota del segundo bimestre: ");
                bimestre2 = entrada.nextDouble();
                promedio = (bimestre2 + bimestre1) / 2;
                cadenaFinal = String.format("%s%-10s\t%.2f\t%.2f\t\t%.2f\n", cadenaFinal, asignatura1, bimestre1, bimestre2, promedio);
                promedioTotal = promedioTotal + promedio;
            }
            promedioFinal = promedioTotal / numAsignaturas;
            /*Uso de una variable String para dar la conclusión del reporte*/
            if (promedioFinal >= 19) {
                conclusion = "sobresaliente";
            } else if (promedioFinal < 19 && promedioFinal >= 16) {
                conclusion = "muy bueno";
            } else if (promedioFinal < 16 && promedioFinal >= 13) {
                conclusion = "bueno";
            } else if (promedioFinal < 13) {
                conclusion = "regular";
            }
            /*Creación de una nueva String.format para generar el reporte definitivo, cáculos acumulativos que serán usados fuera del ciclo*/
            cadenaFinal2 = String.format("%sNombre del estudiante: %s\nEdad: %.0f\nNúmero de Asignaturas: %d\n%s\n\t\t\tPromedio\t%.2f\nEl estudiante: %s, tiene un promedio: %s\n\n", cadenaFinal2, estudiante, edadEstudiante, numAsignaturas, cadenaFinal, promedioFinal, estudiante, conclusion);
            totalEdad = totalEdad + edadEstudiante;
            promedioAcum = promedioAcum + promedioFinal;
            contador = contador + 1;
            entrada.nextLine();
        }
        /*Resultados obtenidos durante el desarrollo del ciclo*/
        totalEdadFinal = totalEdad / numEstudiantes;
        promedioEstudiantesTotal = promedioAcum / numEstudiantes;
        System.out.println("Reporte de calificaciones de estudiantes");
        System.out.println(cadenaFinal2);
        System.out.println("-----------------------------");
        System.out.println("Información global de los estudiantes:");
        System.out.printf("Promedio de edad: %.2f\n", totalEdadFinal);
        System.out.printf("Promedio de notas de los estudiantes: %.2f\n", promedioEstudiantesTotal);

    }
}
