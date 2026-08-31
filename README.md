# TALLER # 3 - CICLOS
## INTEGRANTES

 - Samuel Rua
 - Emmanuel Giraldo
 ## DESCRIPCIÓN 
 Este taller tiene como objetivo la aplicación de los ciclos para la realización de programas cada vez más complejos que solucionen un problema real y cotidiano, logrando integrar varias funcionalidades en un solo código y programa. A continuación encontrarás programas hechos utilizando la estructura de los ciclos y una presentación que resume todo lo realizado en este taller.
 
![enter image description here](https://www.explicacion.net/wp-content/uploads/2019/01/ciclos-de-programacion.jpg)



## PROGRAMAS:
 ## Calculos.java:
 
 **Descripción del Programa**

Calculadora matemática interactiva de consola en Java que utiliza un menú decorado con arte ASCII y funciona de forma continua.

**Funcionamiento General**

-   **Menú continuo:** Mantiene el programa activo con un bucle `while` hasta seleccionar la opción `5`.
    
-   **Estructura `switch-case`:** Dirige la ejecución al módulo seleccionado por el usuario.
    
-   **Validación de datos:** Evita cierres inesperados usando `scanner.hasNextInt()` si se ingresan caracteres no numéricos.
    
-   **Operaciones:**
    
    -   **Fibonacci:** Bucle `for` para acumular la suma de los términos.
        
    -   **Número primo:** Bucle `while` y contador de divisores usando el operador módulo (`%`).
        
    -   **Ecuación cuadrática:** Aplicación de la fórmula general con `Math.sqrt()`.
        
    -   **Promedio:** Suma acumulada de $n$ datos dividida por el total.
    
    ## JuegoAdivinar.java
   
    Es un juego de adivinanza de números interactivo escrito en **Java**. El programa genera un número aleatorio dentro de un rango definido por el usuario y le da pistas hasta que logre adivinarlo.

**Flujo de funcionamiento**

-   **Configuración del rango:** Solicita al usuario dos enteros: un límite inferior ($n$) y un límite superior ($m$).
    
-   **Generación del número secreto:** Usa la clase `Random` para calcular un número aleatorio en el intervalo inclusivo $[n, m]$ mediante la fórmula `random.nextInt(m - n + 1) + n`.
    
-   **Bucle de juego (`while`):** Se repite continuamente mientras la variable booleana `adivinado` sea `false`:
    
    -   Incrementa el contador `intentos` en 1 con cada intento.
        
    -   Evalúa la entrada del usuario mediante un bloque `if-else`:
        
        -   **Menor que el secreto:** Muestra _"Muy bajo, intenta de nuevo."_
            
        -   **Mayor que el secreto:** Muestra _"Muy alto, intenta de nuevo."_
            
        -   **Igual al secreto:** Cambia `adivinado` a `true`, rompe el bucle y despliega un mensaje de felicitaciones indicando el número secreto y el total de intentos realizados.
  
  ## TablaMultiplicar.java
  
  Este programa en **Java** genera la tabla de multiplicar de cualquier número ingresado por el usuario, mostrando los resultados en consola desde el 1 hasta el 10.

**Estructura y funcionamiento**

-   **Captura de datos:** Utiliza un objeto `Scanner` para leer un número entero desde la consola (`System.in`).
    
-   **Bucle de iteración (`for`):** Ejecuta un ciclo controlado por la variable `i`, la cual se inicializa en `1` y se incrementa de uno en uno hasta llegar a `10`.
    
-   **Cálculo e impresión:** En cada vuelta del bucle, multiplica el número ingresado por el valor actual de `i` (`numero * i`) y muestra la operación formateada en pantalla (por ejemplo, `5 x 1 = 5`).
    
-   **Liberación de recursos:** Finaliza cerrando el scanner mediante `scanner.close()` para evitar fugas de memoria.

## RECURSOS
Presentación canva: https://canva.link/m6uvmedxhp9pmso
    

