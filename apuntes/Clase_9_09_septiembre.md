# Clase 9 - 09 de septiembre

> Bliblioteca.java
````java
package ejercicioBiblioteca;

import javax.swing.*;
import java.util.ArrayList;

public class Bliblioteca {

    static ArrayList<Publicacion> p = new ArrayList<>();

    public static void main(String[] args) {
        int op = 1;
        while (op == 1 || op == 2) {
            switch (op) {
                case 1:
                    ingresoDatos();

                    break;
                case 2:
                    mostrarDatos();
            }
            op = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 para agregar una publicacion o 2 para mostrar la informacion de las publicaciones"));
        }
    }

    private static void ingresoDatos() {
        String titulo;
        int año, tipo, codigo, numero;

        tipo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de publicacion: \n1 si es libro \n2 si es revistas"));

        codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el CODIGO de publicacion"));
        titulo = JOptionPane.showInputDialog("Ingrese el TITULO de publicacion");
        año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el AÑO de publicacion"));

        if (tipo == 1) {
            p.add(new Libro(codigo, año, titulo));
        }
        if (tipo == 2) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el NUMERO de la revista"));
            p.add(new Revista(numero, codigo, año, titulo));
        }
    }

    private static void mostrarDatos() {
        String cadena = "Publicaciones registradas";
        for (int i = 0; i < p.size(); i++) {
            cadena += "\n" + p.get(i).toString();
        }
        JOptionPane.showMessageDialog(null, cadena);

    }
}

````

> Publicacion.java
````java
package ejercicioBiblioteca;

public class Publicacion {

    protected int codigo, año;
    protected String titulo;

    public Publicacion(int codigo, int año, String titulo) {
        this.codigo = codigo;
        this.año = año;
        this.titulo = titulo;
    }

    public Publicacion() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "publicacion{" + "codigo=" + codigo + ", a\u00f1o=" + año + ", titulo=" + titulo + '}';
    }

}

````

> Libro.java
````java
package ejercicioBiblioteca;

public class Libro extends Publicacion {

    private boolean prestado;

    public Libro(int codigo, int año, String titulo) {
        super(codigo, año, titulo);
        this.prestado = false;
    }

    public void prestar() {
        this.prestado = true;
    }

    public void devolver() {
        this.prestado = false;
    }

    public boolean isPrestado() {
        return prestado;
    }

    @Override
    public String toString() {
        return super.toString() + "Libro{" + "prestado=" + prestado + '}';
    }

}

````

> Revista.java
````java
package ejercicioBiblioteca;

public class Revista extends Publicacion {

    private int numero;

    public Revista(int numero, int codigo, int año, String titulo) {
        super(codigo, año, titulo);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString() + "Revista{" + "numero=" + numero + '}';
    }

}

````

## Conversion entre tipos 

* Conversion hacia arriba 

se asigna lo que hay en un nivel inferior a un nivel superior

* conversion hacia abajo 

se asigna lo que hay en un nivel superior a un nivel inferior

> Profesor.java
```java
package ejercicoProfesor;

public class Profesor {

    protected String nombre;
    protected int edad;

    public Profesor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}
```


> ProfesorInterino.java
```java
package ejercicoProfesor;

public class ProfesorInterino extends Profesor{
    private int meses;

    public ProfesorInterino(int meses, String nombre, int edad) {
        super(nombre, edad);
        this.meses = meses;
    }
}
```


>TestHerencia.java
````java
package ejercicoProfesor;

public class TestHerencia {

    public static void main(String[] args) {
        Profesor profesor1 = new Profesor("Adriana", 35);
        ProfesorInterino interino1 = new ProfesorInterino(10, "Camilo", 40);

        Profesor profesor2 = interino1; 
        
        // Conversion hacia arriba. el supertipo contiene un subtipo . hay perdida de informacion 

        if (profesor2 instanceof ProfesorInterino) {
            System.out.println("Profesor 2 es un objeto de tipo ProfesorInterino");
        }

        if (profesor2 instanceof Profesor) {
            System.out.println("Profesor 2 es un objeto de tipo Profesor");
        }

        if (interino1 instanceof Profesor) {
            System.out.println("Interino1 es un objeto de tipo Profesor");
        }

        if (profesor1 instanceof ProfesorInterino) {
            System.out.println("Profesor 1 es un objeto de atipo ProfesorInterino");
        } else {
            System.out.println("Profesor 1 NO es un objeto de atipo ProfesorInterino");

        }
    }
}
````