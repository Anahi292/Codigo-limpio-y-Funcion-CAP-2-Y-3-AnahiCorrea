/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.codigolimpioanahicorrea;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class CodigoLimpioAnahiCorrea {

    public static void main(String[] args) {
        ejecutarPrograma();
    }

    private static void ejecutarPrograma() {
        // REGLA: EVITAR LA DESINFORMACION O EVITAR ASIGNACIONES MENTALES
        // CAMBIE x POR programa
        RegistroNumeros programa = new RegistroNumeros();
        Scanner scanner = new Scanner(System.in);

        int totalNumeros = solicitarCantidadDeNumeros(scanner);
        ingresarNumeros(programa, totalNumeros, scanner);

        mostrarResultados(programa);

        scanner.close();
    }

    private static int solicitarCantidadDeNumeros(Scanner scanner) {
        System.out.print("¿Cuántos números ingresará? ");
        // REGLA: EVITAR LA DESINFORMACION O EVITAR ASIGNACIONES MENTALES
        // CAMBIE t POR totalNumeros
        return scanner.nextInt();
    }

    private static void ingresarNumeros(RegistroNumeros programa, int totalNumeros, Scanner scanner) {
        for (int contador = 0; contador < totalNumeros; contador++) {
            System.out.print("Número: ");
            programa.agregarNumero(scanner.nextInt());
        }
    }

    private static void mostrarResultados(RegistroNumeros programa) {
        System.out.println("Suma = " + programa.calcularSuma());
        System.out.println("Promedio = " + programa.calcularPromedio());
    }
}
