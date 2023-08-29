
package Agosto18;

/**
 *
 * @author Yeiner
 */
import java.util.Scanner;

public class NumeroDiasMes {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese un número de mes
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar al usuario que ingrese un número de mes
            System.out.print("Ingrese un número de mes (1 a 12): ");
            int numeroMes = scanner.nextInt();
            // Determinar el número de días en el mes correspondiente
            int numeroDias = 0;
            switch (numeroMes) {
                case 1, 3, 5, 7, 8, 10, 12 -> numeroDias = 31;
 case 4,    6, 9, 11 -> numeroDias = 30;
 case 2 ->      numeroDias = 28; // Asumimos que es un año no bisiesto
 default -> System.out.println("Número de mes no válido.");
            }   // Imprimir el número de días en el mes correspondiente
            if (numeroDias > 0) {
                System.out.println("El mes tiene " + numeroDias + " días.");
            }
            // Cerrar el escáner
        }
    }
}
