# Clase 1 - 21 de julio

## Ejercicios prácticos

1. Escribe un programa que pida al usuario dos números enteros y muestre su suma, resta, multiplicación y división.
2. Crea un programa que solicite el nombre y la edad de una persona, y muestre un mensaje indicando si es mayor de edad.
3. Realiza un programa que lea un número y muestre si es par o impar usando una estructura condicional.
4. Escribe un programa que calcule la potencia de un número usando `Math.pow` y lo muestre por pantalla.
5. Escribe un programa que lea una cadena y muestre cuántos caracteres tiene.
6. Crea un programa que solicite al usuario un carácter y determine si es una vocal o consonante.

## Tipos de datos

* **Enteros:** `int`, `byte`, `short`, `long`  
    Se usan para almacenar números sin decimales. Ejemplo: edad, cantidad de personas.
* **Reales:** `float`, `double`  
    Permiten decimales. Ejemplo: precio, altura.
* **Booleano:** `boolean`  
    Solo puede ser `true` o `false`. Ejemplo: ¿Es mayor de edad?
* **Carácter:** `char`  
    Almacena un solo carácter. Ejemplo: 'A', 'b'.
* **Cadena:** `String`  
    Almacena texto. Ejemplo: nombre, dirección.

> **Nota:** En Java, los tipos primitivos (`int`, `float`, etc.) no son objetos, pero existen clases envolventes como `Integer`, `Float`, etc., que permiten trabajar con ellos como objetos.

## Introducción de entrada por teclado

### Opción 1: Scanner

```java
import java.util.Scanner; // Librería para trabajar con Scanner
Scanner sc = new Scanner(System.in); // Definición y creación del Scanner
int numero = sc.nextInt(); // Leer un entero
boolean respuesta = sc.nextBoolean(); // Leer un booleano
float decimal = sc.nextFloat(); // Leer un real
String texto = sc.nextLine(); // Leer una cadena
```

> **Advertencia:** Si mezclas `nextInt()` y `nextLine()`, puede haber problemas con saltos de línea. Usa `sc.nextLine()` para limpiar el buffer si es necesario.

### Opción 2: JOptionPane

```java
import javax.swing.*; // Librería para cuadros de diálogo
int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
String texto = JOptionPane.showInputDialog("Ingrese su nombre");
```

## Instrucción de salida por pantalla

### Opción 1: Consola

```java
System.out.println("Ingrese el primer número"); // Mostrar un mensaje
System.out.println("El resultado es: " + variable); // Imprimir variable junto al texto
```

### Opción 2: Cuadro de diálogo

```java
JOptionPane.showMessageDialog(null, "El resultado es: " + variable);
```

> **Consejo:** Usa comentarios claros y descriptivos en tu código para facilitar la comprensión.

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
