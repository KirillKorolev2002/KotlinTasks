//11. Создайте класс Student,
// который наследуется от класса Person и имеет
// дополнительное свойство studentId.
open class Person(val name: String, var age: Int)
class Student(name: String, age: Int, val studentId: String) : Person(name, age)
