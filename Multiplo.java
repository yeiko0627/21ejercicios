
package Agosto18;

/**
 *
 * @author Yeiner
 */
import java.util.Scanner;

public class Multiplo {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese un número
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar al usuario que ingrese un número
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            // Verificar si el número es múltiplo de 8
            if (numero % 8 == 0) {
                System.out.println("El número " + numero + " es múltiplo de 8.");
            } else {
                System.out.println("El número " + numero + " no es múltiplo de 8.");
            }
            // Cerrar el escáner
        }
    }
}
