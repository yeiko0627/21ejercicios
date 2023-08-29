
package Agosto18;

/**
 *
 * @author Yeiner
 */
import java.util.Scanner;

public class DigitoMayusculaMinuscula {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese un carácter
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar al usuario que ingrese un carácter
            System.out.print("Ingrese un carácter: ");
            char caracter = scanner.next().charAt(0);
            // Verificar si es un dígito, letra mayúscula o letra minúscula
            if (caracter >= '0' && caracter <= '9') {
                System.out.println("Es un dígito.");
            } else if (caracter >= 'A' && caracter <= 'Z') {
                System.out.println("Es una letra mayúscula.");
            } else if (caracter >= 'a' && caracter <= 'z') {
                System.out.println("Es una letra minúscula.");
            } else {
                System.out.println("No es un dígito ni una letra.");
            }
            // Cerrar el escáner
        }
    }
}
