# Clase 1 _ 21-julio

## Tipos de datos

* Entros: int, bute, short, lon
* Real: float, double
* Booleano: boolean
* Caracter: char
* Cadena: string

## Introduccion de entrada por teclado

### Opcion #1

impor java.util.Scanner; // ***libreria para trabajar con el Scanner***

Scanner sc = new Scanner(System.in); // ***Definicion y creacion del Scanner***

< variable > = sc.nextInt(); // Para leer un entero

< variable > = sc.nextBoolean(); // Para leer un Booleano

< variable > = sc.nextFloat(); // Para leer un Real

### Opcion #2

impor javax.swing.* // ***Libreria para cuadros de dialogo***

< variable > = interger.**parse**Int(JOptionPane.showInputDialog("< mensaje >"));

parse es para trasformar al tipo desesado

< variable > = JOptionPane.showInputDialog("< mensaje >");

## Instruccion de salida por pantalla

### Opcion #1

Sistem.out.print**ln**("Ingrese el primer numero "); // ***mostrar un mensaje***

Sistem.out.print**ln**("Ingrese el primer numero " + variable);

***ln*** permite hacer un salto de line despues de imprimir el texto

JOptionPane.showMessageDialog(null , "< mensaje >");

Operasionde asignacion (=)

< variable > = < variable >

## Funciones aritmeticas

* suma (+)

* Resta (-)

* etc....

potenciacion (**Math**.pow(base, exponente))

**Math** contiene muchas operaciones matematicas

## Operaciones logicos

* Not (!)

* And (&&)

* or (||)

## estructura selectiva simple 

if ( < condicion > ){
    < accion >;
}

estructura selectiva doble

if ( < condicion > ){
    < accion >;}
else{
    < accion >;}

## codigo inicial

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
