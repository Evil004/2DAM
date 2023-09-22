## Condicionales

Los condiciones son estructuras de control que nos permiten ejecutar un bloque de código u otro en función de si se cumple o no una condición.

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
