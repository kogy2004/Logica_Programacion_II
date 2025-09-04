<!--
Este programa solicita al usuario el tamaño de una matriz cuadrada, pide los valores de cada elemento,
muestra la matriz y calcula la multiplicación de los elementos de la diagonal principal.
-->

# Clase 5 - 11 de agosto

## Ejemplo práctico: matriz cuadrada y diagonal principal

Este ejemplo muestra cómo trabajar con matrices cuadradas en Java usando cuadros de diálogo (`JOptionPane`). El programa solicita el tamaño de la matriz, pide los valores de cada elemento, muestra la matriz y calcula la multiplicación de los elementos de la diagonal principal.

**¿Qué es la diagonal principal?**  
En una matriz cuadrada, la diagonal principal está formada por los elementos cuya fila y columna coinciden (por ejemplo, `mat[0][0]`, `mat[1][1]`, ...).

**Recomendaciones:**

- Usar matrices cuadradas para operaciones con diagonales.
- Validar que el tamaño ingresado sea mayor que cero.
- `JOptionPane` permite interacción gráfica sencilla para entrada y salida de datos.

```java
// filepath: vscode-vfs://github/kogy2004/Logica_Programacion_II/apuntes/Clase_5_11_agosto.md
package javaapplicationk;

import javax.swing.JOptionPane;

// Clase que maneja la creación de una matriz cuadrada, su llenado, visualización y la multiplicación de su diagonal principal.
public class MultiplicarDiagonalCuadrosDialogo {

    public static void main(String[] args) {
        int n, m;
        // Solicita al usuario el tamaño de la matriz cuadrada
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de filas o columnas de la matriz"));
        int mat[][] = new int[n][n];
        llenar_matriz(mat); // Llenar la matriz con valores ingresados por el usuario
        mostrar_matriz(mat); // Mostrar la matriz en un cuadro de diálogo
        m = multiplicar_diagonal(mat); // Calcular la multiplicación de la diagonal principal
        JOptionPane.showMessageDialog(null, "La multiplicación de los elementos en la diagonal de la matriz es " + m);
    }

    // Llena la matriz con valores proporcionados por el usuario
    public static void llenar_matriz(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número en la fila " + i + " columna " + j));
            }
        }
    }

    // Muestra la matriz en un cuadro de diálogo
    public static void mostrar_matriz(int a[][]) {
        String cad = "";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                cad += a[i][j] + " ";
            }
            cad += "\n";
        }
        JOptionPane.showMessageDialog(null, cad);
    }

    // Multiplica los elementos de la diagonal principal de la matriz
    public static int multiplicar_diagonal(int a[][]) {
        int multi = 1;
        for (int i = 0; i < a.length; i++) {
            multi *= a[i][i];
        }
        return multi;
    }
}
```

## Resumen

- Las matrices cuadradas permiten trabajar fácilmente con diagonales.
- La diagonal principal se recorre con índices iguales en fila y columna.
- `JOptionPane` facilita la interacción gráfica para entrada y salida de datos.
- Es importante validar la entrada del usuario para evitar errores.
