
> recursividad.java

```java

package javaapplication10;

import java.util.Scanner;

public class AboslutoRecursivo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        int n = sc.nextInt();

        System.out.println("El valor absoluto de " + n + " es: " + valorAbsoluto(n));
    }

    private static int valorAbsoluto(int n) {
        if (n < 0) {
            return negativo(n);
        } else {
            return n;
        }
    }

    private static int negativo(int n) {
        return valorAbsoluto(-n);
    }
}
```
