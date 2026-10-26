/*
 * Un empleado puede tener departamento (o no),
 * el departamento puede tener jefe (o no)
 * y el jefe puede tener nombre (o no).
 *
 * Implementa `headName` en una sola línea encadenando safe calls `?.`.
 *
 * Salida esperada:
 *   Maria
 *   null
 *   null
 */

class Person(val name: String?)
class Department(val head: Person?)
class Employee(val department: Department?)

fun headName(employee: Employee): String? = TODO()

fun main() {
    println(headName(Employee(Department(Person("Maria")))))
    println(headName(Employee(Department(null))))
    println(headName(Employee(null)))
}
