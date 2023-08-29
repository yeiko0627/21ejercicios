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

public class NumerosSonIguales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese tres números
        System.out.print("Ingrese el número 1: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Ingrese el número 2: ");
        int numero2 = scanner.nextInt();
        
        System.out.print("Ingrese el número 3: ");
        int numero3 = scanner.nextInt();

        // Verificar si todos los números son iguales, todos diferentes o ninguno
        if (numero1 == numero2 && numero2 == numero3) {
            System.out.println("Todos los números son iguales.");
        } else if (numero1 != numero2 && numero2 != numero3 && numero1 != numero3) {
            System.out.println("Todos los números son diferentes.");
        } else {
            System.out.println("No todos son iguales ni diferentes.");
        }
        
        // Cerrar el escáner
        scanner.close();
    }
}

