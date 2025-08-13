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

Es una coleccion que ewlaciona una clave con un valor, donde la clave es un valor unico

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