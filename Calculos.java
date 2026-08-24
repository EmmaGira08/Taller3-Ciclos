import java.util.Scanner;

public class Calculos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        // Ciclo principal del menú
        while (opcion != 5) {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Suma n-ésimo término de Fibonacci");
            System.out.println("2. Calcular el n-ésimo número primo");
            System.out.println("3. Calcular raíces de ecuación cuadrática");
            System.out.println("4. Calcular promedio de n números");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            // Validación básica para evitar fallos al ingresar texto
            if (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número.");
                scanner.next(); // Limpiar entrada incorrecta
                continue;
            }

            opcion = scanner.nextInt();

            // Estructura switch-case en lugar de if-else
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor de n: ");
                    int nFib = scanner.nextInt();
                    
                    int a = 0, b = 1, suma = 0;
                    for (int i = 1; i <= nFib; i++) {
                        suma += a;
                        int siguiente = a + b;
                        a = b;
                        b = siguiente;
                    }
                    System.out.println("La suma de los primeros " + nFib + " términos es: " + suma);
                    break;

                case 2:
                    System.out.print("Ingrese la posición n del número primo: ");
                    int nPrimo = scanner.nextInt();

                    int encontrados = 0;
                    int numero = 1;

                    while (encontrados < nPrimo) {
                        numero++;
                        int divisores = 0;
                        
                        for (int i = 1; i <= numero; i++) {
                            if (numero % i == 0) {
                                divisores++;
                            }
                        }
                        
                        if (divisores == 2) {
                            encontrados++;
                        }
                    }
                    System.out.println("El primo número " + nPrimo + " es: " + numero);
                    break;
                    
                    case 3:
                    System.out.print("Ingrese coeficiente a: ");
                    double coefA = scanner.nextDouble();
                    System.out.print("Ingrese coeficiente b: ");
                    double coefB = scanner.nextDouble();
                    System.out.print("Ingrese coeficiente c: ");
                    double coefC = scanner.nextDouble();

                    if (coefA == 0) {
                        System.out.println("No es una ecuación cuadrática (a no puede ser 0).");
                    } else {
                        double discriminante = (coefB * coefB) - (4 * coefA * coefC);

                        if (discriminante >= 0) {
                            double x1 = (-coefB + Math.sqrt(discriminante)) / (2 * coefA);
                            double x2 = (-coefB - Math.sqrt(discriminante)) / (2 * coefA);
                            System.out.println("x1 = " + x1);
                            System.out.println("x2 = " + x2);
                        } else {
                            System.out.println("Las raíces son complejas/imaginarias.");
                        }
                    }
                    break;

                    case 4:
                    System.out.print("¿Cuántos números va a ingresar?: ");
                    int nProm = scanner.nextInt();

                    double sumaProm = 0;
                    for (int i = 1; i <= nProm; i++) {
                        System.out.print("Ingrese el número " + i + ": ");
                        sumaProm += scanner.nextDouble();
                    }

                    double promedio = sumaProm / nProm;
                    System.out.println("El promedio es: " + promedio);
                    break;

                case 5:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción fuera de rango (1-5).");
                    break;
            }
        }

        scanner.close();
    }
}


                   