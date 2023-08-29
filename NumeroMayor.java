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

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese tres números
        System.out.print("Ingrese el número 1: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el número 2: ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingrese el número 3: ");
        int numero3 = scanner.nextInt();

        // Encontrar el número mayor
        int numeroMayor = numero1;

        if (numero2 > numeroMayor) {
            numeroMayor = numero2;
        }

        if (numero3 > numeroMayor) {
            numeroMayor = numero3;
        }

        // Imprimir el número mayor
        System.out.println("El número mayor es: " + numeroMayor);

        // Cerrar el escáner
        scanner.close();
    }
}
