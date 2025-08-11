## Ejercicios prácticos

1. Escribe un programa que lea un número del 1 al 7 y muestre el día de la semana correspondiente usando `switch`.

2. Crea un programa que solicite la calificación de un estudiante y muestre si está aprobado (>=6) o reprobado usando `if`.

3. Realiza un programa que lea tres números y muestre el mayor de ellos usando estructuras condicionales.

4. Escribe un programa que lea la edad de una persona y muestre un mensaje personalizado según el rango de edad (niño, adolescente, adulto, adulto mayor).
# Clase 2 - 23 julio

## Estructuras de control

### switch

```java
// El switch es útil cuando tienes varias opciones posibles para una variable.
// Es más legible que muchos if-else encadenados.
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

// Advertencia: Si olvidas el break, el código "caerá" al siguiente caso (fall-through).

### if

```java
// El if permite tomar decisiones según condiciones lógicas.
if (condicion1) {
    // Acción si la condición1 es verdadera
} else if (condicion2) {
    // Acción si la condición2 es verdadera
} else {
    // Acciones por defecto si ninguna condición se cumple
}
```

// Puedes encadenar varios else if para múltiples condiciones.
// Las variables declaradas dentro de un bloque solo existen en ese bloque.
