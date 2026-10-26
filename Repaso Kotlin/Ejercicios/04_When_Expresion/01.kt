/*
 * Implementa `dayType` con un `when` con argumento usado como expresión:
 *   - del 1 al 5     -> "Entre semana"
 *   - 6 o 7          -> "Fin de semana"
 *   - cualquier otro -> "Día no válido"
 *
 * Salida esperada:
 *   Entre semana
 *   Fin de semana
 *   Día no válido
 */

fun dayType(day: Int): String = TODO()

fun main() {
    println(dayType(3))
    println(dayType(7))
    println(dayType(9))
}
