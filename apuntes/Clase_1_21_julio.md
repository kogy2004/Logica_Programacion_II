## Ejercicios prácticos

1. Escribe un programa que pida al usuario dos números enteros y muestre su suma, resta, multiplicación y división.

2. Crea un programa que solicite el nombre y la edad de una persona, y muestre un mensaje indicando si es mayor de edad.

3. Realiza un programa que lea un número y muestre si es par o impar usando una estructura condicional.

4. Escribe un programa que calcule la potencia de un número usando `Math.pow` y lo muestre por pantalla.
# Clase 1 - 21 julio

## Tipos de datos

* **Enteros:** `int`, `byte`, `short`, `long`  
    Se usan para almacenar números sin decimales. Ejemplo: edad, cantidad de personas.
* **Reales:** `float`, `double`  
    Permiten decimales. Ejemplo: precio, altura.
* **Booleano:** `boolean`  
    Solo puede ser `true` o `false`. Ejemplo: ¿es mayor de edad?
* **Caracter:** `char`  
    Almacena un solo carácter. Ejemplo: 'A', 'b'.
* **Cadena:** `String`  
    Almacena texto. Ejemplo: nombre, dirección.

## Introducción de entrada por teclado

### Opción #1

// Importar la librería Scanner para leer datos desde la consola
import java.util.Scanner; // Librería para trabajar con Scanner

// Crear el objeto Scanner
Scanner sc = new Scanner(System.in); // Definición y creación del Scanner

// Leer diferentes tipos de datos
int numero = sc.nextInt(); // Leer un entero
boolean respuesta = sc.nextBoolean(); // Leer un booleano
float decimal = sc.nextFloat(); // Leer un real

// ¡Advertencia! Si mezclas nextInt() y nextLine(), puede haber problemas con saltos de línea. Usa sc.nextLine() para limpiar el buffer si es necesario.

### Opción #2

// Importar la librería para cuadros de diálogo
import javax.swing.*; // Librería para cuadros de diálogo

// Leer un entero usando un cuadro de diálogo
int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
// 'parseInt' transforma el texto ingresado en un número entero

// Leer una cadena de texto
String texto = JOptionPane.showInputDialog("Ingrese su nombre");

## Instrucción de salida por pantalla

### Opción #1

System.out.println("Ingrese el primer número"); // Mostrar un mensaje
System.out.println("Ingrese el primer número " + variable); // Imprimir variable junto al texto

// El sufijo 'ln' en println significa "line" y hace un salto de línea después de imprimir el texto

### Opción #2

// Mostrar un mensaje en un cuadro de diálogo
JOptionPane.showMessageDialog(null, "¡Bienvenido!");

## Operación de asignación (=)

// El operador '=' se usa para asignar valores a variables
int x = 5;
String nombre = "Juan";

## Funciones aritméticas

* Suma (+)
* Resta (-)
* Multiplicación (*)
* División (/)
* Módulo (%) // Resto de la división

// Para operaciones avanzadas, usa la clase Math
double resultado = Math.pow(base, exponente); // Potenciación
double raiz = Math.sqrt(numero); // Raíz cuadrada

// Math contiene muchas operaciones matemáticas útiles

## Operadores lógicos

* **Not (!):** Niega una condición. Ejemplo: `!verdadero` es `false`.
* **And (&&):** Ambas condiciones deben ser verdaderas. Ejemplo: `a > 0 && b > 0`.
* **Or (||):** Al menos una condición debe ser verdadera. Ejemplo: `a > 0 || b > 0`.

## Estructura selectiva simple

```java
// Estructura básica de una condición
if (condicion) {
    // Acciones si la condición es verdadera
}
```

## Estructura selectiva doble

```java
if (condicion) {
    // Acciones si la condición es verdadera
} else {
    // Acciones si la condición es falsa
}
```

## Código inicial

```java
// Ejemplo: Sumar dos números ingresados por el usuario
package pruebainicial;

import java.util.Scanner;
public class PruebaInicial {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int x, y, z; 
        
        System.out.println("Ingresa el primer número"); // Solicita el primer número
        x = sc.nextInt(); // Lee el primer número
        
        System.out.println("Ingresa el segundo número"); // Solicita el segundo número
        y = sc.nextInt(); // Lee el segundo número
        
        z = x + y; // Suma los dos números
        System.out.println("El resultado es " + z); // Muestra el resultado
    }
}
```

```java
// Ejemplo: Usar JOptionPane para entrada y salida
package pruebainicial;

import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        int x, y;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número")); // Lee un número
        
        // Estructura condicional para decidir la operación
        if (x > 0) {
            y = x * 2; // Si es positivo, multiplica por 2
        } else {
            y = x * x; // Si es negativo o cero, lo eleva al cuadrado
        }
        
        JOptionPane.showMessageDialog(null, "El resultado es: " + y ); // Muestra el resultado
    }
}
```
