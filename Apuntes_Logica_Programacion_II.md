# Notas_Logica_Programacion_II

## Clase 1 _ 21-julio

### Tipos de datos

* Entros: int, bute, short, lon
* Real: float, double
* Booleano: boolean
* Caracter: char
* Cadena: string

### Introduccion de entrada por teclado

#### Opcion #1

impor java.util.Scanner; // ***libreria para trabajar con el Scanner***

Scanner sc = new Scanner(System.in); // ***Definicion y creacion del Scanner***

< variable > = sc.nextInt(); // Para leer un entero

< variable > = sc.nextBoolean(); // Para leer un Booleano

< variable > = sc.nextFloat(); // Para leer un Real

#### Opcion #2

impor javax.swing.* // ***Libreria para cuadros de dialogo***

< variable > = interger.**parse**Int(JOptionPane.showInputDialog("< mensaje >"));

parse es para trasformar al tipo desesado

< variable > = JOptionPane.showInputDialog("< mensaje >");

### Instruccion de salida por pantalla

#### Opcion #1

Sistem.out.print**ln**("Ingrese el primer numero "); // ***mostrar un mensaje***

Sistem.out.print**ln**("Ingrese el primer numero " + variable);

***ln*** permite hacer un salto de line despues de imprimir el texto

#### Opcion #2

JOptionPane.showMessageDialog(null , "< mensaje >");

Operasionde asignacion (=)

< variable > = < variable >

### Funciones aritmeticas

* suma (+)

* Resta (-)

* etc....

potenciacion (**Math**.pow(base, exponente))

**Math** contiene muchas operaciones matematicas

### Operaciones logicos

* Not (!)

* And (&&)

* or (||)

### estructura selectiva simple

```java
if ( < condicion > ){
    < accion >;
}
```

### estructura selectiva doble

```java
if ( < condicion > ){
    < accion >;}
else{
    < accion >;}
```


### codigo inicial

```java
package pruebainicial;

import java.util.Scanner;
public class PruebaInicial {
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int x, y, z; 
        
        System.out.println("Ingresa el primer numero");
        
        x = sc.nextInt();
        
        System.out.println("ingrese el segundo numero");
        
        y = sc.nextInt();
        
        z = x + y;
        
        System.out.println("El resultado es " + z);
    }
    
}
```

```java

package pruebainicial;

import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        int x, y;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        if (x>0) {y = x*2;}
        else{ y = x*x; }
        
        JOptionPane.showMessageDialog(null, "El resultado es: " + y );
    }
}
```

## Clase_2-23_julio

### estructuras de control

#### swith

```java
swith(<exprecion>){
case<valor 1>: <Accion 1>;
            Breack;
case<valor 2>: <Accion 2>;
            Breack;
case<valor 3>: <Accion 3>;
            Breack;
case<valor 4>: <Accion 4>;
            Breack;

default: <Acciones por defecto>;
}
```

#### if

```java
if(<condicion 1>){
    <Accion 1>;}
else if(Condicion 2) {
    <Accion 1>;}
else {
    return
}
```

## Clase_3-28_julio
### Cilcos
#### while

```java
while(<condicion>){
    <Acciones del ciclo>;
}
```

#### for

```java
for(<inicializacion>; <condicion>; <incremento>){
    <acciones del ciclo>;
}

inicializacion: <contador> = <valor inicial>

condicion: <contador><operador relacional><valor final>

incremento: <contador> = <contador> + <valor incremento> o <contador> <expresion de incremento>

```

#### do...while

```java
do{
    <Acciones del ciclo>;
}while(<condicion>);
```

### Arreglos (Vectores)

* Homogeneos: contiene datso de un mismo tipo
* Ordenados: Cada posicion esta identificada por un indice
* Finitos: Tiene un tamaño prestablecido

#### Definir Vectores

**Tipo_de_dato nombre_vector[] = new tipo_de_dato[tamaño];**

```java
int vec[]= new int[8];
```

#### Acceder a elementos del vector 

**Nombre_vector[posicion] = valor** 

```java
vec[4] = 9
```

#### llenar un vector 

```java
for(int posicion=0; posicion<tamaño; posicion++){
    System.out.println("Ingrese el elemento en la posicion " + posicion);
    nombre_vector[posicion] = sc.nextInt();
}
```

#### mostrar el vector 

```java
for(int posicion=0; posicion<tamaño; posicion++){
    System.out.println(nombre_vector[posicion]);
}
```

## clase_4-08_agosto

### Array list dinamicos 

**libreria** java.util.ArrayList

#### crear 

```java
ArrayList<clase> nombre = new ArrayList<clase>();
```

#### parametros 

* **add** < elemento >, insertar un elemento, retorna un booleano indicando si funciono 
* **add** < posicion > < elemento >, al ingrsar dos parametors, retorna un booleano indicando si funciono

* **remove** < posicion >, borra la pocision indicada
* **remove** < elemento >, borra un elemento indicado

* **clear** limpia los < elemento > del array

* **size** Devuelve el numero de < elemento >

* **get** < posicion >, devuleve le elemtonto en la posicion indicada

* **itertor** devuleve un interador para recorrer el ArrayList

* **isEmpty** indica si el ArrayList esta o no vacia

* **indexOf** < elemento >, Devuleve la primera posicion del elemento puesto como parametro 

* **contains** < elemento >, comprueba si el array contiene el elemento a buscar 

* **toString** devuelve una cadena con el array

* **lastindexOF** < elemento >, Devuleve la ultima posicion del elemento puesto como parametro  

* **set** < posicion> < elemento >, reemplaza el elemento em la posicion indicada por el nuevo elemento especificado 


### Array bidimensionales y HashMap

#### como definirla 

```java
Tipo_de_dato nombre_matriz[][]= new Tipo_de_dato[numfilas][numcols];

// ejemplo

int Matriz[][] = new int[numfilas][numcols];
```

#### acceder a un elemento 

```java
Matriz[fila][columna]

// ejemplo

matriz[0][0]
```

#### llenar una matriz

```java
for (int i = 0; i < numfilas; i++) {
            for (int j = 0; j < numcols; j++) {
                System.out.println("Ingrese un numero");
                matriz[i][j] = sc.nextInt();
            }
        }

```
#### Imprimir una matriz
```java
for (int i = 0; i < numfilas; i++) {
            for (int j = 0; j < numcols; j++) {
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println();
        }

```
```java

package logica_ii;

import java.util.Scanner;

public class NewClass {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int f, c;

        System.out.println("Ingresa el numero de filas de la matriz ");
        f = sc.nextInt();

        System.out.println("Ingresa el numero de columnas de la matriz ");
        c = sc.nextInt();

        int mat[][] = new int[f][c];

        llenar_matiz(mat);
        System.out.println("Matriz");

        mostrar_matriz(mat);
        sumar_matiz(mat);
    }

    public static void llenar_matiz(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.println("Ingrese un numero en la fila " + i + " columna " + j);
                a[i][j] = sc.nextInt();
            }
        }
    }

    public static void mostrar_matriz(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void sumar_matiz(int a[][]) {
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
