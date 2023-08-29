/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agosto18;

/**
 *
 * @author Yeiner
 */
import java.util.Scanner;

public class DigiteDosNumeroSumeMuestreResultado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números
        System.out.print("Ingrese el número 1: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el número 2: ");
        int numero2 = scanner.nextInt();

        // Sumar los números
        int resultado = numero1 + numero2;

        // Imprimir el resultado
        System.out.println("Resultado: " + resultado);

        // Cerrar el escáner
        scanner.close();
    }
}
