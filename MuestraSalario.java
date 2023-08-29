
package Agosto18;

/**
 *
 * @author Yeiner
 */
import java.util.Scanner;

public class MuestraSalario {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese el nombre
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar al usuario que ingrese el nombre
            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine();
            // Solicitar al usuario que ingrese la edad
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();
            // Solicitar al usuario que ingrese el salario
            System.out.print("Ingrese su salario: ");
            double salario = scanner.nextDouble();
            // Modificar el salario según las condiciones
            if (edad < 17) {
                System.out.println(nombre + ", no puede trabajar debido a su edad.");
            } else if (edad >= 18 && edad <= 50) {
                salario *= 1.05; // Aumento del 5%
            } else if (edad >= 51 && edad <= 60) {
                salario *= 1.10; // Aumento del 10%
            } else if (edad > 60) {
                salario *= 1.15; // Aumento del 15%
            }   // Imprimir el resultado
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad + " años");
            System.out.println("Salario modificado: " + salario);
            // Cerrar el escáner
        }
    }
}