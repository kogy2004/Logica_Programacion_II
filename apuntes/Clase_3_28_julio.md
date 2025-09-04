# Clase 3 - 28 de julio

## Ejercicios prácticos

1. Escribe un programa que imprima los números del 1 al 10 usando un ciclo `for`.

2. Crea un programa que solicite 5 números al usuario y los almacene en un arreglo, luego muestre el promedio de esos números.

3. Realiza un programa que cuente cuántos números pares hay en un arreglo de 10 elementos ingresados por el usuario.

4. Escribe un programa que muestre los elementos de un arreglo en orden inverso.

## Ciclos

### while

El ciclo `while` se usa cuando no sabemos cuántas veces se repetirá el proceso.

```java
while (condicion) {
    // Acciones del ciclo
    // ¡Cuidado! Si la condición nunca es falsa, el ciclo será infinito.
}
```

**Ejemplo práctico:**

```java
int contador = 1;
while (contador <= 5) {
    System.out.println("Contador: " + contador);
    contador++;
}
```

### for

El ciclo `for` es ideal cuando conocemos el número de repeticiones.

```java
for (inicializacion; condicion; incremento) {
    // Acciones del ciclo
}
```

**Ejemplo práctico:**

```java
for (int i = 1; i <= 10; i++) {
    System.out.println("Número: " + i);
}
```

- **Inicialización:** int i = 1
- **Condición:** i <= 10
- **Incremento:** i++ (equivale a i = i + 1)

### do...while

El ciclo `do...while` garantiza que el bloque se ejecuta al menos una vez.

```java
do {
    // Acciones del ciclo
} while (condicion);
```

**Ejemplo práctico:**

```java
int opcion;
do {
    System.out.println("Menú principal");
    // ...mostrar opciones...
    opcion = sc.nextInt();
} while (opcion != 0);
```

## Arreglos (Vectores)

- **Homogéneos:** contienen datos de un mismo tipo (por ejemplo, solo enteros).
- **Ordenados:** cada posición está identificada por un índice (empieza en 0).
- **Finitos:** tienen un tamaño preestablecido que no puede cambiar.

### Definir vectores

Sintaxis para definir un vector:

```java
Tipo_de_dato nombre_vector[] = new Tipo_de_dato[tamaño];
```

**Ejemplo:**

```java
int vec[] = new int[8]; // Vector de 8 enteros
```

### Acceder a elementos del vector

Para asignar un valor a una posición:

```java
nombre_vector[posicion] = valor;
```

**Ejemplo:**

```java
vec[4] = 9; // Asigna 9 a la posición 4
```

### Llenar un vector

Llenar un vector con datos ingresados por el usuario:

```java
for (int posicion = 0; posicion < tamaño; posicion++) {
    System.out.println("Ingrese el elemento en la posición " + posicion);
    nombre_vector[posicion] = sc.nextInt();
}
```

### Mostrar el vector

Imprimir todos los elementos del vector:

```java
for (int posicion = 0; posicion < tamaño; posicion++) {
    System.out.println(nombre_vector[posicion]);
}
```

### Recorrer un arreglo en orden inverso

**Ejemplo:**

```java
for (int i = tamaño - 1; i >= 0; i--) {
    System.out.println(nombre_vector[i]);
}
```

> **Consejo:** Los arreglos tienen tamaño fijo. Si necesitas una colección dinámica, usa `ArrayList` en Java.

## Resumen

Los ciclos (`while`, `for`, `do...while`) permiten repetir acciones de manera controlada. Los arreglos son estructuras fundamentales para almacenar y manipular conjuntos de datos del mismo tipo. Es importante elegir el ciclo y la estructura adecuada según el problema a resolver.
