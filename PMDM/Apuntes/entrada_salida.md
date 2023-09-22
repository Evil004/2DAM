## Entrada y salida de datos

### Salida de datos

Para mostrar datos por pantalla se utiliza la función `print()`, `printf()` o `println()`.

```kotlin
// Imprime el texto sin salto de línea
print("Hola mundo")
// Imprime el texto con salto de línea
println("Hola mundo")
// Imprime el texto con formato
printf("Hola mundo %s", "con formato")
```

### Entrada de datos

Se puede leer uan línea de texto con la función `readLine()`.

```kotlin
// Lee una línea de texto
val linea = readLine()
```

Para leer un número se puede utilizar la función `readLine()` o crear un objeto de la clase `Scanner`.

```kotlin
// Lee una línea de texto y la convierte a un número
val numero = readLine()?.toInt()
// Crea un objeto de la clase Scanner
val scanner = Scanner(System.`in`)
// Lee un número
val numero = scanner.nextInt()
```