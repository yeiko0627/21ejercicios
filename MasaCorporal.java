
package Agosto18;

/**
 *
 * @author Yeiner
 */
import java.util.Scanner;

public class MasaCorporal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el peso en kilogramos
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();

        // Solicitar al usuario que ingrese la altura en metros
        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        // Calcular el índice de masa corporal (IMC)
        double imc = peso / (altura * altura);

        // Determinar el estado en función del IMC
        String estado = "";
        if (imc < 16) {
            estado = "Criterio de ingreso en hospital";
        } else if (imc >= 16 && imc < 17) {
            estado = "Infrapeso";
        } else if (imc >= 17 && imc < 18) {
            estado = "Bajo peso";
        } else if (imc >= 18 && imc < 25) {
            estado = "Peso normal (saludable)";
        } else if (imc >= 25 && imc < 30) {
            estado = "Sobrepeso (obesidad de grado I)";
        } else if (imc >= 30 && imc < 35) {
            estado = "Sobrepeso crónico (obesidad de grado II)";
        } else {
            estado = "Obesidad de grado III o mayor";
        }

        // Imprimir el resultado
        System.out.printf("El índice de masa corporal es de %.2f. %s%n", imc, estado);

        // Cerrar el escáner
        scanner.close();
    }
}
