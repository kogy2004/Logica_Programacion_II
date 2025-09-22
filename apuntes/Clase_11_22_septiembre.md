# Clase 11 - 22 de septiembre

## Relacion de agregacion

> Punto.java

```java
package Agregacion;

public class Punto {

    private double x, y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }

}
```

> Circunferencia.java

```java

package Agregacion;

public class Circunferencia {

    private double radio;
    private Punto centro;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public double calcularArea() {
        return (Math.PI * Math.pow(radio, 2));
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", centro=" + centro + '}';
    }

}
```

> Prueba.java

```java
package Agregacion;

import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las dos coordenadas del punto: ");

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        Punto p1 = new Punto(x, y);

        System.out.println("Ingrese el radio de la circunferencia: ");

        double radio = sc.nextDouble();

        Circunferencia c1 = new Circunferencia(radio);

        c1.setCentro(p1);

        System.out.println(p1.toString());
        System.out.println(c1.toString());

        System.out.println("El area del circulo es " + c1.calcularArea());
    }
}
```

## Relacion de composicion

es una agregacion ffurtte en la que una instancia "parte" esta relacionada, como maximo, con una instancia "todo", de forma que cuando el objeto todo es eliminado, son eliminadas las partes  

> Pagina.java

```java
package Composicion;

public class Pagina {

    private String contenido;
    private int numero;

    public Pagina(String contenido, int numero) {
        this.contenido = contenido;
        this.numero = numero;
    }

    public String getContenido() {
        return contenido;
    }

    public int getNumero() {
        return numero;
    }

}
```

> Libro.java

```java
package Composicion;

public class Libro {

    private String titulo;
    private String autor;
    private long isbn;
    private int añoPublicacion;

    private Pagina[] paginas;
    private int numeroPaginas;

    public Libro(String titulo, String autor, long isbn, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.añoPublicacion = añoPublicacion;

        this.paginas = new Pagina[50];
        for (int i = 0; i < 50; i++) {
            this.paginas[i] = new Pagina("", 0);

        }
        this.numeroPaginas = 0;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void addPagina(Pagina pagina) {
        if (this.numeroPaginas < 50) {
            this.paginas[this.numeroPaginas] = pagina;
            this.numeroPaginas++;
        }
    }

    public Pagina getPagina(int numeorPagina) {
        for (int i = 0; i < this.numeroPaginas; i++) {
            if (this.paginas[i].getNumero() == numeorPagina) {
                return this.paginas[i];
            }
        }
        return null;
    }

}
```

> EjemploLibroPagina.java

```java
package Composicion;

public class EjemploLibroPagina {

    public static void main(String[] args) {
        Libro l1 = new Libro("Cien años de soledad", "Garcia Marquez", 1234567890, 1967);
        Pagina p1 = new Pagina("Muchoas años despues, frente al peloton de fusilamiento, el coronel aureliano buendia... ", 1);
        Pagina p2 = new Pagina("Lo envio a las autoridades acompañado de numerosos testimonios sobre... ", 2);

        l1.addPagina(p1);
        l1.addPagina(p2);

        for (int i = 1; i <= l1.getNumeroPaginas(); i++) {
                System.out.println(l1.getPagina(i).getContenido());
        }
    }
}

```

## Relacion de dependencia

> Documento.java

```java
package Dependencia;

public class Documento {

    private String texto;

    public Documento(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

}
```

> Impresora.java

```java

package Dependencia;

public class Impresora {

    public void imprimir(Documento documento) {
        System.out.println(documento.getTexto());
    }
}
```

> EjemploImpresosraDocumento.java

```java
package Dependencia;

public class EjemploImpresosraDocumento {

    public static void main(String[] args) {
        Documento d1 = new Documento("Buen dia!");
        Impresora i1 = new Impresora();
        i1.imprimir(d1);
    }
}
```
