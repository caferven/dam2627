/*
 * `headNameUnsafe` usa `!!` y falla si falta cualquier eslabón de la cadena.
 * Implementa `headNameSafe` con safe calls y devuelve "Sin jefe" cuando no se pueda obtener el nombre.
 *
 * Salida esperada:
 *   Maria
 *   Sin jefe
 *   Sin jefe
 */

class Person(val name: String?)
class Department(val head: Person?)
class Employee(val department: Department?)

fun headNameUnsafe(employee: Employee): String = employee.department!!.head!!.name!!

fun headNameSafe(employee: Employee): String = TODO()

fun main() {
    println(headNameSafe(Employee(Department(Person("Maria")))))
    println(headNameSafe(Employee(Department(Person(null)))))
    println(headNameSafe(Employee(null)))
}
