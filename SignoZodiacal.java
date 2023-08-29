
package Agosto18;

/**
 *
 * @author Yeiner
 */
import java.util.Scanner;

public class SignoZodiacal {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese la fecha de nacimiento
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar al usuario que ingrese la fecha de nacimiento
            System.out.print("Ingrese su fecha de nacimiento (en formato DD/MM): ");
            String fechaNacimiento = scanner.nextLine();
            // Extraer el día y el mes de la fecha de nacimiento
            String[] partesFecha = fechaNacimiento.split("/");
            int dia = Integer.parseInt(partesFecha[0]);
            int mes = Integer.parseInt(partesFecha[1]);
            // Determinar el signo zodiacal
            String signoZodiacal = determinarSignoZodiacal(dia, mes);
            // Imprimir el signo zodiacal
            System.out.println("Su signo zodiacal es: " + signoZodiacal);
            // Cerrar el escáner
        }
    }

    public static String determinarSignoZodiacal(int dia, int mes) {
        String signo = "";

        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            signo = "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            signo = "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            signo = "Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            signo = "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            signo = "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            signo = "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            signo = "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            signo = "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            signo = "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            signo = "Capricornio";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            signo = "Acuario";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            signo = "Piscis";
        }

        return signo;
    }
}
