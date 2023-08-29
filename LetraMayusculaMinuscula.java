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

public class LetraMayusculaMinuscula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una letra
        System.out.print("Ingrese una letra: ");
        char letra = scanner.next().charAt(0);

        // Verificar si la letra está en mayúscula o minúscula
        if (Character.isUpperCase(letra)) {
            System.out.println("La letra " + letra + " está en Mayúscula.");
        } else if (Character.isLowerCase(letra)) {
            System.out.println("La letra " + letra + " está en Minúscula.");
        } else {
            System.out.println("No es una letra.");
        }

        // Cerrar el escáner
        scanner.close();
    }
}
