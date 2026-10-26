/*
 * Implementa `maxOf` en una sola línea usando `if`.
 * La versión de tres parámetros ya está hecha y reutiliza la tuya.
 *
 * Salida esperada:
 *   7
 *   -1
 */

fun maxOf(a: Int, b: Int): Int = TODO()

fun maxOf(a: Int, b: Int, c: Int): Int = maxOf(maxOf(a, b), c)

fun main() {
    println(maxOf(3, 7))
    println(maxOf(-5, -1, -3))
}
