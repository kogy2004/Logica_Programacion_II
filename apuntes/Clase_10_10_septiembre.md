# Clase 10 - 10 de septiembre

## Clases abstraptas

>Producto.java

```java
public abstract class Producto {

    protected int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public abstract String getName();

    public static void main(String[] args) {
        // Producto p = new Producto(500);
        Banana b = new Banana();
    }
}
```

>Banana.java

```java
public class Banana extends Producto {

    public Banana() {
        super(200);
    }


    @Override
    public String getName() {
        return "Banana";
    }

}
```

## Asociacion

> Sucursal.java

```java
package Relacion_de_asociacion.Ejemplo;

public class Sucursal {

    private int id;
    private String nombre;
    private Vendedor[] vendedor = new Vendedor[10];

    public Sucursal(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Vendedor getVendedor(int posicion) {
        return this.vendedor[posicion];
    }

    public void setVendedor(Vendedor vendedor, int posicion) {
        this.vendedor[posicion] = vendedor;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "id: " + id + ", nombre: " + nombre + ", vendedores: ";
    }

}
```

> Vendedor.java

```java


public class Vendedor {

    private int id;
    private String nombre, apellido;
    private Sucursal sucursal;

    public Vendedor(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        return "id: " + id + ", nombre: " + nombre + ", apellido: " + apellido + ", sucursal: " + sucursal.getNombre();
    }

}
```

> Vinculacion.java

```java
public class Vinculacion {

    public static void main(String[] args) {

        Vendedor vendedor1 = new Vendedor(1, "Adriana", "Arias");

        Vendedor vendedor2 = new Vendedor(2, "Beatriz", "Bonilla");

        Sucursal sucursal1 = new Sucursal(1, "Envigado");

        vendedor1.setSucursal(sucursal1);
        sucursal1.setVendedor(vendedor1, 0);

        vendedor2.setSucursal(sucursal1);
        sucursal1.setVendedor(vendedor2, 1);

        System.out.println(vendedor1.toString());
        System.out.println(vendedor2.toString());

        System.out.print(sucursal1.toString());

        for (int i = 0; i < 2; i++) {
            System.out.print(sucursal1.getVendedor(i).getNombre()+", ");
        }
    }
}
```
