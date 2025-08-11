<!--
Este programa solicita al usuario el tamaño de una matriz cuadrada, pide los valores de cada elemento,
muestra la matriz y calcula la multiplicación de los elementos de la diagonal principal.
-->

```java
package javaapplicationk;

import javax.swing.JOptionPane;

// Clase que maneja la creación de una matriz cuadrada, su llenado, visualización y la multiplicación de su diagonal principal.
public class multiplicarDiagonalCuadrosDialogo {

    public static void main(String[] args) {
        int n, m;
        // Solicita al usuario el tamaño de la matriz cuadrada
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de filas o de columnas de la mtriz"));
        int mat[][] = new int[n][n];
        llenar_matriz(mat); // Llenar la matriz con valores ingresados por el usuario
        mostrar_matriz(mat); // Mostrar la matriz en un cuadro de diálogo
        m = multiplicar_diagonal(mat); // Calcular la multiplicación de la diagonal principal
        JOptionPane.showMessageDialog(null, "la multiplicacion de los elementos en la diagonal de la matriz es " + m);
    }

    // Llena la matriz con valores proporcionados por el usuario
    public static void llenar_matriz(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese un numero en la fila " + i + " columna " + j));
            }
        }
    }

    // Muestra la matriz en un cuadro de diálogo
    public static void mostrar_matriz(int a[][]) {
        String cad = "";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                cad += Integer.toString(a[i][j]);
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
