
package Agosto18;

/**
 *
 * @author Yeiner
 */
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese un número
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar al usuario que ingrese un número
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            // Verificar si el número es par o impar
            if (numero % 2 == 0) {
                System.out.println("El número es Par.");
            } else {
                System.out.println("El número es Impar.");
            }
            // Cerrar el escáner
        }
    }
}
