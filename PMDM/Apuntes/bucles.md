## Bucles

Los bucles son estructuras de control que nos permiten ejecutar un bloque de código varias veces.

### While

La estructura `while` nos permite ejecutar un bloque de código mientras se cumpla una condición.

```kotlin
while (condicion) {
    // Bloque de código
}
```

### Do while

La estructura `do while` es similar a la estructura `while`, pero en este caso el bloque de código se ejecuta al menos una vez, ya que la condición se evalúa al final.

```kotlin
do {
    // Bloque de código
} while (condicion)
```

### For

Los bucles `for` nos permiten recorrer un rango de valores.

```kotlin
val rango = 0..10
for (elemento in rango) {
    // Bloque de código
}
```

Tambien podemos recorrer un rango de valores en orden inverso.

```kotlin
val rango = 10 downTo 0
for (elemento in rango) {
    // Bloque de código
}
```

Ta