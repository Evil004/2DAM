## Variables

Las variables almacenan valores y constan de un nombre, un tipo y un valor.

### Tipos de datos básicos

- **numericos**:
    - **Enteros**
        - **Int** (32 bits) -128..127
        - **Short** (16 bits) -32768..32767
        - **Int** (64 bits) -2147483648..2147483647
        - **Long** (128 bits) -9223372036854775808..9223372036854775807
    - **Decimales**
        - **Float** (32 bits) 
        - **Double** (64 bits) 
- **caracteres**
    - **Char** (16 bits)
- **booleanos**
    - **Boolean** (1 bit)
- **cadenas**
    - **String** (variable)


Las variables en kotlin pueden ser inmutables (`val`), es decir, que una vez asignado un valor no se puede cambiar, o mutables (`var`), que si se puede cambiar el valor.

### Ejemplos

```kotlin
// Variables inmutables
val nombre: String = "Juan"
val edad: Int = 25

// Variables mutables
var nombre: String = "Juan"
nombre = "Pedro"
var edad: Int = 25
edad = 26
```