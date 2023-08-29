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

public class Imprima3Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese tres números
        System.out.print("Ingrese el número 1: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el número 2: ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingrese el número 3: ");
        int numero3 = scanner.nextInt();

        // Verificar el orden de los números
        if (numero1 < numero2 && numero2 < numero3) {
            System.out.println("Está en orden creciente.");
        } else if (numero1 > numero2 && numero2 > numero3) {
            System.out.println("Está en orden decreciente.");
        } else {
            System.out.println("No aumenta ni disminuye el orden.");
        }

        // Cerrar el escáner
        scanner.close();
    }
}
