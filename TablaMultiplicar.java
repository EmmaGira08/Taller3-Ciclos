import java.util.Scanner;

public class tablamultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número del cual quieres ver la tabla: ");
        int numero = scanner.nextInt();

        System.out.println("\nTabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}
