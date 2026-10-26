/*
 * Las funciones `check...` imprimen un mensaje cuando la regla falla. Implementa
 * `isValidPassword` de forma que, para una contraseña inválida para todas las reglas,
 * se muestren todos los errores, no solo el primero.
 *
 * Elige entre `&&` y `and`. Prueba también con el otro y compara la salida.
 *
 * Salida esperada:
 *   Comprobando "abc"
 *   - Demasiado corta
 *   - Sin dígito
 *   - Sin letra mayúscula
 *   Inválida
 *   Comprobando "Secret123"
 *   Válida
 */

fun checkLength(password: String): Boolean {
    val ok = password.length >= 8
    if (!ok) println("- Demasiado corta")
    return ok
}

fun checkDigit(password: String): Boolean {
    val ok = password.any { it.isDigit() }
    if (!ok) println("- Sin dígito")
    return ok
}

fun checkUppercase(password: String): Boolean {
    val ok = password.any { it.isUpperCase() }
    if (!ok) println("- Sin letra mayúscula")
    return ok
}

fun isValidPassword(password: String): Boolean =
    TODO()

fun main() {
    for (password in listOf("abc", "Secret123")) {
        println("Comprobando \"$password\"")
        println(if (isValidPassword(password)) "Válida" else "Inválida")
    }
}
