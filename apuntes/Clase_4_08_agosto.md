## Ejercicios prácticos

1. Crea un programa que permita al usuario agregar nombres a un `ArrayList` y luego mostrar todos los nombres ingresados.

2. Escribe un programa que solicite números al usuario hasta que ingrese -1, los almacene en un `ArrayList` y luego muestre la suma total.

3. Realiza un programa que cree una matriz de 3x3, la llene con números ingresados por el usuario y muestre la suma de cada fila.

4. Escribe un programa que utilice un `HashMap` para almacenar el nombre y la calificación de varios estudiantes, y luego muestre el promedio de las calificaciones.
# Clase 4 - 08 agosto

## ArrayList dinámicos

**Librería:** java.util.ArrayList

// ArrayList es una colección dinámica que permite agregar y quitar elementos fácilmente.
// Es más flexible que los arreglos tradicionales, pero solo puede almacenar objetos.

### Crear

```java
import java.util.ArrayList;
ArrayList<Tipo> nombre = new ArrayList<Tipo>(); // Ejemplo: ArrayList<Integer> lista = new ArrayList<Integer>();
```

### Métodos principales

* `add(elemento)`: insertar un elemento al final, retorna booleano
* `add(posición, elemento)`: insertar en posición específica
* `remove(posición)`: borra la posición indicada
* `remove(elemento)`: borra el elemento indicado
* `clear()`: limpia el ArrayList
* `size()`: devuelve el número de elementos
* `get(posición)`: devuelve el elemento en la posición indicada
* `iterator()`: devuelve un iterador para recorrer el ArrayList
* `isEmpty()`: indica si el ArrayList está vacío
* `indexOf(elemento)`: devuelve la primera posición del elemento
* `contains(elemento)`: comprueba si el ArrayList contiene el elemento
* `toString()`: devuelve una cadena con el ArrayList
* `lastIndexOf(elemento)`: devuelve la última posición del elemento
* `set(posición, elemento)`: reemplaza el elemento en la posición indicada

// Consejo: Si necesitas almacenar tipos primitivos, usa sus clases envolventes (Integer, Double, etc.)

## Arrays bidimensionales y HashMap

### Definir matriz

```java
// Definir una matriz (arreglo bidimensional)
Tipo_de_dato nombre_matriz[][] = new Tipo_de_dato[numFilas][numCols];

// Ejemplo:
int matriz[][] = new int[numFilas][numCols];
```

### Acceder a un elemento

```java
// Acceder a un elemento de la matriz
matriz[fila][columna];

// Ejemplo:
matriz[0][0]; // Primer elemento
```

### Llenar una matriz

```java
// Llenar una matriz con datos ingresados por el usuario
for (int i = 0; i < numFilas; i++) {
    for (int j = 0; j < numCols; j++) {
        System.out.println("Ingrese un número en la fila " + i + " columna " + j);
        matriz[i][j] = sc.nextInt();
    }
}
```

### Imprimir una matriz

```java
// Imprimir todos los elementos de la matriz
for (int i = 0; i < numFilas; i++) {
    for (int j = 0; j < numCols; j++) {
        System.out.print(matriz[i][j] + " ");
    }
    System.out.println(); // Salto de línea al terminar cada fila
}
```

### Ejemplo completo

```java
// Ejemplo completo: Llenar, mostrar y sumar los elementos de una matriz
package logica_ii;

import java.util.Scanner;

public class NewClass {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int f, c;

        System.out.println("Ingresa el número de filas de la matriz ");
        f = sc.nextInt();

        System.out.println("Ingresa el número de columnas de la matriz ");
        c = sc.nextInt();

        int mat[][] = new int[f][c];

        llenar_matriz(mat); // Llenar la matriz con datos
        System.out.println("Matriz");

        mostrar_matriz(mat); // Mostrar la matriz
        sumar_matriz(mat); // Sumar los elementos
    }

    // Llenar la matriz
    public static void llenar_matriz(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.println("Ingrese un número en la fila " + i + " columna " + j);
                a[i][j] = sc.nextInt();
            }
        }
    }

    // Mostrar la matriz
    public static void mostrar_matriz(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Sumar los elementos de la matriz
    public static void sumar_matriz(int a[][]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                sum += a[i][j];
            }
        }
        System.out.println("La suma de los elementos de la matriz es " + sum);
    }
}
```

// Consejo: Si necesitas asociar claves y valores, usa HashMap.
