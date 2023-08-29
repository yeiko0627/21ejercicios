
package Agosto18;

/**
 *
 * @author Yeiner
 */
import java.util.Scanner;

public class ImprimaCuantasCifrasTiene {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese un número
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar al usuario que ingrese un número
            System.out.print("Ingrese un número: ");
            long numero = scanner.nextLong(); // Usamos 'long' para manejar números grandes
            // Contar la cantidad de cifras
            int cifras = 0;
            long numeroTemp = numero; // Creamos una copia del número para no modificar el original
            // Usamos un bucle para contar las cifras
            while (numeroTemp != 0) {
                numeroTemp = numeroTemp / 10;
                cifras++;
            }   // Imprimir la cantidad de cifras
            System.out.println("Número ingresado: " + numero);
            System.out.println("Cifras esperadas: " + cifras);
            // Cerrar el escáner
        }
    }
}
