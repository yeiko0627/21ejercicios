
package Agosto18;

/**
 *
 * @author Yeiner
 */
import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese un número
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar al usuario que ingrese un número
            System.out.print("Ingrese un número: ");
            double numero = scanner.nextDouble();
            // Verificar si el número es positivo o negativo
            if (numero > 0) {
                System.out.println("El número es Positivo.");
            } else if (numero < 0) {
                System.out.println("El número es Negativo.");
            } else {
                System.out.println("El número es Cero.");
            }
            // Cerrar el escáner
        }
    }
}

