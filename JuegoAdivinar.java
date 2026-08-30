import java.util.Scanner;
import java.util.Random;

public class juegoadivinar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingresa el límite inferior (n): ");
        int n = scanner.nextInt();

        System.out.print("Ingresa el límite superior (m): ");
        int m = scanner.nextInt();

        int numeroSecreto = random.nextInt(m - n + 1) + n;
        int intentos = 0;
        boolean adivinado = false;

        System.out.println("\nAdivina el número entre " + n + " y " + m);

        while (!adivinado) {
            System.out.print("Ingresa tu número: ");
            int intento = scanner.nextInt();
            intentos++;

            if (intento < numeroSecreto) {
                System.out.println("Muy bajo, intenta de nuevo.");
            } else if (intento > numeroSecreto) {
                System.out.println("Muy alto, intenta de nuevo.");
            } else {
                adivinado = true;
                System.out.println("¡Felicidades! Adivinaste el número " + numeroSecreto + " en " + intentos + " intentos.");
            }
        }

        scanner.close();
    }
}