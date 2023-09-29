## Condicionales

Los condiciones son estructuras de control que nos permiten ejecutar un bloque de código u otro en función de si se cumple o no una condición.

### Operadores de comparación

Los operadores de comparacion basicos son:

- `==` Igual
- `!=` Distinto
- `>` Mayor que
- `<` Menor que
- `>=` Mayor o igual que
- `<=` Menor o igual que
- `in` Contenido 

### If

La estructura `if` es la más básica y nos permite ejecutar un bloque de código si se cumple una condición.

```kotlin
if (condicion) {
    // Bloque de código
}
```

Si la condición es verdadera se ejecutará el bloque de código, si no, no se ejecutará.

```kotlin
if (condicion) {
    // Bloque de código
} else {
    // Bloque de código
}
```

Si la condición es verdadera se ejecutará el primer bloque de código, si no, se ejecutará el segundo.

```kotlin
if (condicion) {
    // Bloque de código
} else if (condicion) {
    // Bloque de código
} else {
    // Bloque de código
}
```

### If como expresión

En kotlin el `if` también se puede utilizar como expresión, es decir, que devuelve un valor.

```kotlin
val condicion = true

val cadena = if (condicion) {
    "Verdadero"
} else {
    "Falso"
}

println(cadena) // Verdadero
```

### Ternario

En kotlin no existe el operador ternario, pero se puede simular con un `if` como expresión.

```kotlin
val condicion = true
val cadena = if (condicion) "Verdadero" else "Falso"
println(cadena) // Verdadero
```

### When

La sentencia `When` es similar a un `switch` en otros lenguajes de programación.

```kotlin
when (variable) {
    valor1 -> {
        // Bloque de código
    }
    valor2 -> {
        // Bloque de código
    }
    valor3 -> {
        // Bloque de código
    }
    else -> {
        // Bloque de código
    }
}
```

Tambien se pueden escribir sin argumento.

```kotlin
val num = 1;
when {
    num == 1 -> {
        // Bloque de código
    }
    num == 2 -> {
        // Bloque de código
    }
    num >= 3 -> {
        // Bloque de código
    }
    else -> {
        // Bloque de código
    }
}
```

### When como expresión

Al igual que el `if`, el `when` también se puede utilizar como expresión.

```kotlin
val variable = 1
val cadena = when (variable) {
    1 -> "Uno"
    2 -> "Dos"
    3 -> "Tres"
    else -> "Otro"
}
println(cadena) // Uno
```
