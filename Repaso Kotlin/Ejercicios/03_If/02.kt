/*
 * Asigna a `description`:
 *   - menos de 10 grados  -> "frío"
 *   - menos de 25 grados  -> "templado"
 *   - en otro caso        -> "caliente"
 *
 * Salida esperada:
 *   5 grados es frío
 *   18 grados es templado
 *   31 grados es caliente
 */

fun describe(temperature: Int): String {
    val description = TODO()
    return "$temperature grados es $description"
}

fun main() {
    println(describe(5))
    println(describe(18))
    println(describe(31))
}
