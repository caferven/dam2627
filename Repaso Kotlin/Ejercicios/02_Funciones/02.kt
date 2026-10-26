/*
 * Implementa `greet`, que devuelve un saludo. El parámetro `greeting` tiene
 * "Hola" como valor por defecto.
 *
 * Después, en `main`, asigna a `third` la llamada que saluda a "Eva" con "Qué tal".
 *
 * Salida esperada:
 *   Hola, Ana!
 *   Buenas, Luis!
 *   Qué tal, Eva!
 */

fun greet(name: String, greeting: String = "Hola"): String = TODO()

fun main() {
    val first = greet("Ana")
    val second = greet("Luis", "Buenas")
    val third: String = TODO()

    println(first)
    println(second)
    println(third)
}
