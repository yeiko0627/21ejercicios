
package Agosto18;

/**
 *
 * @author Yeiner
 */
import java.util.Scanner;

public class MultiploDelOtro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números
        System.out.print("Ingrese el primer número (N1): ");
        int n1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número (N2): ");
        int n2 = scanner.nextInt();

        // Verificar si n1 es múltiplo de n2 o viceversa
        if (n1 % n2 == 0 || n2 % n1 == 0) {
            System.out.println("Sí, son múltiplos.");
        } else {
            System.out.println("No, no son múltiplos.");
        }

        // Cerrar el escáner
        scanner.close();
    }
}
