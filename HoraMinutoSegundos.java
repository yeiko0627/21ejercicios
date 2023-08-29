
package Agosto18;

/**
 *
 * @author Yeiner
 */
import java.util.Scanner;

public class HoraMinutoSegundos {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese la hora, los minutos y los segundos
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar al usuario que ingrese la hora, los minutos y los segundos
            System.out.print("Hora: ");
            int hora = scanner.nextInt();
            System.out.print("Minutos: ");
            int minutos = scanner.nextInt();
            System.out.print("Segundos: ");
            int segundos = scanner.nextInt();
            // Incrementar la hora en un segundo
            segundos++;
            // Verificar si hay que ajustar los minutos y las horas
            if (segundos == 60) {
                segundos = 0;
                minutos++;
                if (minutos == 60) {
                    minutos = 0;
                    hora++;
                    if (hora == 24) {
                        hora = 0;
                    }
                }
            }   // Imprimir la hora en el segundo siguiente
            System.out.printf("Fecha: %d:%02d:%02d%n", hora, minutos, segundos);
            // Cerrar el escáner
        }
    }
}
