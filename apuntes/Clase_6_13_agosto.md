# Clase 6 - 13 de agosto

## ArrayList bidimensionales dinámicos

Un ArrayList bidimensional es una estructura que permite almacenar listas dentro de listas, simulando una matriz pero con tamaño dinámico.

### Llenar Arreglo Bidimensional

```java
import java.util.ArrayList;
import java.util.Scanner;

public class llenarArregloBidimensional {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<ArrayList> Matriz = new ArrayList<>();

        System.out.println("Ingrese el numero de filas");
        int n = sc.nextInt();
        System.out.println("Ingrese el numero de columnas");
        int m = sc.nextInt();

        llenas_matriz(Matriz, n, m);
        System.out.println("Matriz");
        System.out.println(Matriz.toString());
    }

    public static void llenas_matriz(ArrayList<ArrayList> v, int n, int m) {
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> vectorFila = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                System.out.println("Ingresa un número");
                vectorFila.add(sc.nextInt());
            }
            v.add(vectorFila);
        }
    }
}
```

```java
import java.util.ArrayList;
import java.util.Scanner;

public class arreglosBidimensionalesDinamicos {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<ArrayList> Matriz = new ArrayList<>();
        ArrayList lista = new ArrayList<>();

        System.out.println("Ingrese el numero de filas");
        int n = sc.nextInt();

        System.out.println("Ingrese el numero de columnas");
        int m = sc.nextInt();

        llenas_matriz(Matriz, n, m);
        System.out.println("Matriz");
        System.out.println(Matriz.toString());

        matrizEnLista(Matriz, n, m, lista);
        System.out.println("Vector");
        System.out.println(lista.toString());
    }

    public static void llenas_matriz(ArrayList<ArrayList> v, int n, int m) {
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> vectorFila = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                System.out.println("Ingresa un número");
                vectorFila.add(sc.nextInt());
            }
            v.add(vectorFila);
        }
    }

    public static void matrizEnLista(ArrayList<ArrayList> v, int n, int m, ArrayList l) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ArrayList a = v.get(i);
                Object o = a.get(j);
                l.add(o);
            }
        }
    }
}
```

> **Nota:** Es recomendable usar tipos genéricos en las declaraciones de ArrayList para evitar advertencias y errores de tipo.

### Convertir matriz en lista

```java
public static void matrizEnLista(ArrayList<ArrayList> v, int n, int m, ArrayList l) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            ArrayList a = v.get(i);
            Object o = a.get(j);
            l.add(o);
        }
    }
}
```

**Ventajas de ArrayList bidimensional:**

- Permite modificar el tamaño de filas y columnas en tiempo de ejecución.
- Es útil para almacenar datos tabulares cuando no se conoce el tamaño previamente.

## HashMap

Un HashMap es una colección que relaciona una clave única con un valor. Es útil para búsquedas rápidas y asociaciones.

### Sintaxis

```java
HashMap<TipoClave, TipoValor> nombreHashMap = new HashMap<>();
```

### Métodos más usados

- **put(clave, valor):** Inserta o actualiza un valor asociado a una clave.
- **get(clave):** Obtiene el valor asociado a la clave.
- **containsKey(clave):** Verifica si la clave existe.
- **containsValue(valor):** Verifica si el valor existe.
- **remove(clave):** Elimina la entrada por clave.
- **toString():** Imprime el contenido del HashMap.
- **clear():** Elimina todas las entradas.
- **isEmpty():** Devuelve `true` si el mapa está vacío.
- **keySet():** Devuelve el conjunto de claves.
- **values():** Devuelve la colección de valores.
- **entrySet():** Devuelve una vista de los pares clave-valor.
- **size():** Devuelve el número de elementos.
- **getOrDefault(clave, valorPorDefecto):** Devuelve el valor asociado a la clave o el valor por defecto si no existe.
- **putAll(otroMapa):** Copia todo el contenido de otro mapa.

> **Consejo:** Las claves deben ser únicas. Si agregas una clave existente, su valor se sobrescribe.

### Ejemplo de uso de HashMap

```java
package javaapplicationk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class NewClass1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        HashMap<String, Float> productos = new HashMap<>();
        int opcion = 0;
        float precio;
        String codigo;

        while (opcion != 5) {
            System.out.println("Introduce el numero de la opcion que quieras: ");
            System.out.println("1. Introducir producto");
            System.out.println("2. Modificar precio");
            System.out.println("3. Mostrar todos los productos");
            System.out.println("4. Eliminar producto");
            System.out.println("5. salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el codigo del producto");
                    codigo = sc.next();
                    System.out.println("Introduce el precio del producto");
                    precio = sc.nextFloat();
                    guardarProducto(codigo, precio, productos);
                    break;

                case 2:
                    System.out.println("Introduce el codigo del productodel que quieres cambiar el precio ");
                    codigo = sc.next();
                    modificarPrecio(codigo, productos);
                    break;
                case 3:
                    // mostrarProductos(productos);
                    System.out.println(productos.toString());
                    break;

                case 4:
                    System.out.println("Introduce el codigo del producto a eliminar");
                    codigo = sc.next();
                    eliminarProducto(codigo, productos);
                    break;
                case 5:
                    System.out.println("Ha salido del sistema");
                default:
                    System.out.println("Ingresa una opcion valida");
            }
        }
    }

    private static void guardarProducto(String codigo, float precio, HashMap<String, Float> productos) {
        if (!productos.containsKey(codigo)) {
            productos.put(codigo, precio);
        } else {
            System.out.println("No se puede introducir el producto. El código está repetido.");
        }
    }

    private static void modificarPrecio(String codigo, HashMap<String, Float> productos) {
        if (productos.containsKey(codigo)) {
            System.out.println("Ingresa el nuevo precio: ");
            productos.put(codigo, sc.nextFloat());
        } else {
            System.out.println("No se puede introducir el producto. el codigo no existe");
        }
    }

    private static void mostrarProductos(HashMap<String, Float> productos) {
        String clave;
        Iterator<String> listaClavesProductos = productos.keySet().iterator();
        while (listaClavesProductos.hasNext()) {
            clave = listaClavesProductos.next();
            System.out.println(clave + " " + productos.get(clave));
        }
    }

    private static void eliminarProducto(String codigo, HashMap<String, Float> productos) {
        if (productos.containsKey(codigo)) {
            productos.remove(codigo);
        } else {
            System.out.println("No existe este producto");
        }
    }
}
```

**Buenas prácticas:**

- Usa tipos genéricos en HashMap para evitar errores de tipo.
- Valida la entrada del usuario antes de agregar o modificar datos.
- Utiliza métodos como `containsKey` para evitar duplicados.

## Resumen

- Los ArrayList bidimensionales permiten trabajar con matrices dinámicas.
- HashMap es ideal para almacenar pares clave-valor y realizar búsquedas rápidas.
- Es importante validar los datos y usar los métodos adecuados para manipular las colecciones.
