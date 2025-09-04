# Clase 2 - 23 de julio

## Ejercicios prácticos

1. Escribe un programa que lea un número del 1 al 7 y muestre el día de la semana correspondiente usando `switch`.

2. Crea un programa que solicite la calificación de un estudiante y muestre si está aprobado (>=6) o reprobado usando `if`.

3. Realiza un programa que lea tres números y muestre el mayor de ellos usando estructuras condicionales.

4. Escribe un programa que lea la edad de una persona y muestre un mensaje personalizado según el rango de edad (niño, adolescente, adulto, adulto mayor).

## Estructuras de control

### switch

El `switch` es útil cuando tienes varias opciones posibles para una variable. Es más legible que muchos `if-else` encadenados.

```java
switch (expresion) {
    case valor1:
        // Acción para valor1
        break; // Importante: break evita que se ejecuten los siguientes casos
    case valor2:
        // Acción para valor2
        break;
    // Puedes tener tantos casos como necesites
    default:
        // Acciones por defecto si ningún caso coincide
}
```

> **Advertencia:** Si olvidas el `break`, el código "caerá" al siguiente caso (fall-through).

**Ejemplo práctico:**

```java
int dia = 3;
switch (dia) {
    case 1:
        System.out.println("Lunes");
        break;
    case 2:
        System.out.println("Martes");
        break;
    case 3:
        System.out.println("Miércoles");
        break;
    case 4:
        System.out.println("Jueves");
        break;
    case 5:
        System.out.println("Viernes");
        break;
    case 6:
        System.out.println("Sábado");
        break;
    case 7:
        System.out.println("Domingo");
        break;
    default:
        System.out.println("Número inválido");
}
```

**Recomendaciones:**

- El tipo de la expresión en `switch` debe ser compatible (int, char, String en Java).
- El caso `default` es opcional pero recomendable para manejar valores inesperados.

### if

El `if` permite tomar decisiones según condiciones lógicas.

```java
if (condicion1) {
    // Acción si la condición1 es verdadera
} else if (condicion2) {
    // Acción si la condición2 es verdadera
} else {
    // Acciones por defecto si ninguna condición se cumple
}
```

> Puedes encadenar varios `else if` para múltiples condiciones.
> Las variables declaradas dentro de un bloque solo existen en ese bloque.

**Ejemplo práctico:**

```java
int calificacion = 7;
if (calificacion >= 6) {
    System.out.println("Aprobado");
} else {
    System.out.println("Reprobado");
}
```

**Recomendaciones:**

- Utiliza paréntesis para agrupar condiciones complejas.
- Los operadores lógicos (`&&`, `||`, `!`) permiten combinar varias condiciones.

## Resumen

Las estructuras de control como `switch` e `if` son fundamentales para la toma de decisiones en la programación. Elige la más adecuada según el número de opciones y la claridad del código.
