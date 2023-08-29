
package Agosto18;

/**
 *
 * @author Yeiner
 */
import java.util.Scanner;

public class IngresarNotaDel0a10 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese una nota
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar al usuario que ingrese una nota
            System.out.print("Ingrese una nota (entre 0 y 10): ");
            double nota = scanner.nextDouble();
            // Verificar y mostrar la calificación
            if (nota < 0 || nota > 10) {
                System.out.println("Nota fuera de rango.");
            } else if (nota < 4) {
                System.out.println("Insuficiente");
            } else if (nota < 6) {
                System.out.println("Suficiente");
            } else if (nota < 8) {
                System.out.println("Bien");
            } else if (nota < 9) {
                System.out.println("Notable");
            } else {
                System.out.println("Sobresaliente");
            }
            // Cerrar el escáner
        }
    }
}
