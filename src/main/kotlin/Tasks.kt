//11. Создайте класс Student,
// который наследуется от класса Person и имеет
// дополнительное свойство studentId.
open class Person(val name: String, var age: Int)
class Student(name: String, age: Int, val studentId: String) : Person(name, age)
//Создайте класс Company, который содержит
// список сотрудников и метод для подсчета общего количества сотрудников.
class Employee(val name: String)
class Company {
    private val employees = mutableListOf<Employee>()
    fun addEmployee(employee: Employee) {
        employees.add(employee)
    }
    fun totalEmployees() = employees.size
}
