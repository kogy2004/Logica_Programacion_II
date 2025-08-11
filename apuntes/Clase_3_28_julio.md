## Ejercicios prácticos

1. Escribe un programa que imprima los números del 1 al 10 usando un ciclo `for`.

2. Crea un programa que solicite 5 números al usuario y los almacene en un arreglo, luego muestre el promedio de esos números.

3. Realiza un programa que cuente cuántos números pares hay en un arreglo de 10 elementos ingresados por el usuario.

4. Escribe un programa que muestre los elementos de un arreglo en orden inverso.
# Clase 3 - 28 julio

## Ciclos

### while

```java
// El ciclo while se usa cuando no sabemos cuántas veces se repetirá el proceso.
while (condicion) {
    // Acciones del ciclo
    // ¡Cuidado! Si la condición nunca es falsa, el ciclo será infinito.
}
```

### for

```java
// El ciclo for es ideal cuando conocemos el número de repeticiones.
for (inicializacion; condicion; incremento) {
    // Acciones del ciclo
}

// Ejemplo:
for (int i = 0; i < 10; i++) {
    System.out.println("Iteración " + i);
}

// inicialización: int i = 0
// condición: i < 10
// incremento: i++ (equivale a i = i + 1)
```

### do...while

```java
// El ciclo do...while garantiza que el bloque se ejecuta al menos una vez.
do {
    // Acciones del ciclo
} while (condicion);
```

## Arreglos (Vectores)

* **Homogéneos:** contiene datos de un mismo tipo (por ejemplo, solo enteros).
* **Ordenados:** cada posición está identificada por un índice (empieza en 0).
* **Finitos:** tiene un tamaño preestablecido que no puede cambiar.

### Definir vectores

// Sintaxis para definir un vector:
Tipo_de_dato nombre_vector[] = new Tipo_de_dato[tamaño];

// Ejemplo:
int vec[] = new int[8]; // Vector de 8 enteros

### Acceder a elementos del vector

// Para asignar un valor a una posición:
nombre_vector[posicion] = valor;

// Ejemplo:
vec[4] = 9; // Asigna 9 a la posición 4

### Llenar un vector

```java
// Llenar un vector con datos ingresados por el usuario
for (int posicion = 0; posicion < tamaño; posicion++) {
    System.out.println("Ingrese el elemento en la posición " + posicion);
    nombre_vector[posicion] = sc.nextInt();
}
```

### Mostrar el vector

```java
// Imprimir todos los elementos del vector
for (int posicion = 0; posicion < tamaño; posicion++) {
    System.out.println(nombre_vector[posicion]);
}
```

// Consejo: Los arreglos tienen tamaño fijo. Si necesitas una colección dinámica, usa ArrayList.
