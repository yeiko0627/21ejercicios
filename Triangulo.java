
package Agosto18;

/**
 *
 * @author Yeiner
 */
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese las longitudes de los tres lados
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar al usuario que ingrese las longitudes de los tres lados
            System.out.print("Ingrese la longitud del lado 1: ");
            double lado1 = scanner.nextDouble();
            System.out.print("Ingrese la longitud del lado 2: ");
            double lado2 = scanner.nextDouble();
            System.out.print("Ingrese la longitud del lado 3: ");
            double lado3 = scanner.nextDouble();
            // Verificar el tipo de triángulo
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Es un triángulo equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Es un triángulo isósceles.");
            } else {
                System.out.println("Es un triángulo escaleno.");
            }
            // Cerrar el escáner
        }
    }
}
