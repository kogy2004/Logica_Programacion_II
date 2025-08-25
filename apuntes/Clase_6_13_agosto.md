# Clase 6 - 13 agosto

## ArrayList bidimensionales dinámicos

### llenar Arreglo Bidimensional

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
                System.out.println("Ingresa un numero");
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
                System.out.println("Ingresa un numero");
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

## HashMap

Es una coleccion que relaciona una clave con un valor, donde la clave es un valor unico

### Sintaxis

```java
HashMap <tipo_dato_clave, tipo_dato_valor> nombreHashMap = new HashMap <>();
```

### Metodos mas usados 

#### Put

Para ***actualizar*** un valor de un HashMap la clave. los parametros son **Clave** y **Valor**. En el caso de que la clave ***no exista se creara***. 

#### Get 

Para ***obtener un valor*** de un HashMap dada la **clave**. por ende el parametro es la clave y **retorna el valor** asociado a dicha clave.

#### ContainsKey

Para ***buscar*** en un HashMap dada la **clave**. El parametro es la clave y el **retorno es un booleano**, indicando si la clave existe o no.

#### ContainsValue

Para ***buscar*** en un HashMap dada el **valor**. El parametro es la clave y el **retorno es un booleano**, indicando si el valor existe o no.

#### Remove

Para ***eliminar*** una entrada de un HashMap dada la **clave**. El parametro es la clave del elemento a eliminar.

#### toString

Para ***imprimir*** el contenido del HashMap.

#### Clear

Elimina todas las entradas del HashMap

#### IsEmpty

Devuelve True si el mapa esta vacio

#### KeySet

Devuelve un conjunto de las claves del mapa 

#### Values

Devuelve la coleccion de valores del mapa

#### EntrySet
 
Devuelve una vista de los valores del mapa 

#### size

devuelve el numero de elementos claves valor del hashMap

#### getordefault 

#### putAll

copia todo lo de un mapa en otro 

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
            System.out.println("No se puede introducir el producto. el codigo esta repetido");
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

