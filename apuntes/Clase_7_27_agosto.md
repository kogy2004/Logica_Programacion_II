# Clase 7 - 27 agosto

## POO

### definir atributos

son caracteristicas especificas del artibuto

#### Static

El atributo pertenece a la clase, no alos onjetos creados a partir de ella

#### final

El atributo es una constante, en ese caso debe de tener balor inicial obligatoriamente. por convencion en java las constantes se ecriben en mayusculas

### encapsulamiento 

atributos y metodos forman el objeto 

### ocultamiento 

solo es posible modificar esos atributos por medio de los metodos de el objeto, nada mas lo pueden manipular 

### Diagrama de clases UML
| producto |
|-------|
| - Codigo: string |
| - Nombre: string |
| - Extencion: interger |
| - Stock minimo: interger |
| - Stock maximno: interger |
| - Costo: decimal |
| - Precio: decimal |
| - Ganancia: decimal |
|-------|
| + actualizarInventario(): integer|
| + reportarExixtencias(): interger|



```java

package javaapplicationk;

public class Empleado {

    private String dni, cargo, nombre, direccion;
    private int añoEntrada, añoNacimiento;
    private Double sueldo, porcentajeBonificacion;

    public Empleado() {
    }

    public Empleado(String dni, String cargo, String nombre, String direccion, int añoEntrada, int añoNacimiento, Double sueldo, Double porcentajeBonificacion) {
        this.dni = dni;
        this.cargo = cargo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.añoEntrada = añoEntrada;
        this.añoNacimiento = añoNacimiento;
        this.sueldo = sueldo;
        this.porcentajeBonificacion = porcentajeBonificacion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAñoEntrada() {
        return añoEntrada;
    }

    public void setAñoEntrada(int añoEntrada) {
        this.añoEntrada = añoEntrada;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public Double getPorcentajeBonificacion() {
        return porcentajeBonificacion;
    }

    public void setPorcentajeBonificacion(Double porcentajeBonificacion) {
        this.porcentajeBonificacion = porcentajeBonificacion;
    }

    public int calcularAntiguedad(int añoActual) {
        return añoActual - añoEntrada;
    }

    public int calcularEdad(int añoActual) {
        return añoActual - añoNacimiento;
    }

    public Double calcularSueldo() {
        return sueldo + sueldo * porcentajeBonificacion / 100;
    }

}
```


```java
package javaapplicationk;

import java.util.Scanner;

public class Empresa {

    static String mn = "";
    static double m = 0;
    static int aa = 2025;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String d, c, n, dir;
        int ne, ae, an;
        Double s, p;

        System.out.println("ingrese la cantidad de empleados");
        ne = sc.nextInt();

        Empleado e[] = new Empleado[ne];

        for (int i = 0; i < ne; i++) {
            System.out.println("ingrese el dni del empleado" + (i + 1));
            d = sc.next();
            System.out.println("ingrese el cargo del empleado" + (i + 1));
            c = sc.next();
            System.out.println("ingrese el nombre del empleado" + (i + 1));
            n = sc.next();
            System.out.println("ingrese la direccion del empleado" + (i + 1));
            dir = sc.next();
            System.out.println("ingrese el año de entrada del empleado" + (i + 1));
            ae = sc.nextInt();
            System.out.println("ingrese el año de nacimiento del empleado" + (i + 1));
            an = sc.nextInt();
            System.out.println("ingrese el sueldo basico del empleado" + (i + 1));
            s = sc.nextDouble();
            System.out.println("ingrese el porcentaje de bonificacion del empleado" + (i + 1));
            p = sc.nextDouble();
            e[i] = new Empleado(d, c, n, dir, ae, an, s, p);
        }
        mayorAntiguedad(e);

    }

    public static void mayorAntiguedad(Empleado e[]) {
        for (Empleado E : e) {
            if (E.calcularAntiguedad(aa) > m) {
                m = E.calcularAntiguedad(aa);
                mn = E.getNombre();
            }
        }
        System.out.println("El empleado con mayor antiguedad es " + mn + " que lleva " + mn + " años en la empresa");
    }
}
```
