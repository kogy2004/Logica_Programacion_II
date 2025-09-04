# Clase 7 - 27 de agosto

## Programación Orientada a Objetos (POO)

La POO es un paradigma que organiza el software en objetos que combinan datos (atributos) y comportamientos (métodos).

### Definir atributos

Los atributos son características específicas de una clase.

#### static

El atributo pertenece a la clase, no a los objetos creados a partir de ella. Se accede usando el nombre de la clase.

#### final

El atributo es una constante, debe tener valor inicial obligatoriamente. Por convención en Java, las constantes se escriben en mayúsculas.

```java
public static final double PI = 3.1416;
```

### Encapsulamiento

Los atributos y métodos forman el objeto. El encapsulamiento permite ocultar los detalles internos y exponer solo lo necesario mediante métodos públicos (getters y setters).

### Ocultamiento

Solo es posible modificar los atributos privados por medio de los métodos del objeto. Así se protege la integridad de los datos.

**Ventajas del encapsulamiento:**

- Seguridad de los datos.
- Flexibilidad para cambiar la implementación interna sin afectar el uso externo.
- Facilita el mantenimiento y la reutilización del código.

### Diagrama de clases UML

Un diagrama UML representa gráficamente la estructura de una clase.

| Producto |
|----------|
| - codigo: String |
| - nombre: String |
| - extensión: Integer |
| - stockMinimo: Integer |
| - stockMaximo: Integer |
| - costo: Double |
| - precio: Double |
| - ganancia: Double |
|----------|
| + actualizarInventario(): Integer |
| + reportarExistencias(): Integer |

> Nota: Los signos "-" y "+" indican visibilidad privada y pública respectivamente.

### Ejemplo de clase en Java

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

### Ejemplo de uso de la clase Empleado

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

        System.out.println("Ingrese la cantidad de empleados");
        ne = sc.nextInt();

        Empleado e[] = new Empleado[ne];

        for (int i = 0; i < ne; i++) {
            System.out.println("Ingrese el DNI del empleado " + (i + 1));
            d = sc.next();
            System.out.println("Ingrese el cargo del empleado " + (i + 1));
            c = sc.next();
            System.out.println("Ingrese el nombre del empleado " + (i + 1));
            n = sc.next();
            System.out.println("Ingrese la dirección del empleado " + (i + 1));
            dir = sc.next();
            System.out.println("Ingrese el año de entrada del empleado " + (i + 1));
            ae = sc.nextInt();
            System.out.println("Ingrese el año de nacimiento del empleado " + (i + 1));
            an = sc.nextInt();
            System.out.println("Ingrese el sueldo básico del empleado " + (i + 1));
            s = sc.nextDouble();
            System.out.println("Ingrese el porcentaje de bonificación del empleado " + (i + 1));
            p = sc.nextDouble();
            e[i] = new Empleado(d, c, n, dir, ae, an, s, p);
        }
        mayorAntiguedad(e);

    }

    public static void mayorAntiguedad(Empleado e[]) {
        int mayorAntiguedad = 0;
        String nombreMayor = "";
        for (Empleado E : e) {
            int antiguedad = E.calcularAntiguedad(aa);
            if (antiguedad > mayorAntiguedad) {
                mayorAntiguedad = antiguedad;
                nombreMayor = E.getNombre();
            }
        }
        System.out.println("El empleado con mayor antigüedad es " + nombreMayor + " que lleva " + mayorAntiguedad + " años en la empresa");
    }
}
```

## Buenas prácticas en POO

- Usa nombres de clases y atributos descriptivos.
- Declara los atributos como privados y proporciona métodos públicos para acceder/modificar.
- Utiliza constantes para valores que no cambian.
- Aplica el encapsulamiento para proteger los datos.
- Documenta las clases y métodos con comentarios claros.

## Resumen

La POO facilita la organización y reutilización del código. El encapsulamiento y el ocultamiento son fundamentales para proteger los datos y mantener la integridad de los objetos. Los diagramas UML ayudan a visualizar la estructura de las clases antes de programar.
