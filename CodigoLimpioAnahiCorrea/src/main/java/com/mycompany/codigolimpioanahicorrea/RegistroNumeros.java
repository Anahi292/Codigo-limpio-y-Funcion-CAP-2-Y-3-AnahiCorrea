/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codigolimpioanahicorrea;

/**
 *
 * @author HP
 */
// REGLA: USAR NOMBRES QUE REVELEN LAS INTENCIONES
// CAMBIEN EL NOMBRE DE LA CLASE 
public class RegistroNumeros{

    // REGLA: EVITAR LA DESINFORMACION O EVITAR ASIGNACIONES MENTALES
    // CAMBIEN n POR numerosIngresados
    private int[] numerosIngresados = new int[10];

    // REGLA: EVITAR LA DESINFORMACION O EVITAR ASIGNACIONES MENTALES
    // CAMBIE i POR cantidadNumeros
    private int cantidadNumeros = 0;

    // REGLA: EVITAR LA DESINFORMACION O EVITAR ASIGNACIONES MENTALES
    // CAMBIE a POR agregarNumero
    public void agregarNumero(int numero) {
        // REGLA: EVITAR LA DESINFORMACION O EVITAR ASIGNACIONES MENTALES
        // CAMBIE v POR numero
        if (cantidadNumeros < numerosIngresados.length) {
            numerosIngresados[cantidadNumeros++] = numero;
        } else {
            System.out.println("Se ha alcanzado el límite máximo de números permitidos.");
        }
    }

    // REGLA: USAR NOMBRES QUE REVELEN LAS INTENCIONES
    // CAMBIE b POR calcularSuma
    public int calcularSuma() {
        // REGLA: EVITAR LA DESINFORMACION O EVITAR ASIGNACIONES MENTALES
        // CAMBIE s POR sumaTotal
        int sumaTotal = 0;
        for (int indice = 0; indice < cantidadNumeros; indice++) {
            sumaTotal += numerosIngresados[indice];
        }
        return sumaTotal;
    }

    // REGLA: USAR NOMBRES QUE REVELEN LAS INTENCIONES 
    // CAMBIE c POR calcularPromedio
    public double calcularPromedio() {
        return cantidadNumeros == 0 ? 0 : (double) calcularSuma() / cantidadNumeros;
    }
}
