
package Agosto18;

/**
 *
 * @author Yeiner
 */
import java.util.Scanner;

public class TemperaturaClima{
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese la temperatura
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar al usuario que ingrese la temperatura
            System.out.print("Ingrese la temperatura (en grados Celsius): ");
            double temperatura = scanner.nextDouble();
            // Determinar el tipo de clima en función de la temperatura
            String tipoClima = "";
            if (temperatura <= 10) {
                tipoClima = "Frio";
            } else if (temperatura > 10 && temperatura <= 20) {
                tipoClima = "Nublado";
            } else if (temperatura > 20 && temperatura <= 30) {
                tipoClima = "Caluroso";
            } else if (temperatura > 30) {
                tipoClima = "Tropical";
            }   // Imprimir el tipo de clima
            System.out.println("Tipo de clima: " + tipoClima);
            // Cerrar el escáner
        }
    }
}
