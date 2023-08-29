
package Agosto18;

/**
 *
 * @author Yeiner
 */
import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        // Solicitar al usuario el valor de la compra
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar al usuario el valor de la compra
            System.out.print("Ingrese el valor de la compra: ");
            double valorCompra = scanner.nextDouble();
            // Calcular el descuento si la compra supera los 300
            double descuento = 0.0;
            if (valorCompra > 300) {
                descuento = valorCompra * 0.20; // 20% de descuento
            }   // Calcular el total a pagar
            double totalAPagar = valorCompra - descuento;
            // Imprimir el resultado
            System.out.println("El descuento es de: " + descuento);
            System.out.println("El total a pagar es: " + totalAPagar);
            // Cerrar el escáner
        }
    }
}
